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
public class singleton {
  private static singleton st = null;


	private singleton() {
	
	}
	
	public static singleton getInstance() {
		if(st==null) {
			st = new singleton();
		}
		return st;
	}  
}
