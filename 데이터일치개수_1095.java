package Java;

import java.util.Scanner;

public class 데이터일치개수_1095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();//두 배열의 길이 선언
		String[] b = a.split(" ");//공백을 기준으로 나누어 배열b에 입력(String)
		
		int b2 = Integer.parseInt(b[0]);//String b[0]을 Int b2로 변환 
		int b3 = Integer.parseInt(b[1]);//String b[1]을 Int b3로 변환
		int arr1[] = new int[b2];//arr1 배열 길이 지정
		int arr2[] = new int[b3];//arr2 배열 길이 지정
		int count = 0;
		
		//arr1 배열 입력
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}//for
		
		//arr2 배열 입력
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}//for
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					count++;
				}//if
			}//for2
		}//for1
		System.out.println(count);
		
		sc.close();

	}//main

}//class
