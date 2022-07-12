package com.syntax.class27;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExcelTest {
    public static void main(String[] args) throws IOException {
        String path="File/config.properties";
        FileInputStream fileInput=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInput);
        System.out.println(properties.get("userName"));
        //XSSFWorkbook sheet=new XSSFWorkbook();
    }

}
