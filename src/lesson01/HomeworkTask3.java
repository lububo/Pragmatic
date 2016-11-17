package lesson01;

import java.util.Scanner;

public class HomeworkTask3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a:");
		double a = input.nextDouble();
		System.out.println("enter b:");
		
		double b = input.nextDouble();
		
		System.out.println("the a bumber is "+a+" and b nuber is "+b);
		
		double c =a;
		a=b;
		b=c;
		System.out.println("after some tweaking");
		System.out.println("the a bumber is "+a+" and b nuber is "+b);
		
		
		
		
	}

}
