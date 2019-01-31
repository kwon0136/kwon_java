package Java;

import java.util.Scanner;

public class 숫자갯수찾기_1116 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[10];
		int count3 = 0;
		int count6 = 0;
		int count9 = 0;
		//입력받는 10개의 값을 문자열 배열로 받는다
		for(int i=0; i<arr.length; ++i) {
			arr[i] = sc.next();
		//입력받는 값을 char단위로 쪼개어 3,6,9와 일치하는 문자가 있을 때, 각각
		//count3, count6, count9의 숫자를 1씩 늘린다.
			for(int j=0; j<arr[i].length(); ++j) {
				if(arr[i].charAt(j) == '3') {
					count3++;				
				}else if(arr[i].charAt(j) == '6') {
					count6++;
				}else if(arr[i].charAt(j) == '9') {
					count9++;
				}//if							
			}//for		
		}//for
		//3,6,9의 갯수 출력
		System.out.println("3 : "+count3);
		System.out.println("6 : "+count6);
		System.out.println("9 : "+count9);
		sc.close();
	}//main
}//class
