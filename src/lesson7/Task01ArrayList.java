package lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task01ArrayList {

	public static void main(String[] args) {

		List<Integer> ls = new ArrayList<Integer>();
		 ls.add(10); 
		 ls.add(67);
		 ls.add(12);
		 ls.add(-742);
		 ls.add(50);

		int tmpMin = Integer.MAX_VALUE;

		for (int val : ls) {

			if (val % 3 == 0) {
				if (val < tmpMin) {
					tmpMin = val;
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
