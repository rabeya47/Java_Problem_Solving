/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;




public class swap {
      public static void main(String[] args) {
        int a = 8;
        int b = 9;

        System.out.println("before swapping values are :" + a + "," + b);
        a = a + b; // 17
        b = a - b; // 8
        a = a - b; // 9

        System.out.println("after swapping values are :" + a + "," + b);

    }
}
