package com.mht.file;

import cn.dreampie.ValidateKit;
import com.jfinal.kit.Kv;
import com.jfinal.kit.PathKit;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.upload.UploadFile;
import com.mht.common.CommonController;
import com.mht.common.utils.ConvertUpMoney;
import com.mht.common.utils.DateUtil;
import com.mht.system.service.SiteInfoService;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.format.Alignment;
import jxl.format.Colour;
import jxl.format.VerticalAlignment;
import jxl.write.*;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;
import sun.misc.BASE64Encoder;

import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 文件上传下载
 */
public class FileController extends CommonController {

    static FileService fileService = FileService.me;


    public void upload() {
        UploadFile upload = getFile();
        renderJson();
    }

    public void downloadFile() {
        String fileName = getPara("fileName");
        if(!ValidateKit.isNullOrEmpty(fileName)){
            if(fileName.indexOf("upload/")>=0){
                fileName=fileName.substring(fileName.indexOf("upload/")+"upload/".length());
            }
            if (ValidateKit.isNullOrEmpty(getPara("downloadFileName"))){
                renderFile(fileName);
            }else {
                renderFile(fileName,getPara("downloadFileName"));
            }
        }
    }

    /**
     *外部服务器获取本地图片，传入file_url物理路径
     */
    public void getFileWithOtherSite(){
        Map result=new HashMap();
        try {
            String file_url = getPara("file_url");
            if(ValidateKit.isNullOrEmpty(file_url)){
                result.put("file_data","");
            }else{
                file_url = PathKit.getWebRootPath()+"/"+(file_url.replaceAll("'",""));
                byte[] fileData = Files.readAllBytes(Paths.get(file_url));
                result.put("file_data",new BASE64Encoder().encode(fileData));
            }
        } catch (IOException e) {
            e.printStackTrace();
            result.put("file_data","");
        }
        renderJson();
    }


    /**
     * excel表格导出
     */
    public void downLoadTable() {
        try {
            File file = new File(getPara("sheetName", "导出表格数据") + getYearToDateS() + ".xls");
            WorkbookSettings ws = new WorkbookSettings();
            ws.setEncoding("iso-8859-1");
            WritableWorkbook book = jxl.Workbook.createWorkbook(file, ws);
            WritableSheet sheet = book.createSheet(getPara("sheetName", "导出表格数据"), 0);

            WritableFont bold = new WritableFont(WritableFont.ARIAL, 12);
            WritableCellFormat format = new WritableCellFormat(bold);
            format.setAlignment(jxl.format.Alignment.CENTRE);
            format.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);

            Kv cond = getCond(getParaMap());
            Object all_site = getUserSiteInfo().get("all");
            cond.set("sites_id", all_site);
            cond.set("orgIds", all_site);
            cond.set("org_ids", all_site);

            List exportData = fileService.getExportData(cond);
            sheet.addCell(new Label(0, 0, "一共导出数据：" + exportData.size() + "条；导出日期:" + new SimpleDateFormat("yyyy-MM-dd").format(getNowDate()), format));
            if (ValidateKit.isNullOrEmpty(cond.getStr("keys")) || ValidateKit.isNullOrEmpty(cond.getStr("values"))) {
                String value = "", key = "";
                int columnsLen = 0;
                for (int i = 0, j = 2; exportData != null && i < exportData.size(); i++, j++) {
                    Record record = (Record) exportData.get(i);
                    sheet.setRowView(j, 400, false);
                    Object[] columns = record.getColumns().keySet().toArray();
                    columnsLen = columns.length;
                    for (int col = 0; col < columnsLen; col++) {
                        if (record.get(columns[col].toString()) != null) {
                            if ("class java.sql.Timestamp".equals(record.get(columns[col].toString()).getClass().toString())) {
                                value = record.get(columns[col].toString()).toString();
                                value = value.substring(0, value.indexOf("."));
                            } else {
                                value = record.get(columns[col].toString()).toString();
                            }
                        } else {
                            value = "";
                        }
                        Label label = new Label(col, j, value, format);
                        sheet.addCell(label);
                        sheet.setColumnView(col, 30);
                    }
                }
                sheet.mergeCells(0, 0, columnsLen - 1, 0);
                sheet.setRowView(0, 1000, false);
                sheet.setRowView(1, 500, false);
            } else {
                String[] arrkeys = cond.getStr("keys").split(",");
                String[] arrvalues = cond.getStr("values").split(",");
                sheet.mergeCells(0, 0, arrkeys.length - 1, 0);
                sheet.setRowView(0, 1000, false);
                sheet.setRowView(1, 500, false);
                for (int col = 0; col < arrkeys.length; col++) {
                    Label label = new Label(col, 1, arrvalues[col], format);
                    sheet.addCell(label);
                    sheet.setColumnView(col, 30);
                }
                String value = "", key = "";
                for (int i = 0, j = 2; exportData != null && i < exportData.size(); i++, j++) {
                    Record record = (Record) exportData.get(i);
                    sheet.setRowView(j, 400, false);
                    for (int col = 0; col < arrkeys.length; col++) {
                        if (record.get(arrkeys[col]) != null) {
                            if ("class java.sql.Timestamp".equals(record.get(arrkeys[col]).getClass().toString())) {
                                value = record.get(arrkeys[col]).toString();
                                value = value.substring(0, value.indexOf("."));
                            } else {
                                value = record.get(arrkeys[col]).toString();
                            }
                        } else {
                            value = "";
                        }
                        Label label = new Label(col, j, value, format);
                        sheet.addCell(label);
                    }
                }
            }
            book.write();
            book.close();
            renderFile(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 复制文件
     *
     * @param file    源文件
     * @param newFile 复制到的新文件
     */

    public void fileChannelCopy(File file, File newFile) {
        try {
            InputStream in = null;
            OutputStream out = null;
            try {
                in = new BufferedInputStream(new FileInputStream(file), 1024);
                out = new BufferedOutputStream(new FileOutputStream(newFile), 1024);
                byte[] buffer = new byte[1024];
                int len;
                while ((len = in.read(buffer)) != -1) {
                    out.write(buffer, 0, len);
                }
            } finally {
                if (null != in) {
                    in.close();
                }
                if (null != out) {
                    out.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void copyFileUsingFileStreams(File source, File dest) throws IOException {
        InputStream input = null;
        OutputStream output = null;
        try {
            input = new FileInputStream(source);
            output = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buf)) > 0) {
                output.write(buf, 0, bytesRead);
            }
        } finally {
            input.close();
            output.close();
        }
    }

    /**
     * 下载excel模板  带动态数据
     *
     * @param file 下载模板
     * @param data 动态数据
     * @param cond 参数 keys 显示字段
     */
    public File downloadExcelTemplate(File file, List<Record> data, Kv cond) {
        String fileName = file.getName();
        File newFile = new File(fileName.substring(0, fileName.indexOf(".")) + System.currentTimeMillis() + ".xlsx");
        try {
            copyFileUsingFileStreams(file, newFile);
            XSSFWorkbook book = null;
            int a = newFile.getName().indexOf(".xlsx");
            if (a > -1) {
                book = new XSSFWorkbook(new FileInputStream(newFile.getName()));
            }
            for (Record m : data) {
                XSSFSheet sheet = book.createSheet(m.get("key").toString());
                sheet.setColumnWidth(0, 40 * 256);
                String value = "", key = "";
                List dataList = m.get("data");
                String[] arrkeys = cond.getStr("keys").split(",");
                for (int i = 0, j = 0; dataList != null && i < dataList.size(); i++, j++) {
                    Record record = (Record) dataList.get(i);
                    XSSFRow row = sheet.createRow(i);
                    row.setHeight((short) (20 * 25));
                    for (int col = 0; col < arrkeys.length; col++) {
                        if (record.get(arrkeys[col]) != null) {
                            value = record.get(arrkeys[col]).toString();
                        } else {
                            value = "";
                        }
                        XSSFCell cell = row.createCell(col);
                        cell.setCellValue(value);
                    }
                }
                FileOutputStream fOut = new FileOutputStream(newFile);
                book.write(fOut);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return newFile;
    }

    /**
     * 下载excel模板  带动态数据
     *
     * @param file     下载模板
     * @param data     动态数据
     * @param cond     参数 keys 显示字段
     * @param rowStart 从第几行开始插入数据
     */
    public File downloadExcelTemplate1(File file, List<Record> data, Kv cond, int rowStart) {
        String fileName = file.getName();
        File newFile = new File(cond.getStr("the_time") + "——员工工资表" + ".xlsx");
        try {
            copyFileUsingFileStreams(file, newFile);
            XSSFWorkbook book = null;
            int a = newFile.getName().indexOf(".xlsx");
            if (a > -1) {
                book = new XSSFWorkbook(new FileInputStream(newFile.getName()));
                XSSFCellStyle cellStyle = book.createCellStyle();
                cellStyle.setBorderBottom(XSSFCellStyle.BORDER_THIN); //下边框
                cellStyle.setBorderLeft(XSSFCellStyle.BORDER_THIN);//左边框
                cellStyle.setBorderTop(XSSFCellStyle.BORDER_THIN);//上边框
                cellStyle.setBorderRight(XSSFCellStyle.BORDER_THIN);//右边框
                cellStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER); // 居中
                cellStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER); // 垂直居中
                XSSFFont font = book.createFont();
                font.setFontName("宋体");
                font.setFontHeightInPoints((short) 10);//设置字体大小
                cellStyle.setFont(font);//选择需要用到的字体格式

                XSSFSheet sheet = book.getSheetAt(0);
                sheet.removeRow(sheet.getRow(rowStart));
                sheet.removeRow(sheet.getRow(6));
                sheet.removeRow(sheet.getRow(9));
                String value = "", key = "";
                List dataList = data;
                String[] arrkeys = cond.getStr("keys").split(",");
                for (int i = 0, j = 0; dataList != null && i < dataList.size(); i++, j++) {
                    Record record = (Record) dataList.get(i);
                    XSSFRow row = sheet.createRow(i + rowStart);
                    row.setHeight((short) (20 * 25));
                    for (int col = 0; col < arrkeys.length; col++) {
                        if (col == 0) {
                            value = String.valueOf(i + 1);
                        } else if (record.get(arrkeys[col]) != null) {
                            value = record.get(arrkeys[col]).toString();
                        } else {
                            value = "";
                        }
                        XSSFCell cell = row.createCell(col);
                        cell.setCellValue(value);
                    }
                }
                XSSFRow rowLast = sheet.createRow(rowStart + dataList.size() + 2);
                XSSFRow rowLast2 = sheet.createRow(rowStart + dataList.size() + 4);
                XSSFCell cell1 = rowLast.createCell(3);
                XSSFCell cell2 = rowLast2.createCell(2);
                XSSFCell cell3 = rowLast2.createCell(14);
                XSSFCell cell4 = rowLast2.createCell(21);
                cell1.setCellValue("合计");
                cell2.setCellValue("审批：");
                cell3.setCellValue("审核：");
                cell4.setCellValue("制表：");
                FileOutputStream fOut = new FileOutputStream(newFile);
                book.write(fOut);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newFile;
    }

    /**
     * 找到需要插入的行数，并新建一个POI的row对象
     *
     * @param sheet
     * @param rowIndex
     * @return
     */
    private XSSFRow createRow(XSSFSheet sheet, Integer rowIndex) {
        XSSFRow row = null;
        if (sheet.getRow(rowIndex) != null) {
            int lastRowNo = sheet.getLastRowNum();
            sheet.shiftRows(rowIndex, lastRowNo, 1);
        }
        row = sheet.createRow(rowIndex);
        return row;
    }


    /**
     * 获取要导出的excel文件
     *
     * @param exportData  要导出的数据
     * @param firstColKey 第一列
     * @param lastColKey  最后一列
     * @return
     */
    public static File exportExcelFile(List exportData, String firstColKey, String lastColKey) {
        File file = new File("导出表格数据" + getYearToDateS() + ".xls");
        try {
            WorkbookSettings ws = new WorkbookSettings();
            ws.setEncoding("iso-8859-1");
            WritableWorkbook book = jxl.Workbook.createWorkbook(file, ws);
            WritableSheet sheet = book.createSheet("导出表格数据", 0);

            WritableFont bold = new WritableFont(WritableFont.ARIAL, 12);
            WritableCellFormat format = new WritableCellFormat(bold);
            format.setAlignment(jxl.format.Alignment.CENTRE);
            format.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);

            sheet.addCell(new Label(0, 0, "一共导出数据：" + exportData.size() + "条；导出日期:" + new SimpleDateFormat("yyyy-MM-dd").format(getNowDate()), format));
            String value = "", key = "";
            int columnsLen = 0;
            for (int i = 0, j = 2; exportData != null && i < exportData.size(); i++, j++) {
                Record record = (Record) exportData.get(i);
                sheet.setRowView(j, 400, false);
                Object[] columns = record.getColumns().keySet().toArray();
                columnsLen = columns.length;
                int col_num = 0, col_index = 0;
                for (int col = 0; col < columnsLen; col++) {
                    if (columns[col].toString().equals(firstColKey)) {
                        col_num = 0;
                    } else if (columns[col].toString().equals(lastColKey)) {
                        col_num = columnsLen - 1;
                    } else {
                        col_index += 1;
                        col_num = col_index;
                    }
                    if (record.get(columns[col].toString()) != null) {
                        if ("class java.sql.Timestamp".equals(record.get(columns[col].toString()).getClass().toString())) {
                            value = record.get(columns[col].toString()).toString();
                            value = value.substring(0, value.indexOf("."));
                        } else {
                            value = record.get(columns[col].toString()).toString();
                        }
                    } else {
                        value = "";
                    }
                    Label label = new Label(col_num, j, value, format);
                    sheet.addCell(label);
                    sheet.setColumnView(col_num, 30);
                }
            }
            sheet.mergeCells(0, 0, columnsLen - 1, 0);
            sheet.setRowView(0, 1000, false);
            sheet.setRowView(1, 500, false);
            book.write();
            book.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

    /**
     * 获取要导出的excel文件
     *
     * @param exportData 要导出的数据
     * @param rowName    行目录
     * @param colName    数据对应名
     * @param width      字体宽度
     * @param table      表名
     * @param top        标题
     * @return
     */
    public static File exportExcelFileXia(List exportData, String[] rowName, String[] colName, int[] width, String table, String top) {
        File file = new File(table + ".xls");
        try {
            WorkbookSettings ws = new WorkbookSettings();
            ws.setEncoding("iso-8859-1");
            WritableWorkbook book = jxl.Workbook.createWorkbook(file, ws);
            WritableSheet sheet = book.createSheet(top, 0);
            WritableFont bold = new WritableFont(WritableFont.ARIAL, 10);
            WritableCellFormat format = new WritableCellFormat(bold);
            format.setAlignment(Alignment.CENTRE);
            format.setVerticalAlignment(VerticalAlignment.CENTRE);
            sheet.addCell(new Label(0, 0, top, format));
            sheet.addCell(new Label(0, 1, "填报单位（签章）：   "));
            int columnsLen = rowName.length;
            for (int n = 0; n < columnsLen; n++) {
                sheet.addCell(new Label(n, 2, rowName[n], format));
                sheet.setRowView(2, 800);
            }
            for (int i = 0, j = 3; exportData != null && i < exportData.size(); i++, j++) {
                Record record = (Record) exportData.get(i);
                for (int m = 0, w = 0; m < colName.length; m++, w++) {
                    Label data = new Label(m, j, record.getStr(colName[m]), format);
                    sheet.addCell(data);
                    sheet.setRowView(j, 500, false);
                    sheet.setColumnView(w, width[w]);
                }
            }
            sheet.mergeCells(0, 0, columnsLen - 1, 0);
            sheet.mergeCells(0, 1, columnsLen - 1, 1);
            sheet.setRowView(0, 1000, false);
            sheet.setRowView(1, 500, false);
            book.write();
            book.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }


    /**
     * 导入excel文件
     *
     * @param file
     * @return
     */
    public static Map getUploadExcelFile(File file) {
        return getUploadExcelFile(file, Integer.parseInt(PropKit.get("start.row.num")), Integer.parseInt(PropKit.get("max.rows")));
    }

    /**
     * 导入excel文件
     *
     * @param file * @param keys 指标项数组（从第一列开始）
     * @return
     */
    public static Map getUploadExcelFile(File file, String[] keys) {
        return getUploadExcelFile(file, Integer.parseInt(PropKit.get("start.row.num")), Integer.parseInt(PropKit.get("max.rows")), keys);
    }

    /**
     * 导入excel文件
     *
     * @param file
     * @param startRow 从startRow行开始读取数据:excel中的行号
     * @param rowCount 最大行数
     * @return
     */
    public static Map getUploadExcelFile(File file, Integer startRow, Integer rowCount) {
        Map result = new HashMap();
        if (rowCount > Integer.parseInt(PropKit.get("max.rows"))) {
            rowCount = Integer.parseInt(PropKit.get("max.rows"));
        }
        List rowsList = new ArrayList();
        try {
            if (file.exists()) {
                Workbook workbook = Workbook.getWorkbook(file);
                Sheet sheet = workbook.getSheet(0);
                Integer rows = sheet.getRows();
                if (rows > rowCount) {
                    rows = rowCount + Integer.parseInt(PropKit.get("start.row.num"));
                }
                Integer columns = sheet.getColumns();
                List<Cell> cells;
                boolean flag;
                for (int i = startRow - 1; i < rows; i++) {
                    cells = new ArrayList<Cell>();
                    flag = true;
                    for (int j = 0; j < columns; j++) {
                        Cell cell = sheet.getCell(j, i);
                        if (j == 0 && ValidateKit.isNullOrEmpty(cell.getContents())) {
                            flag = false;
                            break;
                        }
                        cells.add(cell);
                    }
                    if (flag) {
                        rowsList.add(cells);
                    }
                }
                workbook.close();
                result.put("status", "1");
                result.put("msg", "读取文件成功");
                result.put("data", rowsList);
                if (file.exists()) {
                    file.delete();
                }
            } else {
                result.put("status", "0");
                result.put("msg", "文件不存在");
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.put("status", "0");
            result.put("msg", "读取文件失败！");
            if (file.exists()) {
                file.delete();
            }
        }
        return result;
    }

    /**
     * 导入excel文件
     *
     * @param file
     * @param startRow 从startRow行开始读取数据:excel中的行号
     * @param rowCount 最大行数
     * @param keys     指标项数组（从第一列开始）
     * @return
     */
    public static Map getUploadExcelFile(File file, Integer startRow, Integer rowCount, String[] keys) {
        Map result = new HashMap();
        if (rowCount > Integer.parseInt(PropKit.get("max.rows"))) {
            rowCount = Integer.parseInt(PropKit.get("max.rows"));
        }
        List rowsList = new ArrayList();
        try {
            if (file.exists()) {
                Workbook workbook = Workbook.getWorkbook(file);
                Sheet sheet = workbook.getSheet(0);
                Integer rows = sheet.getRows();
                if (rows > rowCount) {
                    rows = rowCount + Integer.parseInt(PropKit.get("start.row.num"));
                }
                Integer columns = sheet.getColumns();
                List<Cell> cells;
                Map row;
                boolean flag;
                for (int i = startRow - 1; i < rows; i++) {
                    cells = new ArrayList<Cell>();
                    flag = true;
                    row = new HashMap();
                    for (int j = 0; j < columns; j++) {
                        Cell cell = sheet.getCell(j, i);
                        if (j == 0 && ValidateKit.isNullOrEmpty(cell.getContents())) {
                            flag = false;
                            break;
                        }
                        if (keys.length == columns) {
                            row.put(keys[j], cell.getContents());
                        } else {
                            cells.add(cell);
                        }
                    }
                    if (flag) {
                        if (keys.length == columns) {
                            rowsList.add(row);
                        } else {
                            rowsList.add(cells);
                        }
                    }
                }
                workbook.close();
                result.put("status", "1");
                result.put("msg", "读取文件成功");
                result.put("data", rowsList);
                if (file.exists()) {
                    file.delete();
                }
            } else {
                result.put("status", "0");
                result.put("msg", "文件不存在");
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.put("status", "0");
            result.put("msg", "读取文件失败！");
            if (file.exists()) {
                file.delete();
            }
        }
        return result;
    }


    /**
     * 读取excel
     *
     * @param excel
     * @return
     */
    public static Map readUploadExcelFile(File excel) {
        return readUploadExcelFile(excel, Integer.parseInt(PropKit.get("start.row.num")), Integer.parseInt(PropKit.get("max.rows")), null, 0);
    }

    /**
     * 读取excel
     *
     * @param excel
     * @param keys        每列对应key
     * @param readCellLen 读取表格列数
     * @return
     */
    public static Map readUploadExcelFile(File excel, String[] keys, int readCellLen) {
        return readUploadExcelFile(excel, Integer.parseInt(PropKit.get("start.row.num")), Integer.parseInt(PropKit.get("max.rows")), keys, readCellLen);
    }

    /**
     * 读取excel
     *
     * @param excel
     * @param startRow
     * @param rowCount
     * @return
     */
    public static Map readUploadExcelFile(File excel, Integer startRow, Integer rowCount) {
        return readUploadExcelFile(excel, startRow, rowCount, null, 0);
    }

    /**
     * 读取excel
     *
     * @param excel
     * @param startRow    起始读取行
     * @param rowCount    最多读取行数
     * @param keys        每列对应key
     * @param readCellLen 读取表格列数
     * @return
     */
    public static Map readUploadExcelFile(File excel, Integer startRow, Integer rowCount, String[] keys, int readCellLen) {
        Map result = new HashMap();
        List rowsList = new ArrayList();
        try {
            if (excel.exists()) {
                try {
                    HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(excel));
                    HSSFSheet sheet = wb.getSheetAt(0);
                    Integer rows = sheet.getLastRowNum() + 1;
                    if (rows > rowCount) {
                        rows = rowCount + Integer.parseInt(PropKit.get("start.row.num"));
                    }
                    Map rowMap;
                    List<HSSFCell> cells;
                    boolean flag;
                    String content = "";
                    for (int j = startRow - 1; j < rows; j++) {
                        HSSFRow row = sheet.getRow(j);
                        if (!ValidateKit.isNullOrEmpty(row)) {
                            rowMap = new HashMap();
                            cells = new ArrayList();
                            flag = true;
                            for (int i = 0; i < readCellLen; i++) {
                                HSSFCell cell = row.getCell(i);
                                if (!ValidateKit.isNullOrEmpty(cell)) {
                                    content = getValue(cell);
                                    if (i == 0 && ValidateKit.isNullOrEmpty(content)) {
                                        flag = false;
                                        break;
                                    }
                                    if (!ValidateKit.isNullOrEmpty(keys) && keys.length >= readCellLen) {
                                        rowMap.put(keys[i], ValidateKit.isNullOrEmpty(content) ? null : content.trim());
                                    } else {
                                        cells.add(cell);
                                    }
                                }
                            }
                            if (flag) {
                                if (!ValidateKit.isNullOrEmpty(keys) && keys.length >= readCellLen) {
                                    rowsList.add(rowMap);
                                } else {
                                    rowsList.add(cells);
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream(excel));
                    XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
                    Integer rows = sheet.getLastRowNum() + 1;
                    if (rows > rowCount) {
                        rows = rowCount + Integer.parseInt(PropKit.get("start.row.num"));
                    }
                    Map rowMap;
                    List<XSSFCell> cells;
                    boolean flag;
                    String content = "";
                    for (int j = startRow - 1; j < rows; j++) {
                        XSSFRow row = sheet.getRow(j);
                        if (!ValidateKit.isNullOrEmpty(row)) {
                            rowMap = new HashMap();
                            cells = new ArrayList();
                            flag = true;
                            for (int i = 0; i < readCellLen; i++) {
                                XSSFCell cell = row.getCell(i);
                                if (!ValidateKit.isNullOrEmpty(cell)) {
                                    cell.setCellType(XSSFCell.CELL_TYPE_STRING);
                                    content = cell.getStringCellValue();
                                    if (i == 0 && ValidateKit.isNullOrEmpty(content)) {
                                        flag = false;
                                        break;
                                    }
                                    if (!ValidateKit.isNullOrEmpty(keys) && keys.length >= readCellLen) {
                                        rowMap.put(keys[i], ValidateKit.isNullOrEmpty(content) ? null : content.trim());
                                    } else {
                                        cells.add(cell);
                                    }
                                }
                            }
                            if (flag) {
                                if (!ValidateKit.isNullOrEmpty(keys) && keys.length >= readCellLen) {
                                    rowsList.add(rowMap);
                                } else {
                                    rowsList.add(cells);
                                }
                            }
                        }
                    }
                }
                result.put("status", "1");
                result.put("msg", "读取文件成功");
                result.put("data", rowsList);
                if (excel.exists()) {
                    excel.delete();
                }
            } else {
                result.put("status", "0");
                result.put("msg", "文件不存在");
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.printStackTrace();
            result.put("status", "0");
            result.put("msg", "读取文件失败！");
            if (excel.exists()) {
                excel.delete();
            }
        }
        return result;
    }

    /**
     * 读取exce
     *
     * @param excel
     * @param startRow    起始读取行
     * @param rowCount    最多读取行数
     * @param keys        每列对应key
     * @param readCellLen 读取表格列数
     * @param sheetNo     读取sheet编号
     * @return
     */
    public static Map readUploadExcelFile(File excel, Integer startRow, Integer rowCount, String[] keys, int readCellLen, int sheetNo) {
        Map result = new HashMap();
        List rowsList = new ArrayList();
        try {
            if (excel.exists()) {
                try {
                    HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(excel));
                    HSSFSheet sheet = wb.getSheetAt(sheetNo - 1);
                    Integer rows = sheet.getLastRowNum() + 1;
                    if (rows > rowCount) {
                        rows = rowCount + Integer.parseInt(PropKit.get("start.row.num"));
                    }
                    Map rowMap;
                    List<HSSFCell> cells;
                    boolean flag;
                    String content = "";
                    for (int j = startRow - 1; j < rows; j++) {
                        HSSFRow row = sheet.getRow(j);
                        if (!ValidateKit.isNullOrEmpty(row)) {
                            rowMap = new HashMap();
                            cells = new ArrayList();
                            flag = true;
                            for (int i = 0; i < readCellLen; i++) {
                                HSSFCell cell = row.getCell(i);
                                if (!ValidateKit.isNullOrEmpty(cell)) {
                                    content = getValue(cell);
                                    if (i == 0 && ValidateKit.isNullOrEmpty(content)) {
                                        flag = false;
                                        break;
                                    }
                                    if (!ValidateKit.isNullOrEmpty(keys) && keys.length >= readCellLen) {
                                        rowMap.put(keys[i], ValidateKit.isNullOrEmpty(content) ? null : content.trim());
                                    } else {
                                        cells.add(cell);
                                    }
                                }
                            }
                            if (flag) {
                                if (!ValidateKit.isNullOrEmpty(keys) && keys.length >= readCellLen) {
                                    rowsList.add(rowMap);
                                } else {
                                    rowsList.add(cells);
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream(excel));
                    XSSFSheet sheet = xssfWorkbook.getSheetAt(sheetNo - 1);
                    Integer rows = sheet.getLastRowNum() + 1;
                    if (rows > rowCount) {
                        rows = rowCount + Integer.parseInt(PropKit.get("start.row.num"));
                    }
                    Map rowMap;
                    List<XSSFCell> cells;
                    boolean flag;
                    String content = "";
                    for (int j = startRow - 1; j < rows; j++) {
                        XSSFRow row = sheet.getRow(j);
                        if (!ValidateKit.isNullOrEmpty(row)) {
                            rowMap = new HashMap();
                            cells = new ArrayList();
                            flag = true;
                            for (int i = 0; i < readCellLen; i++) {
                                XSSFCell cell = row.getCell(i);
                                if (!ValidateKit.isNullOrEmpty(cell)) {
                                    cell.setCellType(XSSFCell.CELL_TYPE_STRING);
                                    content = cell.getStringCellValue();
                                    if (i == 0 && ValidateKit.isNullOrEmpty(content)) {
                                        flag = false;
                                        break;
                                    }
                                    if (!ValidateKit.isNullOrEmpty(keys) && keys.length >= readCellLen) {
                                        rowMap.put(keys[i], ValidateKit.isNullOrEmpty(content) ? null : content.trim());
                                    } else {
                                        cells.add(cell);
                                    }
                                }
                            }
                            if (flag) {
                                if (!ValidateKit.isNullOrEmpty(keys) && keys.length >= readCellLen) {
                                    rowsList.add(rowMap);
                                } else {
                                    rowsList.add(cells);
                                }
                            }
                        }
                    }
                }
                result.put("status", "1");
                result.put("msg", "读取文件成功");
                result.put("data", rowsList);
                if (excel.exists()) {
                    excel.delete();
                }
            } else {
                result.put("status", "0");
                result.put("msg", "文件不存在");
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.printStackTrace();
            result.put("status", "0");
            result.put("msg", "读取文件失败！");
            if (excel.exists()) {
                excel.delete();
            }
        }
        return result;
    }


    private static String getValue(HSSFCell hssfCell) {
        if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
            return String.valueOf(hssfCell.getBooleanCellValue());
        } else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
            return String.valueOf(hssfCell.getNumericCellValue());
        } else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_STRING) {
            return String.valueOf(hssfCell.getStringCellValue());
        } else {
            hssfCell.setCellType(HSSFCell.CELL_TYPE_STRING);
            return String.valueOf(hssfCell.getStringCellValue());
        }
    }


    /**
     * 保存文件到本地
     *
     * @param basePath    根路径
     * @param inputStream 文件流
     * @param fileName    文件名
     */
    public static void saveFileLocal(String basePath, FileInputStream inputStream, String fileName) {
        OutputStream os = null;
        try {
            // 2、保存到临时文件
            // 1K的数据缓冲
            byte[] bs = new byte[1024];
            // 读取到的数据长度
            int len;
            // 输出的文件流保存到本地文件
            File tempFile = new File(basePath);
            if (!tempFile.exists()) {
                tempFile.mkdirs();
            }
            os = new FileOutputStream(tempFile.getPath() + File.separator + fileName);
            // 开始读取
            while ((len = inputStream.read(bs)) != -1) {
                os.write(bs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 完毕，关闭所有链接
            try {
                os.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 上传文件至ftp     业务类型：（用于区别文件存取的路径：取后缀）
     *
     * @throws IOException
     */
    public void uploadPicture() throws IOException {
        Map res = new HashMap();
        /*String file_url = PropKit.get("uploadpath." + getPara("type"));
        //获取当前时间毫秒数作为文件名称
        long t = System.currentTimeMillis();
        UploadFile upload = getFile();
        File file = upload.getFile();
        //取得原始的文件名
        String originalFileName = upload.getOriginalFileName();
        //取得原始文件后缀（带"."）
        String suffix = originalFileName.substring(originalFileName.lastIndexOf("."));
        //调用Ftp上传文件
        FtpUtil.uploadFile(file_url, t + suffix, new FileInputStream(file));
        //页面回显路径
        String displayPath = PropKit.get("file.accessHead") + file_url + t + suffix;
        //数据库存储路径
        String storePath = file_url + t + suffix;
        //回显路径
        res.put("displayPath", displayPath);
        //数据库存储路径
        res.put("storePath", storePath);*/
        String uploadPath=PropKit.get("uploadpath." + getPara("type"));
        UploadFile uploadFile = getFile("file",uploadPath);
        String fileName = uploadFile.getFileName();
        res.put("displayPath","upload/"+uploadPath+"/"+uploadFile.getFileName());
        res.put("storePath","upload/"+uploadPath+"/"+uploadFile.getFileName());
        renderJson(res);
    }


    /**
     * 同一目录下上传文件重命名，以防止重复
     *
     * @param uploadFile 上传文件
     * @return java.lang.String 重命名之后的文件名，如果返回为""则表示上传文件为null或者重命名文件失败
     */
    public static String renameFile(UploadFile uploadFile) {
        String fileName = "";
        File oldFile = uploadFile.getFile();
        //取当前时间毫秒数作为文件名称
        long t = System.currentTimeMillis();
        //取得原始的文件名
        String originalFileName = uploadFile.getOriginalFileName();
        //取得原始文件后缀（带"."）
        String suffix = originalFileName.substring(originalFileName.lastIndexOf("."));
        //返回的新文件路径
        File newFile = new File(oldFile.getParent() + File.separator + t + suffix);
        if (oldFile.exists()) {
            if (oldFile.renameTo(newFile)) {
                fileName = newFile.getName();
            }
        }
        return fileName;
    }



    /**
     * 导出数据表格（复杂表格）：电子科技大学后勤保障部员工基本情况表
     *
     * @param dataList 动态数据
     * @param cond 参数 keys 显示字段
     */
    public static File exportEmployeesMonthStatisticsFile(List dataList, Kv cond) {
        String site_nature = cond.getStr("site_nature");
        String sheetName=site_nature.equals("1")?"独立法人":"非独立法人";
        File newFile = new File("电子科技大学后勤保障部员工基本情况表("+sheetName+")"+ getYearToDateS() + ".xls");
        try {
            WorkbookSettings ws = new WorkbookSettings();
            ws.setEncoding("iso-8859-1");
            WritableWorkbook book = jxl.Workbook.createWorkbook(newFile, ws);
            WritableSheet sheet = book.createSheet(sheetName, 0);

            WritableFont bold = new WritableFont(WritableFont.ARIAL, 12);
            WritableCellFormat format = new WritableCellFormat(bold);
            format.setAlignment(jxl.format.Alignment.CENTRE);
            format.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);
            String month;int sum;
            Map data;
            String[] arrkeys = cond.getStr("keys").split(",");
            Label label;
            //todo优化
            label = new Label( 0,0, "统计年月", format);sheet.addCell(label);
            label = new Label( 1,0, "后勤职工人数", format);sheet.addCell(label);
            label = new Label( 2,0, "性别", format);sheet.addCell(label);
            label = new Label( 3,0, "人数", format);sheet.addCell(label);
            label = new Label( 4,0, "年龄状况", format);sheet.addCell(label);
            label = new Label(9,0, "文化程度", format);sheet.addCell(label);
            label = new Label(4,1, "20岁以下", format);sheet.addCell(label);
            label = new Label(5,1, "21-30岁", format);sheet.addCell(label);
            label = new Label(6,1, "31-40岁", format);sheet.addCell(label);
            label = new Label(7,1, "41-50岁", format);sheet.addCell(label);
            label = new Label(8,1, "50岁以上", format);sheet.addCell(label);
            label = new Label(9,1, "大专以下", format);sheet.addCell(label);
            label = new Label(10,1, "大专", format);sheet.addCell(label);
            label = new Label(11,1, "本科", format);sheet.addCell(label);
            label = new Label(12,1, "硕博", format);sheet.addCell(label);
            sheet.setColumnView(0, 16);
            sheet.setColumnView(1, 16);
            sheet.setRowView(0, 500, false);
            sheet.setRowView(1, 500, false);
            for(int index=0;index<4;index++){
                sheet.mergeCells(index, 0, index, 1);
            }
            sheet.mergeCells(4, 0, 8, 0);
            sheet.mergeCells(9, 0, 12, 0);

            for (int i=2,l=0;l<dataList.size();i+=2,l++) {
                data = (Map) dataList.get(l);
                month = data.get("month").toString();
                List<Record> emps = (List<Record>) data.get("data");
                if (!ValidateKit.isNullOrEmpty(emps) && emps.size() == 2) {
                    sum = Integer.parseInt(emps.get(0).get("count0").toString()) + Integer.parseInt(emps.get(1).get("count0").toString());
                    for (int m = 0; m < 2; m++) {
                        label = new Label( 0,i + m, month, format);
                        sheet.addCell(label);
                        label = new Label( 1,i + m, sum+"", format);
                        sheet.addCell(label);
                        for (int j = 2; j < arrkeys.length+2; j++) {
                            label = new Label( j,i + m, ((Record) emps.get(m)).getStr(arrkeys[j-2]), format);
                            sheet.addCell(label);
                            sheet.setColumnView(j, 15);
                            sheet.mergeCells(0, i+m, 0, i+m+1);
                            sheet.mergeCells(1, i+m, 1, i+m+1);
                            sheet.setRowView(i+m, 500, false);
                        }
                    }
                }
            }
            book.write();
            book.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newFile;
    }

    /*
    * 导出校区盘点统计数据表格
    * */
    public static File exportEmployeesMonthStatisticsFile(List<Record> list,String zoneName,String date){
        String sheetName="校区盘点统计数据表格";
        File newFile = new File(sheetName+ getYearToDateS() + ".xls");
        try {
            WorkbookSettings ws = new WorkbookSettings();
            ws.setEncoding("iso-8859-1");
            WritableWorkbook book = jxl.Workbook.createWorkbook(newFile, ws);
            WritableSheet sheet = book.createSheet(sheetName, 0);
            //设置字体格式
            WritableFont wf = new WritableFont(WritableFont.TIMES);
            try {
                wf.setColour(Colour.RED);
                wf.setPointSize(15);
            } catch (WriteException e) {
                e.printStackTrace();
            }
            WritableFont bold = new WritableFont(WritableFont.ARIAL, 9);
            WritableCellFormat format = new WritableCellFormat(bold);
            WritableCellFormat title = new WritableCellFormat(wf);
            WritableCellFormat formatLeft = new WritableCellFormat(bold);
            WritableCellFormat formatRight = new WritableCellFormat(bold);
            formatRight.setAlignment(Alignment.RIGHT);
            formatRight.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);
            formatLeft.setAlignment(Alignment.LEFT);
            formatLeft.setVerticalAlignment(VerticalAlignment.CENTRE);
            format.setAlignment(Alignment.CENTRE);
            format.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);
            title.setAlignment(Alignment.CENTRE);
            title.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);
            Label label;
            //todo优化
            sheet.mergeCells(0,0,9,1);
            sheet.mergeCells(0,2,4,2);
            sheet.mergeCells(5,2,9,2);
            label = new Label( 0,0, "服务维修中心库存材料出入库汇总表", title);sheet.addCell(label);
            label = new Label( 0,2, "    日期："+date+"", formatLeft);sheet.addCell(label);
            label = new Label( 5,2, "校区："+zoneName+"    ", formatRight);sheet.addCell(label);
            label = new Label( 0,3, "序号", format);sheet.addCell(label);
            label = new Label( 1,3, "商品名称", format);sheet.addCell(label);
            label = new Label( 2,3, "规格", format);sheet.addCell(label);
            label = new Label( 3,3, "品牌", format);sheet.addCell(label);
            label = new Label( 4,3, "入库数量", format);sheet.addCell(label);
            label = new Label( 5,3, "入库金额", format);sheet.addCell(label);
            label = new Label( 6,3, "库存数量", format);sheet.addCell(label);
            label = new Label( 7,3, "库存金额", format);sheet.addCell(label);
            label = new Label( 8,3, "出库数量", format);sheet.addCell(label);
            label = new Label( 9,3, "出库金额", format);sheet.addCell(label);
            sheet.setColumnView(1, 30);
            sheet.setColumnView(2, 30);
            sheet.setColumnView(3, 18);
            sheet.setColumnView(4, 18);
            sheet.setColumnView(5, 18);
            sheet.setColumnView(6, 18);
            sheet.setColumnView(7, 18);
            sheet.setColumnView(8, 18);
            sheet.setColumnView(9, 18);
            sheet.setRowView(0, 400, false);
            sheet.setRowView(1, 400, false);
            sheet.setRowView(2, 400, false);
            sheet.setRowView(3, 500, false);
            int index=4;
                for (int i=0;i<list.size();i++){
                    label = new Label( 0,index, list.get(i).getStr("number"), format);sheet.addCell(label);
                    label = new Label( 1,index, list.get(i).getStr("name"), format);sheet.addCell(label);
                    label = new Label( 2,index, list.get(i).getStr("specification"), format);sheet.addCell(label);
                    label = new Label( 3,index, list.get(i).getStr("trademark"), format);sheet.addCell(label);
                    label = new Label( 4,index, list.get(i).getStr("joinNumber"), format);sheet.addCell(label);
                    label = new Label( 5,index, list.get(i).getStr("joinPrice"), format);sheet.addCell(label);
                    label = new Label( 6,index, list.get(i).getStr("zoneNumber"), format);sheet.addCell(label);
                    label = new Label( 7,index, list.get(i).getStr("zonePrice"), format);sheet.addCell(label);
                    label = new Label( 8,index, list.get(i).getStr("outNumber"), format);sheet.addCell(label);
                    label = new Label( 9,index, list.get(i).getStr("outPrice"), format);sheet.addCell(label);
                    index++;
            }
            sheet.mergeCells(0,index+3,1,index+3);
            sheet.mergeCells(0,index+8,2,index+9);
            sheet.mergeCells(0,index+10,2,index+11);
            sheet.mergeCells(3,index+8,5,index+9);
            sheet.mergeCells(3,index+10,5,index+11);
            sheet.mergeCells(6,index+8,9,index+9);
            sheet.mergeCells(6,index+10,9,index+11);
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
             date = sdf.format(getNowDate());
            label = new Label( 0,index+3, "    打印/导出日期："+date+"", formatLeft);sheet.addCell(label);
            sheet.setRowView(index+3, 400, false);
            sheet.mergeCells(0,index+3,9,index+3);
            label = new Label( 0,index+8, "    中心主任：", formatLeft);sheet.addCell(label);
            label = new Label( 0,index+10, "    日       期：", formatLeft);sheet.addCell(label);
            label = new Label( 3,index+8, "    部门主任：", formatLeft);sheet.addCell(label);
            label = new Label( 3,index+10, "    日       期：", formatLeft);sheet.addCell(label);
            label = new Label( 6,index+8, "    库管管理员：", formatLeft);sheet.addCell(label);
            label = new Label( 6,index+10, "    日       期：", formatLeft);sheet.addCell(label);
            book.write();
            book.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newFile;

    }

    public static final SiteInfoService siteInfoService= SiteInfoService.me;

    /**
     * 创建标题和副标题的方法
     * */
    private static void setSubheading(XSSFSheet sheet,String excelName,XSSFCellStyle style_title,XSSFWorkbook wb,String str,int length){
        //标题行
        XSSFRow row_title = sheet.createRow(0);
        sheet.addMergedRegion(new CellRangeAddress(0,0,0,length));
        XSSFCell cell_title = row_title.createCell(0);//创建一列
        cell_title.setCellValue(excelName);//标题
        cell_title.setCellStyle(style_title);//设置标题样式
        //副标题
        XSSFRow row_info = sheet.createRow(1);
        sheet.addMergedRegion(new CellRangeAddress(1,1,0,length));
        XSSFCell cell_info = row_info.createCell(0);
        XSSFCellStyle style_info = wb.createCellStyle();
        style_info.setAlignment(HorizontalAlignment.LEFT);
        cell_info.setCellValue(str);
        cell_info.setCellStyle(style_info);
    }

    private static void setReportStyle(XSSFWorkbook wb,XSSFCell cell){
        XSSFCellStyle cellStyle = wb.createCellStyle();
        cellStyle.setBorderBottom(CellStyle.BORDER_THIN); // 下边框
        cellStyle.setBorderLeft(CellStyle.BORDER_THIN);// 左边框
        cellStyle.setBorderTop(CellStyle.BORDER_THIN);// 上边框
        cellStyle.setBorderRight(CellStyle.BORDER_THIN);// 右边框
        cell.setCellStyle(cellStyle);
    }

    /**
     * 获取时间天数方法
     * */
    public static String getDateNum(String startDate,String endDate){
        String day = "全部时间";
        if(!ValidateKit.isNullOrEmpty(startDate) && !ValidateKit.isNullOrEmpty(endDate)){
            day=startDate+"---"+endDate+"  共"+comparePastDate(endDate, startDate)+"天";
        }
        return day;
    }

    /**
     * 创建列标题方法
     * */
    private static void createCellTopic(String[] str_topic,XSSFRow row_topic, XSSFWorkbook wb){
        XSSFCell cell_topic;
        for(int i = 0;i<str_topic.length;i++){
            cell_topic = row_topic.createCell(i);
            setReportStyle(wb,cell_topic);
            cell_topic.setCellValue(str_topic[i]);
        }
    }
}