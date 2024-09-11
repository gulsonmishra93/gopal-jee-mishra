package com.practice.demo.StringCounter;

import java.util.HashMap;
import java.util.Map;

public class CountString {

    public static void main(String[] args) {
        String str = "gopal";
        char[] ch = str.toCharArray();

        Map<Character,Integer> hmap = new HashMap<Character,Integer>();

        for(char c : ch){
            if(hmap.containsKey(c)){
                hmap.put(c,hmap.get(c)+1);
            }
            else {
                hmap.put(c,1);
            }

        }

        for(Map.Entry<Character,Integer> entry : hmap.entrySet()){
            System.out.print(entry.getKey()+" ");
            System.out.print(entry.getValue()+" ");
        }
    }
}
