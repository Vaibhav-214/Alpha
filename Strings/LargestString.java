package com.company.Strings;

public class LargestString {
    public static String largest(String [] str){
        String max = "";
        for (String element: str){
            if(element.compareToIgnoreCase(max) > 0){
                max = element;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        //Time complexity is O(x*N) where x is the length of largest string and N is number of strings
        String [] str = {"apple","banana","mango","Vaibhav"};
        System.out.println(largest(str));
    }
}
