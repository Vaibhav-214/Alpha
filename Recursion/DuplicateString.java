package com.company.Recursion;

public class DuplicateString {
    public static String noDuplicate(String str,int index,StringBuilder sb,Boolean [] present) {


        if (present[str.charAt(index) - 'a'] != true) {
            sb.append(str.charAt(index));
            present[str.charAt(index) - 'a'] = true;
        }
        if (index == str.length() - 1) {
            return sb.toString();
        }
        return noDuplicate(str,index + 1,sb,present);
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Boolean[] present = new Boolean[26];
        for (int i=0; i< present.length;i++){
            present[i] = false;
        }
        System.out.println(noDuplicate("appnnacollege",0,sb,present));

    }
}
