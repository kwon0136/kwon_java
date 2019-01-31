package Java;

import java.util.Scanner;

public class 거꾸로출력하기_1079 {

	public static void main(String[] args) {
		//System.out.println("입력");
		Scanner sc = new Scanner(System.in);	
		int[] a = new int[10];
		for(int i = 0; i <a.length; ++i) {
			a[i] = sc.nextInt();
		}
		
		for(int i = a.length-1; i>=0; --i) {
			System.out.print(a[i]+" ");
		} //for
		sc.close();
	} //main

} //class
