package com.syntax.class26;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenarrayList {
    public static void main(String[] args) {
        ArrayList<Integer> intList=new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            if(i%2==0){
                intList.add(i);
            }

        }
        System.out.println(intList);
      Iterator it= intList.iterator();
        while (it.hasNext()) {
         int   num= (int) it.next();
            if(num%5==0){
                it.remove();
            }
        } System.out.println(intList);
    }

}
