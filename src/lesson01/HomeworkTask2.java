package lesson01;

import java.util.Scanner;

public class HomeworkTask2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a:");
		int a = input.nextInt();
		System.out.println("enter b:");
		int b = input.nextInt();
		
		//Summing numbers
		int sum  = a+b;
		System.out.println("Summing the nubers gives: "+sum);
		//Subtracting numbers
		int sub  = a-b;
		System.out.println("Substraction result is: "+sub);
		
		//Multiplying numbers
		int multy  = a*b;
		System.out.println("Multiplying result is: "+multy);
		
		//Dividing numb
		int div  = a/b;
		System.out.println("Division result is: "+div);
		
		//Division with reminder
		int dwr  = a%b;
		System.out.println("The reminder of division is: " + dwr);
		
		
				
		

	}
}
