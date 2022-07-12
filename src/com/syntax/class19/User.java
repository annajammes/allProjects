package com.syntax.class19;
class Tester{
public static void main(String []args){
        UserInfo user =new UserInfo("saima","123","krk");
        user.userDetailMethod();
        }}

public class User {
    String name;
    String mobileNumber;
    User(String name,String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
}
class UserInfo extends User{
    String address;

    UserInfo(String name,String mobileNumber,String address){
        super(name,mobileNumber);
        this.address=address;
    } 
   void  userDetailMethod(){
       System.out.println("name   "+super.name+"   mobileNumber   "+super.mobileNumber+"\n"+address);
        
    }
    
}
