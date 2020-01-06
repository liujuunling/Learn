package com.learn.mqtt;

import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;

public class TestMain {


    @Value("${spring.mqtt.url}")
    private static String hostUrl;

    public static void main(String[] args) {
        String str = "asdhfjk,asjdf,asdwet";
        String[] arrys = new String[]{str};
        System.out.println("hostUrl ===" + arrys[0]);
    }




}
