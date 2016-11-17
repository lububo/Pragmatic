package lesson01;

import java.util.Scanner;

public class HomeworkTask1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter nubmer A: ");
		double numbA = input.nextDouble();

		System.out.println("Enter nubmer B: ");
		double numbB = input.nextDouble();

		System.out.println("Enter nubmer C: ");
		double ResultC = input.nextDouble();

		if ((ResultC != numbA && ResultC != numbB)&& (ResultC > numbA && ResultC < numbB)) {
			System.out.println("The C number " + ResultC + " is between A nad B");
		} else {
			if (ResultC == numbA || ResultC == numbB) {
				System.out.println("The C number " + ResultC + " is equal eithr to A either to B");
			} else {
				System.out.println("The C number " + ResultC + " is out of space");
			}
		}

	}
}
