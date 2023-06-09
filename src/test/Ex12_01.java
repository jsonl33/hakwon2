package test;

import java.util.Scanner;

class Ex12_02{
	int p(int a, int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	double p(double a, double b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
}
public class Ex12_01 {
	public static void main(String[] args) {
		Ex12_02 ex = new Ex12_02();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("최대값 구할 int 두개 입력");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(ex.p(a,b)+"가 더 큰수");
		
		System.out.println("최대값 구할 double 두개 입력");
		double dA = sc.nextDouble();
		double dB = sc.nextDouble();
		System.out.println(ex.p(dA, dB)+"가 더 큰수");
		
		sc.close();
	}
}
