package lesson7;


import java.util.Arrays;
import java.util.Scanner;

public class Task02Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter array lenght dividable by 2: ");
		int[] array = new int[sc.nextInt()];
		int[] arrayTmp = new int[array.length/2];
				System.out.println(" Eneter " + array.length/2+ " elements");
		
				for (int i = 0; i < arrayTmp.length; i++) {
					arrayTmp[i]=sc.nextInt();
				}
				
				System.out.println(Arrays.toString(arrayTmp));
					
				System.arraycopy(arrayTmp, 0, array, 0, arrayTmp.length);
				System.out.println("First copy: "+ Arrays.toString(array));
				System.arraycopy(arrayTmp, 0, array, array.length/2, arrayTmp.length);
				System.out.println("Full copy: "+Arrays.toString(array));
	
	
	}

}
