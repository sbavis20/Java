package com.example;

public class Operators {

	public static void main(String[] args) {
		/* Operators are used to perform operations on variables and values
		
		  2        	+  	     2   =   4
	  operand    operator operand   result
		
		Types of Operators
		Arithmetic  +,-,*,/,%,++,--
		Assignment =,+=
		Comparison ==,>=,<=
		Logical	   &&,||,!
		Bitwise  &,|
		 
		 */
		
		int a = 2;
		int b = 8 % a; //Modulo Operator (Remainder output)
		
		System.out.println(b);
		
		b = 9;
		b += 3;  //(Add 3 in b  --> b=b+3; )
		
		System.out.println(b);
		
		System.out.println(5==6);   // Comparison operator return true/false
		
		System.out.println(5>6);
		
		System.out.println(5<6); 
		
		System.out.println(5>=6); //5 is greater than OR equal to 6
		
		System.out.println(5<=6); //5 is less than OR equal to 6
		
		
		System.out.println(2<5 && 5>6); //Logical Operator AND --> any one condition false whole statement will became false
		
		System.out.println(5>6 || 2<5); //OR - one true whole statement will be true
		
		/*bitwise AND operation
		 11    -- 3 in binary
		 10    -- 2 in binary
		 --		AND Operation
		 10 	-- 2 in binary
		 */
		
		System.out.println(2&3); //output 2
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
