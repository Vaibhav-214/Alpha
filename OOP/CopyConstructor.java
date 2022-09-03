package com.company.OOP;

public class CopyConstructor {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Vaibhav";
    s1.roll = 214;
    s1.password = "JaiShreeRam";
    // Let's say that the student forgets his password So we create a new object fot that student
        //We want all the information to be same, so we use Copy constructor
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;//marks for s1 object are set
        System.out.println("marks of s1 "+ s1.marks[2]);
        Student s2 = new Student(s1);//copying properties of s1 in s2 including marks but not password
        s2.password = "JaiShreeKrishna";
        System.out.println("marks of s2 after copying them from s1 "+ s2.marks[2]);
        s1.marks[2] = 100;// changing  marks of s1 after copying old marks to s2 so s2 should still have previous marks of s1
        // lets see
        System.out.println("marks of s1 changed");
        System.out.println("marks of s1 "+ s1.marks[2]);
        System.out.println("marks of s2 after changing marks of s1 " + s2.marks[2]);
        //we didnt changed marks of s2 then too they got changed after we changed marks of s1.Why?
        // this happened because when we wrote in copy constructor this.marks = s1.marks here its getting copied by refernce
        // and not by value.So S2 has memory address of s1 marks and therefore all changes we make in s1 marks will reflect
        // in s2 as well and vice versa
        s2.marks[0]= 120;
        System.out.println("marks of s2 changed to " +s2.marks[0] );
        System.out.println("marks of s1 "+s1.marks[0]);
    }
}
class Student {
    String name;
    int roll;
    String password;
    int marks[];


//    Student(Student s1) {// Shallow copy constructor
//        marks = new int[3];
//        this.name = s1.name;
//        this.roll = s1.roll;
//        // we are not copying password because we want to set another password
//        this.marks = s1.marks;
//    }

    Student(Student s1) {// Deep copy constructor
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        // but for marks instread of directly assigning array we will assign individual values using loop
        for (int i= 0; i<marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
    Student() {//Constructors are invoked when a new object is created
        //They have same name as class name and they don't have a return type
        marks = new int[3];

        System.out.println("Constructor is called...");
    }
    Student (String name) {
        this.name = name;// here this keyword is used to refer to current object property
        // because parameter identifier is same as class property identifier(i.e. name)
        marks = new int[3];

    }
    Student(int roll) {
        this.roll = roll;
        marks = new int[3];

    }
}
