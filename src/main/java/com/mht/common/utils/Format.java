package com.mht.common.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;
import com.mht.common.interceptor.Result;

/**
 * Created by imzdx on 2017/12/27 0027.
 */
public class Format {
    public static Map<String, Object> layuiPage(Page<?> page) {
        return layuiPage(page, 0, "");
    }

    /**
     * 按照layUI格式分页获取数据
     *
     * @param page
     * @param code
     * @param message
     */
    public static Map<String, Object> layuiPage(Page<?> page, int code, String message) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", code);
        result.put("msg", message);
        if (page == null) {
            result.put("count", 0);
            result.put("data", null);
        } else {
            result.put("count", page.getTotalRow());
            result.put("data", page.getList());
        }
        return result;

    }

    /**
     * 按照layUI格式不分页获取数据
     */
    public static Map<String, Object> listTolayuiPage(List list) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", "0");
        result.put("msg", "ok");
        if (list == null) {
            result.put("count", 0);
            result.put("data", null);
        } else {
            result.put("count", "99999");
            result.put("data", list);
        }
        return result;

    }

    public static Result result(Object data) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("ok");
        result.setData(data);
        return result;
    }

    /*public static Result layuiFile(File file, FileController controller) {
        Kv set = Kv.by("src", controller.getRequest().getContextPath() + "/file/get/" + file.getId())
                .set("title", file.getName()).set("fileId", file.getId());
        return result(set);
    }*/

    public static Map<String, String> ModelToMap(Model model) {
        String jmodel = model.toJson();
        Gson gson = new Gson();
        Map<String, String> jsonmap = gson.fromJson(jmodel,
                new TypeToken<Map<String, String>>() {
                }.getType());
        return jsonmap;
    }
}
