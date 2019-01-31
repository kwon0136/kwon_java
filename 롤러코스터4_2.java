package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 롤러코스터4_2 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		List<String> a = new ArrayList<>();
		//List<String> terms = new ArrayList<String>();
		//int count = 0;
		
		while(true) {
			String b = sc.nextLine();
			String[] c = b.split(" ");
			if(c[0].equals("ADD")) {
				a.add(c[1]);
			}else if(c[0].equals("REMOVE")) {
				a.remove(c[1]);
			}else if(c[0].equals("SET")) {
				a.remove(c[1]);
				a.add(c[2]);
			}else if(c[0].equals("BOARD")){
				if(a.size()<4) {
					System.out.println(a.subList(0, a.size()));
					for(int i=0; i<=a.size(); ++i) {
						a.remove(a.get(i));
						System.out.println(a.toString());
					}
				}else {
					System.out.println(a.subList(0,4));
					for(int i=0; i<4; ++i) {
						a.remove(a.get(i));
					}
				}
			}else if(c[0].equals("WAIT")) {
				if(a.size()==0) {
					System.out.println("0 people");
					System.out.println("Program End");
				}else {
					System.out.println(a.size() +" people");
				}
			}
				
				
				
		}//while
	}

}
