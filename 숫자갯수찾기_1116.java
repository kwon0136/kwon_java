package Java;

import java.util.Scanner;

public class ���ڰ���ã��_1116 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[10];
		int count3 = 0;
		int count6 = 0;
		int count9 = 0;
		//�Է¹޴� 10���� ���� ���ڿ� �迭�� �޴´�
		for(int i=0; i<arr.length; ++i) {
			arr[i] = sc.next();
		//�Է¹޴� ���� char������ �ɰ��� 3,6,9�� ��ġ�ϴ� ���ڰ� ���� ��, ����
		//count3, count6, count9�� ���ڸ� 1�� �ø���.
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
		//3,6,9�� ���� ���
		System.out.println("3 : "+count3);
		System.out.println("6 : "+count6);
		System.out.println("9 : "+count9);
		sc.close();
	}//main
}//class
