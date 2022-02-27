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
public class leap_year {
    public static void main(String[] args) {
        int year = 2016;

        isLeapYear(year);
        System.out.println(isLeapYear(year));
    }

    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
            return true;
        }

        return false;

    } 
}
