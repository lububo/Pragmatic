package lesson7;

import java.util.Arrays;
import java.util.Scanner;

//fibonachi  row executed with array


public class Task03Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		
		System.out.println("Enter value: ");
		array[0]=sc.nextInt();
		
		int arrayCurrent=0;
		int arrayOldValue=array[0];
		
		for (int i = 1; i < array.length; i++) {
			
			array[i]=arrayCurrent+arrayOldValue;
			arrayCurrent = array[i];
			arrayOldValue = array[i-1];
			
			
						
		}
		System.out.println(Arrays.toString(array));
		
	}

}
