package Java;

import java.util.Scanner;

public class LowerBound1_1097 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[2];
		//배열 a값 입력
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		//arr1 배열 길이 지정
		int[] arr1 = new int[a[0]];
		int count = 0;
		
		//arr1 배열 값 입력
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}//for
		//처음으로 지정된 수 이상인 수가 등장하는 위치 출력
		//arr1[i]의 값이 a[1]값 이상일 때, i+1값 출력, for문 끝내기
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] >= a[1]) {
				System.out.println(i+1);
				break;
			}else{
				count++;
			}
		}//for
		if(count == arr1.length) {
			System.out.println(count+1);
		}
		sc.close();
	}//main
}//class
