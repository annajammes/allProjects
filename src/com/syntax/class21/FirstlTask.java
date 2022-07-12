package com.syntax.class21;

public class FirstlTask {
    public static void main(String[] args) {
/*Student object=new CollegeStudents();
        object.methodPrint();
        //object.methodSpecial(); it will not work
         CollegeStudents object2=new CollegeStudents();
        object2.methodSpecial();

        Student object1=new SchoolStudents();
        object1.methodPrint();*/

        Student[] student={new CollegeStudents(),new SchoolStudents(),new SyntaxStudents()};
        for (Student object:student) {
            object.methodPrint();
            if( object instanceof CollegeStudents){
                ((CollegeStudents) object).methodSpecial();

            }
        }

    }

}
 class Student{
void methodPrint(){
        System.out.println("this is the parent calss method");
    }
}
class SyntaxStudents extends Student{
    void methodPrint(){
        System.out.println("this is the syntx child  calss method");
    }
}
class CollegeStudents extends Student{
    void methodPrint(){
        System.out.println("this is the college child calss method");
    }
    void methodSpecial(){
        System.out.println("this is the special college  calss method");
    }
}
class SchoolStudents extends Student{
    void methodPrint(){
        System.out.println("this is the school  calss child method");
    }
}