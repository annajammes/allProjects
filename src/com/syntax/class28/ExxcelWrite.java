package com.syntax.class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExxcelWrite {
    public static void main(String[] args) throws IOException {
        String path="D:/SDET/4 Java/4 Java/test.xlsx";
        XSSFWorkbook newBook=new XSSFWorkbook();
        Sheet sheet=newBook.createSheet("Sheet1");
        Row row=sheet.createRow(0);
       Cell cell= row.createCell(0);
       cell.setCellValue("saima");
        FileOutputStream writing=new FileOutputStream(path);
        newBook.write(writing);
        writing.close();
}}
