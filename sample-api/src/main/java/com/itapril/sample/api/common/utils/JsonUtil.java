package com.itapril.sample.api.common.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author itapril.
 * @create 2018/8/10 17:47.
 */
public class JsonUtil {

    /**
     * @param object
     * @return 返回json格式的字符串
     */
    public static String toJsonString(Object object){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
