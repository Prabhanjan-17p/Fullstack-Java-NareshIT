package com.nareshIT.day1;

public class CalculateStudentPercentage 
{
    public static void main(String[] args) 
    {

    }   
}
class Student {
    protected String name ;
    protected int rollNumber;
    Student(String name,int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public void displayDetails(){
        System.out.println("Name :"+name);
        System.out.println("Roll number :"+rollNumber);
    }
}
class ScienceStudent extends Student{
    private int physicsMarks;
    private int chemistryMarks;
    private int mathMarks;
    ScienceStudent(String name,int rollNumber,int physicsMarks,int chemistryMarks,int mathMarks){
        super(name,rollNumber);
        this.physicsMarks = physicsMarks;
        this.chemistryMarks= chemistryMarks;
        this.mathMarks = mathMarks;
    }
    public void displayDetails(){
        System.out.println("Name :"+name);
        System.out.println("Roll number :"+rollNumber);
        System.out.println("cds :"+rollNumber);
    }
}
class ArtsStudent{

}