package edu.nf.ch05.Test.ch02.util;

import java.util.UUID;

/**
 * @author 0.0
 * UUIDUtils生成的工具类
 */
public class UUIDUtils {
    public static String createUUID(){
        //返回的是一个对象要tostring
        String uuid = UUID.randomUUID().toString();
        //把字符串替换
        uuid = uuid.replace("-","");
        return uuid;
    }
}
