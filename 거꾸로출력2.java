package Java;

import java.util.Scanner;

public class 거꾸로출력2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		for(int i = a.length-1; i>=0; --i) {
			a[i] = sc.nextInt();			
			b[9-i] = a[i];
			System.out.print(b[9-i]+" ");
		} //for
		sc.close();

	} //main

} //class
