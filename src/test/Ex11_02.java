package test;

class Product {
	private String name;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

public class Ex11_02 {

	public static void main(String[] args) {
		Product coffee = new Product();
		Product vita500 = new Product();
		
		coffee.setName("커피");
		coffee.setPrice(150);
		vita500.setName("비타500");
		vita500.setPrice(500);
		
		System.out.println("자판기 => 제품목록: ");
		System.out.println(coffee.getName()+" "+coffee.getPrice()+"원");
		System.out.println(vita500.getName()+" "+vita500.getPrice()+"원");
	}
}
