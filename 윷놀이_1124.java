package Java;

import java.util.Scanner;

public class ������_1124 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		int count = 0;
		//�Է¹޴� 4���� ���� arr�迭�� �ִ´�
		for(int i=0; i<arr.length; ++i) {
			arr[i] = sc.nextInt();
		//arr�迭�� ���� �ε������� �и��Ͽ� 0�� ���ϰ�, 0�� ��ġ-->count�� ���� ����
			if(arr[i] == 0) {
				count++;
			}//if		
		}//for
		//count���� ���� ������ �ο��Ѵ�
		if(count == 1) {
			System.out.println("10��");
		}else if(count == 2) {
			System.out.println("20��");
		}else if(count == 3) {
			System.out.println("30��");
		}else if(count == 4) {
			System.out.println("40��");
		}else {
			System.out.println("100��");
		}//if
		sc.close();
	}//main
}//class
