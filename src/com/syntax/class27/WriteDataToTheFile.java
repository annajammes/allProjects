package com.syntax.class27;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WriteDataToTheFile {
    public static void main(String[] args) throws IOException {
        String path="File/TestToWrite.properties";
        FileOutputStream output=new FileOutputStream(path);
        Properties pro=new Properties();
        pro.put("1","Bananana");
        pro.put("2","Apple");
        pro.store(output,"its a success");
        output.close();
    }
}
