package com.itapril.sample.common.utils;

import java.util.UUID;

/**
 * @author itapril.
 * @create 2018/8/9 11:03.
 */
public class CharUtils {
    public static String setUUid(){
        return UUID.randomUUID().toString().trim().replaceAll("-", "");
    }
}
