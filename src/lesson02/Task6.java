package lesson02;

import java.util.Scanner;

public class Task6 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value 1");
		int a = input.nextInt();
		int sum =0;
		
		for(int i =1; i <= a; i++){
			System.out.print(i+", ");
			sum +=i;
			
		}
		System.out.println(" The summ of all the numers is: " + sum);
		
	}

}
