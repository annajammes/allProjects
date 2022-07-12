package com.syntax.class26;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setclass {
    public static void main(String[] args) {
    /*    TreeSet<String> treenode=new TreeSet<>();
        treenode.add("pakistan");
        treenode.add("india");
        treenode.add("afghanistan");
        treenode.add("tajikistan");
        System.out.println(treenode);//corect but cannot work with following code.
    }*/
    LinkedHashSet <String> hashmasal=new LinkedHashSet<>();
     hashmasal.add("lahore");
     hashmasal.add("multan");
     hashmasal.add("pakpatan");
     hashmasal.add("afzalabad");
        System.out.println(hashmasal);
        hashmasal.remove("afzalabad");
        System.out.println(hashmasal);
}}

