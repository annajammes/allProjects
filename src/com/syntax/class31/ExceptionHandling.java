package com.syntax.class31;

public class ExceptionHandling  {
    public static void main(String[] args) {
        AgeHandler.ageEligibality(15);

}}
class AgeHandler{
    public static int ageEligibality(int age){
        if (age<16){
            throw new ArithmeticException("age should not be less than 16");
        }
        return age;
    }
}
