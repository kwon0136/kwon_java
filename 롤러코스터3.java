package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 롤러코스터3 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		List<String> a = new ArrayList<>();
		//List<String> terms = new ArrayList<String>();
		int count = 0;
		
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
			}else if(c[0].equals("PRINT")){
				System.out.println(a.size());
				
				
				for(int i=0; i<a.size(); ++i) {
					System.out.print(a.get(i)+ " ");
					for(count=0; count<i; count++) {
						//System.out.print(a.get(i));
						if(i==count*4-1) {
							System.out.println();
							break;
						}
					}
				}//for
								
				//System.out.println();
				break;
			}
		}//while
		sc.close();


	}

}
