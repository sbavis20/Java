package com.example;

public class IncreDcre {

	public static void main(String[] args) {
		
		int i =56;
		
		System.out.println(i++); //post increment output 56
		
		System.out.println(i);  //output 57
		
		System.out.println(++i); //pre increment output 58
		
		
		// a++  --> first assign the value and then increment
		
		//++a   --> first increment and then assign value
		
		int y =7;
		int x = ++y +8;
		System.out.println(x);
		
		char a='A';
		a++;
		System.out.println(a); //output B

	}

}
