package test;

import java.util.Scanner;

class Mp3 {
	private String comp;
	private int size;

	void exMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("회사명, 메모리 용량 입력");
		String comp = sc.next();
		int size = sc.nextInt();

		setComp(comp);
		setSize(size);

		System.out.println("회사명: " + getComp());
		System.out.println("메모리 용량: " + getSize() + "G");
		sc.close();
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}

public class Ex13_02 {
	public static void main(String[] args) {
		Mp3 mp3 = new Mp3();
		mp3.exMethod();
	}
}
