package com.syntax.class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task8 {
    public static void main(String[] args) throws IOException {
        String path="File/config.properties";
        FileInputStream input=new FileInputStream(path);
        Properties pro=new Properties();
        pro.load(input);
        System.out.println( pro.get("browser"));
        System.out.println( pro.get("url"));
        input.close();
    }

}
