package com.syntax.class24;

class Tester{
public static void main(String[] args) {
        Truck obj = new Truck();
        obj.calculateSalePrice();
    System.out.println( obj.calculateSalePrice());
        }}
interface InterfaceTask1 {
  int  vehicelPrice=100;
   double calculateSalePrice();


}
class Sedan implements InterfaceTask1{
    double weight=101;
    double priceCar;
   public double calculateSalePrice(){
        if(weight>2000){
            priceCar=vehicelPrice*10/100;
        }else{
            priceCar=vehicelPrice*20/100;
    }return priceCar;
}}
class Truck implements InterfaceTask1{
    double length=21;
    double priceCar;
   public double calculateSalePrice(){
        if(length>20){
            priceCar=vehicelPrice*5/100;
        }else{
            priceCar=vehicelPrice*10/100;
        }return priceCar;
    }}
