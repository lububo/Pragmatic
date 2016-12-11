package lesson7;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {

		int[] arr1 = { 10, 66, 12, -41, 50 };
		Arrays.sort(arr1);

		int tmpMin = arr1[0];

		for (int i : arr1) {

			if (i % 3 == 0 ) {
				int tmp = i;
				if( tmp < tmpMin){
					tmpMin = tmp;
				}
			}

		//	 System.out.println("There is no nuber that is divided by 3 in the array");
		
		}
		
		System.out.println("The smalles number that is divided by 3 is: " + tmpMin);

	}

}
