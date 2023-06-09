package test2;

import java.util.Scanner;

public class Test16 {
	public static void main(String[] args) {
		int menu=0;
		int num=0;
		
		Scanner sc = new Scanner(System.in);
		
		outer_while:
			while(true) {
				System.out.println("1- 비빔밥");
				System.out.println("2- 고등어 자반");
				System.out.println("3- 오징어 볶음");
				System.out.println("0- 종료");
				System.out.println("원하는 메뉴 선택");
				
				String tmp = sc.next();
				menu = Integer.parseInt(tmp);
				
				if(menu == 0) {
					System.out.println("프로그램 종료");
					break;
				}
			}
	}
}
