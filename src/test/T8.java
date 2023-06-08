package test;

class MyDate08 {
	int year = 2023;
	int month = 5;
	int date = 31;
}

public class T8 {
	public static void main(String[] args) {
		MyDate08 d = new MyDate08();
		MyDate08 t = d;

		System.out.println(d.year + "년 " + d.month + "월 " + d.date + "일");
		System.out.println(t.year + "년 " + t.month + "월 " + t.date + "일");
		System.out.println("========================================\n");

		t = new MyDate08();
		t.year = 2023;
		t.month = 6;
		t.date = 12;
		System.out.println(d.year + "년 " + d.month + "월 " + d.date + "일");
		System.out.println(t.year + "년 " + t.month + "월 " + t.date + "일");
		System.out.println("========================================\n");

		d = t;
		System.out.println(d.year + "년 " + d.month + "월 " + d.date + "일");
		System.out.println(t.year + "년 " + t.month + "월 " + t.date + "일");
		System.out.println("========================================\n");
	}
}
