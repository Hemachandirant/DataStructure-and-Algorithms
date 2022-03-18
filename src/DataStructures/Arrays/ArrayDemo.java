package DataStructures.Arrays;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
	
		
		int arr[] = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		System.out.println(Arrays.toString(arr));
		
		System.out.println("-------------------");
		
		String fruits[] = new String[5];
		fruits[0] = "Apple";
		fruits[1] = "orange";
		fruits[2] = "Banana";
		fruits[3] = "Pineapple";
		fruits[4] = "Strawberry";
		
		System.out.println(Arrays.toString(fruits));
		System.out.println("--------------------------------");
		
		int num[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(maxIntArray(num));
	}

	public static int maxIntArray(int arr[]) {
		int max = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if(arr[index]>max) {
				max = arr[index];
			}
			
			
		}return max;
	}
}
