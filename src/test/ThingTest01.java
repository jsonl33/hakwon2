package test;

class Thing2 {
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}

public class ThingTest01 {
	public static void main(String[] args) {
		Thing2 thing1 = new Thing2();
		thing1.setX(10);
		System.out.println(thing1.getX());
	}
}
