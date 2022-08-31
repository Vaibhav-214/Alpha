package com.company.Strings;

public class Uppercase {
    public static String upper(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i< str.length(); i++){
            if (i==0 || str.charAt(i-1) == ' ') {
               sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String test = "my Name is vaibhav";
        System.out.println(upper(test));
    }
}
