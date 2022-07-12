package com.syntax.class27;

import org.apache.poi.hssf.record.cf.DataBarThreshold;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        LinkedHashMap<String,Double>record=new LinkedHashMap<>();
        record.put("Alen", 123078.0);
        record.put("Nora",345690.987);
        record.put("Jskin",16734.90);
        record.put("Madnies",00023.0);
        String name=null;
        Double sal=0.0;
       Set<Map.Entry<String,Double>> eeentry=record.entrySet();
      Iterator <Map.Entry<String,Double>> it= eeentry.iterator();
      while (it.hasNext()){
        Map.Entry<String,Double> list= it.next();//find largest values
          Double salary=list.getValue();

        if(sal<salary){
            sal=salary;
            name=list.getKey();
        }
    }
        System.out.println(name+"  =$  "+sal);
}}
