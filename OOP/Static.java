package com.company.OOP;

public class Static {
    public static void main(String[] args) {
    Students s1 = new Students();
    s1.schoolName = "All saints high school";
    Students s2 = new Students();
        System.out.println(s2.schoolName);// Although we didnt set schoolName for s2 we get schoolName which was set for s1
        // so once a static property is initialized by any object all other objects created will have that value of that
        // property
        s2.schoolName = "Birla";//Now if we change it for any object it will change for all objects
        // So static keyword makes any property,function,blocks,etc haee only one memory location whose reference every object has
        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);
    }
}
class Students {
    static int returnpercentage(int maths, int physiscs, int chem) {// we are making this funciton static cause for every student
        // formula to calculate percentage will be same, so no extra memory for function to calculate percentage for every student
        // should be wasted
        return (maths + physiscs + chem)/3;
    }
    private String name;
    int roll;

     static String schoolName;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
