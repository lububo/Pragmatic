package lesson01;

import java.util.Scanner;

public class HomeworkTask5 {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter firstNumber");
		int firstNubmer  = input.nextInt();
		System.out.println("Enter secondNubmer");
		int secondNubmer = input.nextInt();
		System.out.println("Enter thirdNubmer");
		int thirdNubmer  = input.nextInt();
		
		System.out.println("The three nubers are: " + firstNubmer+" "+secondNubmer+" "+thirdNubmer);
		
		if(firstNubmer>secondNubmer && firstNubmer>thirdNubmer){
			System.out.print(firstNubmer+" ");
			if (secondNubmer > thirdNubmer){
				System.out.println(secondNubmer + " " + thirdNubmer);
			}else {
				System.out.println(thirdNubmer + " " + secondNubmer);
			}
		}else if (secondNubmer>firstNubmer && secondNubmer>thirdNubmer){
			System.out.print(secondNubmer+" ");
			if (firstNubmer>thirdNubmer){
				System.out.println(firstNubmer +" "+ thirdNubmer);
			}else{
				System.out.println(thirdNubmer +" "+ firstNubmer);
			}
		}else if (thirdNubmer > firstNubmer && thirdNubmer > secondNubmer){
			System.out.print(thirdNubmer+" ");
			if(firstNubmer > secondNubmer){
				System.out.println(firstNubmer + " "+ secondNubmer);
			}else{
				System.out.println(secondNubmer+ " "+ firstNubmer);
			}
		}else{
			System.out.println("All the nubers are equal" + firstNubmer+" "+secondNubmer+" "+thirdNubmer);
			
		}
		
		
		
	}

}
