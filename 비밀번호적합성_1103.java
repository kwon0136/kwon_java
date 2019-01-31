package Java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 비밀번호적합성_1103 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//pwd입력
		String pwd = sc.next();
		
		Pattern a = null;
		Pattern b = null;
		Pattern c = null;
		Pattern d = null;
		Matcher match;
		int type = 0;
		
		//영소문자,대문자,숫자,특수문자 compile
		a = Pattern.compile("[a-z]");
		b = Pattern.compile("[A-Z]");
		c = Pattern.compile("[0-9]");
		d = Pattern.compile("\\p{Punct}",32-39);
		
		//영소문자,대문자,숫자,특수문자 포함되어 있으면 변수 type 숫자 증가
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
		//영소문자,대문자,숫자,특수문자 중 2가지 이상 포함되고, 암호의 길이가 8이상이면 "YES"출력
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
