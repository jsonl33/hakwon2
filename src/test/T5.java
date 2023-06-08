package test;

class Mt05 {
	void pr(int a, int b) {
		System.out.println(a + "\t" + b);
	}

	void pr(int a) {
		System.out.println(a);
	}
}

public class T5 {
	public static void main(String[] args) {
		Mt05 mt = new Mt05();
		mt.pr(100);
		mt.pr(100, 200);
	}
}
