package lesson01;

import java.util.Scanner;

public class HomeworkTask4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("enter a:");
		double A = input.nextDouble();
		System.out.println("enter b:");

		double B = input.nextDouble();

		System.out.println("the A number is " + A + " and B nuber is " + B);

		if (A > B) {
			System.out.println("A is bigger then B");
			System.out.println("Line is " + B + ", " +  A);
		} else {
			if (B > A) {
				System.out.println("B is bigger then A");
				System.out.println("Line is " + A + ", " + B);
			} else {
				System.out.println("A and B are equal");
			}

		}
	}

}
