package lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task03List {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List ls = new ArrayList();
		
		System.out.println("Enter value: ");
		int nextInt=sc.nextInt();
		
		int sum=0;
		int  currentInt=0;
		int oldIndex=nextInt;
		
		for (int i = 1; i < 10; i++) {
			
			sum = oldIndex +currentInt;
			ls.add(sum);
			currentInt = sum;
			oldIndex=(int)ls.get(i-1);
			
			
//			array[i]=arrayCurrent+arrayOldValue;
//			arrayCurrent = array[i];
//			arrayOldValue = array[i-1];
			
		}
		System.out.println(ls.toString());
		
	}

}
