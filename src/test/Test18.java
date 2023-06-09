package test;

class Mt18 {
	int getSum(int[] arr) {
		int sum = 0;
		for (int x:arr) {
			sum += x;
		}
		return sum;
	}
}

public class Test18 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		Mt18 m = new Mt18();
		int total = m.getSum(arr);
		System.out.println(total);
	}
}
