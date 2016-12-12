package lesson7;

import java.util.Arrays;

public class Task04ArrayMirror {

	public static void main(String[] args) {
		
		int[] array = {10,1,2,66,1,66,2,1,10};
		int arrayLength = (int)array.length/2; 
		boolean mirrorArray =false;
		
		
		for (int i=0;i<arrayLength;i++){
			if(array[i]!=array[array.length-i-1]){
				mirrorArray=false;
				break;
			}else{
				mirrorArray=true;
			}
		}
		if(mirrorArray!=false){
			
			System.out.println("Yea baby Mirroring is observed" + Arrays.toString(array));
		}else{
		System.out.println("No Mirroring in the array");
		}
//
	}

}
