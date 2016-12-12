package lesson7;

import java.util.Arrays;

public class Task05Array {

	public static void main(String[] args) {
		
		double[] dbl = new double[10];
		for (int i = 0; i < dbl.length; i++) {
			dbl[i]=i*3;
		}
		System.out.print(Arrays.toString(dbl));

	}

}
