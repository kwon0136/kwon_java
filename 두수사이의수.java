package Java;

import java.util.Scanner;

public class 두수사이의수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		int[] d = new int[2];
		for(int i=0; i<a; ++i ) {
			b[i] = sc.nextInt();
			//System.out.print(b[i]+" ");
		}//for

		int[] c = new int[2];
		for(int i=0; i<c.length; ++i) {
			c[i] = sc.nextInt();
			//System.out.print(c[i]);
		}//for1
		for(int i=0; i<b.length; ++i) {
			if(c[0]==b[i]) {
				d[0] = i;
				break;
			}//if	
				
		for(int j=0; j<b.length; ++j) {
			if(c[1] ==b[j]) {
				d[1] = j;
			}//if
		}//for3
			}//for2
		System.out.println(d[1]-d[0]+1);
		sc.close();

	}//main

}//class
