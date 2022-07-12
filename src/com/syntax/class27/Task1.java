package com.syntax.class27;

import java.security.KeyStore;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args) {
        TreeMap<String,String >map=new TreeMap<>();
        map.put("islamabad","pakistan");
        map.put("souel","korea");
        map.put("london","england");
        map.put("istanbul","turkey");
        System.out.println(map);
        System.out.println("----------------------1");
   Set< Map.Entry<String ,String >> pair = map.entrySet();
        for (Map.Entry<String ,String > entry:
             pair) {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        };
        System.out.println("----------------------2");

     Iterator<String> it  =map.values().iterator();
     while ((it.hasNext())){

         System.out.println( it.next());
     }
    }

}
