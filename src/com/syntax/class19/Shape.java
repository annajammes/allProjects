package com.syntax.class19;
class Tester1{
    public static void main(String [] args){
    Circle ob=new Circle(2.0,3.14);
    ob.calculateCircle();
        }}
public class Shape {
    double ridus;
    double pi;
    Shape(double ridus,double pi){
        this.ridus=ridus;
        this.pi=pi;
    }
}
 class Circle extends Shape {
Circle(double ridus,double pi){
    super( ridus, pi);
}
    void calculateCircle (){
       // originalRadisus=super.ridus;
      //  originalPi=super.pi;
        System.out.println(super.ridus*super.ridus*super.pi);
    ;
    }
}