package com.example;

public class Resulting_data_type {

	public static void main(String[] args) {
		
		/*
		 				  Result
		  byte + short --> int
		  
		  short + int --> int
		  
		  long + float --> float
		  
		  int + float --> float
		  
		  long + double --> double
		  
		  float + double --> double
		  
		  character + int --> int     character will be converted to equivalent ascii value
		  
		  character + short --> int
		  
		 */
		
		int a =5; 
		char a1='a';
		
		System.out.println(a+a1);
		
		
	}

}
