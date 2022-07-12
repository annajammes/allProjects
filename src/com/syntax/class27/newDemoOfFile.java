package com.syntax.class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class newDemoOfFile {
    public static void main(String[] args) throws IOException {
        String path="D:/SDET/config.properties";
        FileInputStream fileInput=new FileInputStream(path);
        Properties properties=new Properties();//to deal with properties file we need properties class object
        properties.load(fileInput);//providinfg the referecne of input stream to properties object to load data form the file
                                     //loading the data into property object form file
        System.out.println(properties.get("userName"));
        fileInput.close();
}}
