package Java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ��й�ȣ���ռ�_1103 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//pwd�Է�
		String pwd = sc.next();
		
		Pattern a = null;
		Pattern b = null;
		Pattern c = null;
		Pattern d = null;
		Matcher match;
		int type = 0;
		
		//���ҹ���,�빮��,����,Ư������ compile
		a = Pattern.compile("[a-z]");
		b = Pattern.compile("[A-Z]");
		c = Pattern.compile("[0-9]");
		d = Pattern.compile("\\p{Punct}",32-39);
		
		//���ҹ���,�빮��,����,Ư������ ���ԵǾ� ������ ���� type ���� ����
		match = a.matcher(pwd);
		if(match.find()) {
			type++;
		}
		match = b.matcher(pwd);
		if(match.find()) {
			type++;
		}
		match = c.matcher(pwd);
		if(match.find()) {
			type++;
		}
		match = d.matcher(pwd);
		if(match.find()) {
			type++;
		}
		//���ҹ���,�빮��,����,Ư������ �� 2���� �̻� ���Եǰ�, ��ȣ�� ���̰� 8�̻��̸� "YES"���
		if(type >= 2) {
			if(pwd.length()>=8) {
				System.out.println("YES");
			}
		}else {
			System.out.println("NO");
		}
		sc.close();

	}//main

}//class
