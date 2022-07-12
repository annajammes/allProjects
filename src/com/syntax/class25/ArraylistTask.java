package com.syntax.class25;

import java.util.ArrayList;

public class ArraylistTask {
    public static void main(String[] args) {


    ArrayList<String > nameList=new ArrayList<>();
    nameList.add("saba qamar");
    nameList.add("Lara");
        System.out.println(nameList);
        ArrayList<String > nameListInt=new ArrayList<>();
        nameListInt.add("bataoni");
        System.out.println(nameListInt);
      boolean value=  nameList.isEmpty();
        System.out.println(value);
        boolean value1=  nameList.contains("Lara");
        System.out.println(value1);
        ArrayList<String> nameList3=new ArrayList<>();
        nameList3.addAll(nameList);
        nameList3.addAll(nameListInt);
        System.out.println(nameList3);
        System.out.println( nameList3.size());

}}
