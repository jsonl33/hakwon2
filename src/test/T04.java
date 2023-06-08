package test;

import java.util.Scanner;

class Mt04{
	int abs(int data) {
		if(data<0)
			data=-data;
		return data;
	}
	double abs(double data) {
		if(data<0)
			data=-data;
		return data;
	}
}
public class T04 {
	public static void main(String[] args) {
		Mt04 mt = new Mt04();
		int result = mt.abs(-100);
		System.out.println("-100의 절대값 = "+result);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("음의 실수 입력: ");
		double dResult = mt.abs(sc.nextDouble());
		System.out.println("절대값: "+dResult);
		sc.close();
	}
}
