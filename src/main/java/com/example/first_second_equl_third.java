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
public class first_second_equl_third { 
    
      public static void main(String[] args) {
         System.out.println("====================Working=====================");
          int first =5;
          int second = 10;
          int third =15;
          System.out.println(isTrue(first,second,third));
    
        
    }
    
    
    private static boolean isTrue(int first,int second,int third){
        
       
        int sum ;
        sum = first + second;
    
     if(sum == third){
         System.out.println(sum);
         return true;
     }
     return false;
    }
    
    
  
//      public static void main(String[] args) {
      
//          int first =5;
//          int second = 10;
//          int third =15;
//         
//     if(first + second == third){
//         System.out.println("true");
//     }
//    
//        
//    }
    
}
