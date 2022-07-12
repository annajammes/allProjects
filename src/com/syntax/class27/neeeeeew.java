package com.syntax.class27;

public class neeeeeew {
    public static void main(String[] args) {
       int [] array={1,4,8,10,3,1};
        int num=0;
        for (int i = 0; i < array.length; i++) {
          int   largest=array[i];

            if(num<largest){
                num=largest;
            }
        }
        System.out.println(num);
    }


}
