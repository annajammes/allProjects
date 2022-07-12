package com.syntax.class20;

public class Degree {

       void getPrerequist(){
            System.out.println("From degree to get a degree you school diploma");
        }
    }

class Bachlor extends Degree{

}
class Master extends Degree{

    void getPrerequist(){
        System.out.println("From master to get a degree you dont need  school diploma");
    }}

   class Tester{
    public static void main(String []args){
    Degree ob1=    new Degree();
       Bachlor ob2= new Bachlor ();
      Master ob3=  new Master();
      ob1.getPrerequist();
        ob2.getPrerequist();
        ob3.getPrerequist();
    }
}