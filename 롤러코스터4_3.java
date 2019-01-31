package Java;

import java.util.ArrayList;
import java.util.Scanner;

public class 롤러코스터4_3 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		ArrayList<String> a = new ArrayList<>();
		//List<String> terms = new ArrayList<String>();
		int count = 0;
		
		while(true) {
			String b = sc.nextLine();
			String[] c = b.split(" ");//입력받는값을 공백으로 구분하여 문자열 배열c에 입력
			if(c[0].equals("ADD")) {//add입력시, c[1]값을 a에 추가
				a.add(c[1]);
			}else if(c[0].equals("REMOVE")) {//remove입력시, c[1]값을 a에서 제거
				a.remove(c[1]);
			}else if(c[0].equals("SET")) {//set입력시, c[1]값을 c[2]값 으로 대체
				a.remove(c[1]);
				a.add(c[2]);
			}else if(c[0].equals("BOARD")){//board입력시
				System.out.println(a.size());
				if(a.size()<4) {//a의 크기가 4보다 작을때 
					for(int i=0; i<=a.size() ;i++) {
						a.remove(0);
					}
				}
				for(int i=0; i<a.size(); ++i) {
					System.out.print(a.get(i)+ " ");
					for(count=0; count<i; count++) {
						if(i==count*4-1) {
							for(int j=0; j<4; j++) {
								a.remove(0);
							}
							break;
						}						
					}					
				}
			}else if(c[0].equals("WAIT")) {
				if(a.size()==0) {
					System.out.println(a.size()+" people");
					break;
				}else {
					System.out.println((a.size())+" people");
				}
				
				
			}//if
			//break;
		}//while
		sc.close();

	}//main

}//class
