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
public class largest_number {
    
  public static void main(String[] args) {
      int x = 7;
      int y = 20;
      int z = 56;
      int largest = 0;
      
      if(x>largest){
          largest = x;
      }
      
       if(y>largest){
          largest = y;
      }
       
        if(z>largest){
          largest = z;
      }
      
        System.out.println("Largest number is : "+ largest);
  } 
}
