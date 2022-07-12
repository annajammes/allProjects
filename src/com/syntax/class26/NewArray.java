package com.syntax.class26;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

public class NewArray {
    public static void main(String[] args) {
        ArrayList<String> carList=new ArrayList<>();
        carList.add("tea");
        carList.add("pepsi");
        carList.add("sprit");
        carList.add("lemon juice");
        for (int i = 0; i <carList.size() ; i++) {

            if(carList.get(i).toLowerCase().replaceAll("[ae]","").length()<carList.get(i).length()){
                carList.set(i,"water");

            }
            } System.out.println(carList);
        }

    }

