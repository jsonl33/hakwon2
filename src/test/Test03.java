package test;

class Tv03 {
	String color;
	int channel;

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}
}

public class Test03 {
	public static void main(String[] args) {
		Tv03 t1 = new Tv03();
		Tv03 t2 = new Tv03();
		System.out.println("tv01채널번호="+t1.channel+", tv02채널번호="+t2.channel);
	}
}
