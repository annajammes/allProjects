package com.syntax.class28;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelTask {
    public static void main(String[] args) throws IOException {
        String path="D:/SDET/4 Java/4 Java/config.xlsx";
        FileInputStream reading=new FileInputStream(path);
        XSSFWorkbook newBook=new XSSFWorkbook(reading);
        XSSFSheet sheet1=newBook.getSheet("Sheet1");
     int noOfRows= sheet1.getPhysicalNumberOfRows();
        System.out.println(noOfRows);
       Row row0= sheet1.getRow(0);
       List<Map<String,String>> createList=new ArrayList<>();
        for (int i = 1; i < noOfRows; i++) {
            XSSFRow row= sheet1.getRow(i);
      LinkedHashMap<String ,String> map= new LinkedHashMap();
           int cellNo =row.getPhysicalNumberOfCells();
            for (int j = 0; j < cellNo; j++) {
                map.put(row0.getCell(j).toString(),row.getCell(j).toString());
            }createList.add(map);
        }
        System.out.println(createList);
        reading.close();
    }
}
