package com.example;



//03.String reverse
public class reverse {
    public static void main(String[] args){
        String str = "Hellow world";
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
