package com.example;

import java.util.Scanner;

public class PercentageCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Percentage Calculator\n");
		
		int sub1,sub2,sub3,sub4,sub5;
		System.out.print("Enter marks in subject1: ");
		sub1 = input.nextInt();
		System.out.print("\nEnter marks in subject 2: ");
		sub2 = input.nextInt();
		System.out.print("\nEnter marks in subject 3: ");
		sub3 = input.nextInt();
		System.out.print("\nEnter marks in subject 4: ");
		sub4 = input.nextInt();
		System.out.print("\nEnter marks in subject 5: ");
		sub5 = input.nextInt();
		
		float total_marks = sub1+sub2+sub3+sub4+sub5;
		
		System.out.println("Total Marks obtained: "+total_marks);
		
		float percentage = (float)((total_marks / 500 ) * 100);
		
		System.out.println("Percentage is: "+percentage+"%");
		
	}

}
