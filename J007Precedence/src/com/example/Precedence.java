package com.example;

public class Precedence {

	public static void main(String[] args) {
		
		int a = 6*5-34/2;
		
		//precedence  * / is greater than + -
		
		//30-17 = 13
		System.out.println(a);
		
		int b= 60/5-34*2;
		/*Associativity --> when precedence is same
		 
		 * / --> Left to Right
		 
		 + - --> Left to Right
		 
		 ++,= --> Right to Left
		 
		 12-34*2
		 12-68
		 -56  Answer
		 */
		System.out.println(b);
		
		
		int x = 6;
		int y =1;
		int k =x * y/2;
		System.out.println(k);
		
		int a1= 5;
		int b1=1;
		int c = 5;
		int k1 = b1*b1 - (4*a1*c)/(2*a);
		
		System.out.println(k1);
		
		
		
		

	}

}
