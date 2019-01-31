package Java;

import java.util.Scanner;

public class ³ª´²°®±â_1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println((a-b)/2);
		}else{
			System.out.println((b-a)/2);
		}
		sc.close();

	} // main

} // class
