package Java;

import java.util.Arrays;
import java.util.Scanner;

public class 세종이의키2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b[] = new int[a];
		
		for(int i=0; i<a; ++i) {
			b[i] = sc.nextInt();	
		}//for1
		
		//System.out.println(Arrays.toString(b));
		//int c = sc.nextInt();
		
		int d[] = new int[a+1];
		
		for(int i=0; i<a; ++i) {
			d[i] = b[i];
		}//for
		int c = sc.nextInt();
		d[d.length-1] = c;
		Arrays.sort(d);
		
		for(int i=0; i<d.length; ++i) {
			if(c<=d[i]) {
				System.out.println(d.length-i);
				break;
			}
			
		}//for2
		sc.close();

	}//main

}//class
