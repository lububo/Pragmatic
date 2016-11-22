package lesson02;

import java.util.Scanner;

public class Task5 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value 1");
		int a = input.nextInt();
		System.out.println("Enter value 2");
		int b = input.nextInt();
		
		for(int i =a; i <= b; i++){
			System.out.print(i+" ");
		}
		
		input.close();
	}

}
