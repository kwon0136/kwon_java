package Java;

import java.util.Scanner;

public class LowerBound1_1097 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[2];
		//�迭 a�� �Է�
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		//arr1 �迭 ���� ����
		int[] arr1 = new int[a[0]];
		int count = 0;
		
		//arr1 �迭 �� �Է�
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}//for
		//ó������ ������ �� �̻��� ���� �����ϴ� ��ġ ���
		//arr1[i]�� ���� a[1]�� �̻��� ��, i+1�� ���, for�� ������
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
