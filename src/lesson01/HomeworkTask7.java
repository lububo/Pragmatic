package lesson01;

import java.util.Scanner;

public class HomeworkTask7 {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter hours");
		int hours  = input.nextInt(); 
		System.out.println("Enter money");
		Double money = input.nextDouble();
		System.out.println("Are you Healthy true/false");
		boolean iAmIHealthy  = input.nextBoolean();
		
		if (iAmIHealthy == false){
			System.out.println("I wont go out because I'm sick");
			if(money > 50){
				System.out.println("I'll buy drugs from the pharmacy");
			}else{
				System.out.println("I'll stay hme and drink tea");
			}
		}else{
			if(money<=10.5 || hours<18){
				System.out.println("I will grab a coffee");
			}else if (money>=100 && hours>=20){
				System.out.println("I will go to a Fancy Bar");
			}else{
				System.out.println("I'll just go and watch movies");
			}
		}
		
		
	}

}
