/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author Student
 */
public class hour_minute_seconds {
     public static void main(String[] args) {
         System.out.println("==========work=======");
        int sec = 86399;
        int p1 = sec % 60;
        int p2 = sec / 60;
        int p3 = p2 / 60;
        p2 = p2 / 60;
        System.out.println(p2 + ":" + p3 + ":" + p1);
    }
}

