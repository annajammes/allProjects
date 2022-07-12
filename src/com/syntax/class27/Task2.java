package com.syntax.class27;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> storeItem=new LinkedHashMap();
        storeItem.put(7664847,"Printer");
        storeItem.put(7879885,"Tv");

        Set<Map.Entry<Integer,String>> combination=storeItem.entrySet();
     Iterator<Map.Entry<Integer, String>> it= combination.iterator();

     while (it.hasNext()){
        Map.Entry<Integer,String>list= it.next();
         System.out.println(list.getKey()+"   "+list.getValue());
     }

    }
}
