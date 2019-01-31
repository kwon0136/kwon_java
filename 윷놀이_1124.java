package Java;

import java.util.Scanner;

public class 윷놀이_1124 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		int count = 0;
		//입력받는 4개의 값을 arr배열에 넣는다
		for(int i=0; i<arr.length; ++i) {
			arr[i] = sc.nextInt();
		//arr배열의 값을 인덱스별로 분리하여 0과 비교하고, 0과 일치-->count의 값을 증가
			if(arr[i] == 0) {
				count++;
			}//if		
		}//for
		//count값에 따라 점수를 부여한다
		if(count == 1) {
			System.out.println("10점");
		}else if(count == 2) {
			System.out.println("20점");
		}else if(count == 3) {
			System.out.println("30점");
		}else if(count == 4) {
			System.out.println("40점");
		}else {
			System.out.println("100점");
		}//if
		sc.close();
	}//main
}//class
