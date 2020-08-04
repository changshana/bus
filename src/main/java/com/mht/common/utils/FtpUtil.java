package com.mht.common.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;

import com.jfinal.kit.PropKit;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

/**
 * ftp文件操作工具类，需要引入commons.net,具体dependency如下：
 * <dependency>
    <groupId>commons-net</groupId>
    <artifactId>commons-net</artifactId>
    <version>1.4.1</version>
   </dependency>
 */
public class FtpUtil {

    /**
     * 获取ftp连接对象
     * ip,port,userName,password
     * @return
     */
    public static FTPClient getFTPClient() {
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient = new FTPClient();
            ftpClient.connect(PropKit.get("ftpServer.host"), Integer.parseInt(PropKit.get("ftpServer.port")));// 连接FTP服务器
            String userName=PropKit.get("ftpServer.userName");
            String ftpPassword=PropKit.get("ftpServer.ftpPassword");
            if(userName!=null && !userName.equals("") && ftpPassword!=null && !ftpPassword.equals("")){
                ftpClient.login(userName, ftpPassword);// 登陆FTP服务器
            }
            if (!FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {
                System.out.println("未连接到FTP，用户名或密码错误。");
                ftpClient.disconnect();
            } else {
                System.out.println("FTP连接成功。");
            }
        } catch (SocketException e) {
            e.printStackTrace();
            System.out.println("FTP的IP地址可能错误，请正确配置。");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("FTP的端口错误,请正确配置。");
        }
        return ftpClient;
    }

    /*
     * 从FTP服务器下载文件
     * @param ftpPath FTP服务器中文件所在路径 格式： ftptest/aa
     * @param localPath 下载到本地的位置 格式：H:/download
     * @param fileName 文件名称
     */
    public static void downloadFtpFile(String ftpPath, String localPath, String fileName) {

        FTPClient ftpClient = null;

        try {
            ftpClient = getFTPClient();
            ftpClient.setControlEncoding("UTF-8"); // 中文支持
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftpClient.enterLocalPassiveMode();
            ftpClient.changeWorkingDirectory(ftpPath);

            File localFile = new File(localPath + File.separatorChar + fileName);
            OutputStream os = new FileOutputStream(localFile);
            //将当前的WorkingDirectory下的名为fileName的文件输出到localpath下
            ftpClient.retrieveFile(fileName, os);
            os.close();
            ftpClient.logout();

        } catch (FileNotFoundException e) {
            System.out.println("没有找到" + ftpPath + "文件");
            e.printStackTrace();
        } catch (SocketException e) {
            System.out.println("连接FTP失败.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件读取错误。");
        }

    }

    /**
     * Description: 向FTP服务器上传文件
     * @param ftpPath  FTP服务器中文件所在文件夹路径 格式a/b/c/d
     * @param fileName 文件在ftp服务器上的名称
     * @param input 文件流
     * @return 成功返回true，否则返回false
     */
    public static boolean uploadFile(String ftpPath, String fileName,InputStream input){
        boolean success = false;
        FTPClient ftpClient = null;
        try {
            int reply;
            //获取连接
            ftpClient = getFTPClient();
            reply = ftpClient.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftpClient.disconnect();
                return success;
            }
            ftpClient.setControlEncoding("UTF-8"); // 中文支持
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftpClient.enterLocalPassiveMode();
            //设置ftp存储目录
            if(!ftpClient.changeWorkingDirectory(ftpPath)){
                //切换目录失败说明此文件夹不存在,需要创建文件夹。
                String[] ftpPathArr=ftpPath.split("/");
                for(String p:ftpPathArr){
                    if(!ftpClient.changeWorkingDirectory(p)){
                        if (!ftpClient.makeDirectory(p)) {
                            throw new IllegalStateException("创建文件夹失败。");
                        }else{
                            ftpClient.changeWorkingDirectory(p);
                        }
                    }
                }
            }
            //将文件流写到远程ftp服务器 远程ftp服务器上该文件的名称,输入流
            ftpClient.storeFile(fileName, input);
            //关闭流
            input.close();
            //断开连接
            ftpClient.logout();
            success = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ftpClient.isConnected()) {
                try {
                    ftpClient.disconnect();
                } catch (IOException ioe) {
                }
            }
        }
        return success;
    }

    /**
     * 删除文件(需要手动获取链接和关闭链接)
     * @param ftpClient ftp客户端对象（获取方法：FtpUtil.getFTPClient();）
     * @param pathname FTP服务器保存目录
     * @param filename filename 要删除的文件名称
     * @return 删除是否成功
     */
    public static boolean deleteFile(FTPClient ftpClient,String pathname, String filename){
        boolean flag = false;
        try {
            //切换FTP目录
            ftpClient.changeWorkingDirectory(pathname);
            ftpClient.dele(filename);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalStateException("删除文件失败");
        }
        return flag;
    }


    /**
     * 删除文件
     * @param pathname FTP服务器保存目录
     * @param filename 要删除的文件名称
     * @return
     */
    public static boolean deleteFile(String pathname, String filename){
        FTPClient ftpClient=null;
        boolean flag = false;
        try {
            //切换FTP目录
            ftpClient = getFTPClient();
            ftpClient.changeWorkingDirectory(pathname);
            ftpClient.dele(filename);
            //ftpClient.logout();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalStateException("删除文件失败");
        } finally {
            if(ftpClient.isConnected()){
                try{
                    ftpClient.disconnect();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

}
