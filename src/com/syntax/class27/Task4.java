package com.syntax.class27;

import java.util.LinkedHashSet;

public class Task4 {
    public static void main(String[] args) {
        LinkedHashSet<String> newSet=new LinkedHashSet<>();
        LinkedHashSet<String> seconlSet=new LinkedHashSet<>();
        newSet.add("Pencil");
        newSet.add("Book");
        newSet.add("Laptop");
        newSet.add("Color");

        seconlSet.add("purple");
        seconlSet.add("golden");
        seconlSet.add("Balack");
        newSet.addAll(seconlSet);
        System.out.println(newSet);

    }
}
