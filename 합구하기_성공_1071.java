package Java;

import java.util.Scanner;

public class �ձ��ϱ�_����_1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int b =0;
		for(int i = 0; i<a.length; ++i) {
			a[i] = sc.nextInt();
			if(a[i]>0) {
				b = b+a[i];
			}else {
				System.out.println("���� ������ �Է����ּ���");
				--i;
			}			
		} //for
		System.out.println(b);
		sc.close();
		
	} // main

} // class
