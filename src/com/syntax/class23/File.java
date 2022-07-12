package com.syntax.class23;

public abstract class File {
  abstract void  open();
    void  close(){
        System.out.println("this is a clsoe method");
    }
    void  edit(){
        System.out.println("thsi is a edit method");
    }
}
class JavaFile extends File{
     void  open(){
         System.out.println("to open a java fiel you need a notpad");
     }
}
class WordFile{
    void  open(){
        System.out.println("to open a doc fiel you need a microsoft");
}

}
class PdFile{
    void  open(){
        System.out.println("to open a PD file you need a acobat");
    }

}
