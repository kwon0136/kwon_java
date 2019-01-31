package Java;

import java.util.ArrayList;
import java.util.Scanner;

public class 롤러코스터 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> a = new ArrayList<>();
		
		while(true) {
			String b = sc.nextLine();
			String[] c = b.split(" ");
			if(c[0].equals("ADD")) {
				a.add(c[1]);
			}else if(c[0].equals("REMOVE")) {
				a.remove(c[1]);
			}else if(c[0].equals("PRINT")){
				System.out.println(a.toString());
				break;
			}
		}//while
		sc.close();

	}//main

}//class
