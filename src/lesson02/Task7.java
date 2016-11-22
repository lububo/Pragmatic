package lesson02;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value n");
		int n = input.nextInt();
		
		for(int i =3; i <= n; i++){
			if(i%3== 0){
			System.out.print(i+", ");
			} 
		}
		
	}

}
