package com.syntax.class26;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Insurance {
  public Insurance(String insuranceName) {
    this.insuranceName = insuranceName;
  }String  insuranceName;
abstract void getQote();
  abstract void cancelInsurance();
}

class Pet extends Insurance{
  public Pet(String insuranceName, String carModel) {
    super(insuranceName);
    this.carModel = carModel;
  }String carModel;

  @Override
  void getQote() {
    System.out.println("this is class pet qouote");
  }

  @Override
  void cancelInsurance() {
    System.out.println("this is class pet cancel insurance");
  }
}
class Health extends Insurance{
  public Health(String insuranceName,String healthInsurance) {
    super(insuranceName);
    this.healthInsurance = healthInsurance;
  }
  String healthInsurance;

  @Override
  void getQote() {
    System.out.println("this is class health qouote");
  }

  @Override
  void cancelInsurance() {
    System.out.println("this is class health cancel insurance");
  }
}
class Tester{
  public static void main(String[] args) {
   Pet o1  =new Pet("a","b");
    Health o2  =new Health("c","d");
    ArrayList<Insurance> list=new ArrayList();
    list.add(o1);
    list.add(o2);
    Iterator it= list.iterator();
    while (it.hasNext()) {
      Insurance object= (Insurance) it.next();
      object.getQote();
      object.cancelInsurance();
      }

  }}