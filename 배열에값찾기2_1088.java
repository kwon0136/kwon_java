package Java;

import java.util.Scanner;

import java.util.Arrays;

public class �迭����ã��2_1088 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		for(int i=0; i<a; ++i) {
			b[i] = sc.nextInt();
		}//for1
		int c = sc.nextInt();
		Arrays.sort(b);
		//System.out.print(Arrays.toString(b)); �迭����ϱ�
		System.out.println(b[c-1]);
		sc.close();

	}//main

}//class
