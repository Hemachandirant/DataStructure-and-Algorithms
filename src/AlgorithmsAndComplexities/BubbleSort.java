package AlgorithmsAndComplexities;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {8,7,5,3,2,4,6,12,3,44,6};
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void bubblesort(int[] arr) {
		for(int i = 1; i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
	}

}
