package lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task02List {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List list = new ArrayList();
		System.out.println("Enter tmp List lenght: ");
		int listLenght = sc.nextInt();

		for (int i = 0; i < listLenght / 2; i++) {
			list.add(i, sc.nextInt());
		}

		list.addAll(listLenght / 2, list);

		System.out.println(list.toString());

	}

}
