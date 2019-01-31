package Java;

import java.util.Scanner;

public class 합구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		 
		for (int j= 0; j < a.length; j++) {
			a [j] = sc.nextInt();
			int b = a[j];
			if(b > 0) {
				b += b;
			} //if
			
			System.out.println(b);
			
		} //for
		sc.close();
	} //main

} //class
