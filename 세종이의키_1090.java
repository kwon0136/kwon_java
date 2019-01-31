package Java;

import java.util.Arrays;

import java.util.Scanner;

public class 세종이의키_1090 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b[] = new int[a];
		
		for(int i=0; i<a; ++i) {
			b[i] = sc.nextInt();	
		}//for1
		
		Arrays.sort(b);
		//System.out.println(Arrays.toString(b));
		int c = sc.nextInt();
		
		for(int i=0; i<a; ++i) {
			if(c<=b[i]) {
				System.out.println(b.length-i);
				break;
			}
			
		}//for2
		sc.close();
		
	}//main

}//class
