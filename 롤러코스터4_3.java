package Java;

import java.util.ArrayList;
import java.util.Scanner;

public class �ѷ��ڽ���4_3 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		ArrayList<String> a = new ArrayList<>();
		//List<String> terms = new ArrayList<String>();
		int count = 0;
		
		while(true) {
			String b = sc.nextLine();
			String[] c = b.split(" ");//�Է¹޴°��� �������� �����Ͽ� ���ڿ� �迭c�� �Է�
			if(c[0].equals("ADD")) {//add�Է½�, c[1]���� a�� �߰�
				a.add(c[1]);
			}else if(c[0].equals("REMOVE")) {//remove�Է½�, c[1]���� a���� ����
				a.remove(c[1]);
			}else if(c[0].equals("SET")) {//set�Է½�, c[1]���� c[2]�� ���� ��ü
				a.remove(c[1]);
				a.add(c[2]);
			}else if(c[0].equals("BOARD")){//board�Է½�
				System.out.println(a.size());
				if(a.size()<4) {//a�� ũ�Ⱑ 4���� ������ 
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
