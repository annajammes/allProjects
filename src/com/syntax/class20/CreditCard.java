package com.syntax.class20;

public class CreditCard {
    double balance;
    double intrest;
    double calculateIntrest(double balance ,double intrest){
        this.balance=balance;
        this.intrest=intrest;
     double result =(balance*intrest)/100;

      return  result;
    }
}

 class Visa extends CreditCard {
   /* double balance;
    double intrest;
    double calculateIntrest(double balance ,double intrest){
        return   (balance*intrest)/100;*/
    }

class Ax extends CreditCard {
    double calculateIntrest(double balance ,double intrest){
        System.out.println("method is overriden");
        return   (balance*intrest)/100;
    }
}
class Tester1{
    public static void main(String []args){
        CreditCard ob1=    new CreditCard();
        Visa ob2= new Visa ();
        Ax ob3=  new Ax();
        System.out.println(ob1.calculateIntrest(100,2.5));
        ob2.calculateIntrest(200,1.5);
        ob3.calculateIntrest(400,1);
    }
}