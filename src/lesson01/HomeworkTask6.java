package lesson01;

import java.util.Scanner;

public class HomeworkTask6 {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter firstNumber");
		int a1  = input.nextInt();
		System.out.println("Enter secondNubmer");
		int a2 = input.nextInt();
		System.out.println("Enter thirdNubmer");
		int a3  = input.nextInt();
		
		int buffer1 =a1;
		
		System.out.println("Before change the nubers are a1=" + a1+" a2="+a2+" a3="+a3);
		a1 = a2;
		a2 = a3;
		a3 = buffer1;
		
		System.out.println("After change the nubers are a1=" + a1+" ;a2="+a2+" ;a3= "+a3);

		
		
		
		
		
		
		
		
	}

}
