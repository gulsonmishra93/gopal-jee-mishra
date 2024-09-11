package com.practice.demo;

import java.net.StandardSocketOptions;

public class CHar {

    public static void main(String[] args) {
        String str = "gop123  1234aafaf";

        System.out.println(str.replaceAll("[0-9]",""));

        
       char[] ch = str.toCharArray();
       int alp = 0;
       int digit =0;
               int space  =0;
       for(char c : ch){

          // System.out.println(c);

           if(Character.isDigit(c)) {
               digit++;
             //  System.out.println("it is digit");
           }
           if(Character.isLetter(c)) {
               alp++;
             //  System.out.println("it is letter");
           }
           if(Character.isWhitespace(c)) {
               space++;
              // System.out.println("it is whitespace");
           }
       }

        System.out.println("alphabet ==="+alp);
        System.out.println("digit ==="+digit);
        System.out.println("spaces ==="+space);



    }
}
