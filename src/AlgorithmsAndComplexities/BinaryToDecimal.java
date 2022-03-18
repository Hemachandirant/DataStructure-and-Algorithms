package AlgorithmsAndComplexities;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the Binary Number : ");
		String binaryno = sc.next();
		int result = 0;
		int conversion = 1;
		for(int i = 1;i<=binaryno.length();i++) {
			if(binaryno.charAt(binaryno.length()-i)=='1') {
				result+=conversion;
			conversion+=2;
			}
		
		}
		System.out.println(result);
	}

}
