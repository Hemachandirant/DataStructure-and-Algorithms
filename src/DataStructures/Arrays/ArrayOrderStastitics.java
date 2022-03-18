package DataStructures.Arrays;

import java.util.Arrays;

public class ArrayOrderStastitics {

	public static void main(String[] args) {
	
		int arr[] = {5,6,73,1,3,5,6};
		KthLargestElement(arr, 3);
		KthSmallestElement(arr, 0);

	}
	public static int KthLargestElement(int arr[], int position) {
		Arrays.sort(arr);
		
		return arr[arr.length-position];
	}
	
	public static int KthSmallestElement(int arr[], int position) {
		Arrays.sort(arr);
		return arr[position];
	}

}
