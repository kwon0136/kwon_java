package Java;

import java.util.Scanner;

public class ��������ġ����_1095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();//�� �迭�� ���� ����
		String[] b = a.split(" ");//������ �������� ������ �迭b�� �Է�(String)
		
		int b2 = Integer.parseInt(b[0]);//String b[0]�� Int b2�� ��ȯ 
		int b3 = Integer.parseInt(b[1]);//String b[1]�� Int b3�� ��ȯ
		int arr1[] = new int[b2];//arr1 �迭 ���� ����
		int arr2[] = new int[b3];//arr2 �迭 ���� ����
		int count = 0;
		
		//arr1 �迭 �Է�
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}//for
		
		//arr2 �迭 �Է�
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
