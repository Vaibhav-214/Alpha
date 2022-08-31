package com.company.Strings;
import java.math.*;
public class ShortestPath_mysol {
    public static double displacemnet(String str){
        int EW = 0;// x direction on graph
        int NS = 0;// y direction on graph
        for(int i = 0; i < str.length() ; i++ ) {
            char temp = str.charAt(i);

            switch(temp){
                case 'E' :
                    EW++;
                    break;
                case 'W':
                    EW--;
                    break;
                case 'N':
                    NS++;
                    break;
                case 'S':
                    NS--;
                    break;
            }
        }
        double shortestroute = Math.sqrt((EW*EW) + (NS*NS));
        return shortestroute;
    }

    public static void main(String[] args) {
        //Time complexeity is O(n)
        String str = "WNEENESENNN";
        System.out.println(displacemnet(str));
    }
}
