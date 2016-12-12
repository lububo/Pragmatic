package lesson7;

import java.util.Arrays;

public class Task01Array {

	public static void main(String[] args) {

		int[] arr1 = { 10, 67, 17, -41, 50 };
		Arrays.sort(arr1);

		int tmpMin = Integer.MAX_VALUE;

		for (int i : arr1) {

			if (i % 3 == 0) {
				if (i < tmpMin) {
					tmpMin = i;
				}
			}

		}
		if (tmpMin == Integer.MAX_VALUE) {
			System.out.println("There is no nuber that is divided by 3 in the array");
		}else{
			
			System.out.println("The smalles number that is divided by 3 is: "+ tmpMin);
		}


	}

}
