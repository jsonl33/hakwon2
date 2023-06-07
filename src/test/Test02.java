package test;

class Member02{
	private String id;
	private String name;
	private String addr;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
public class Test02 {
	public static void main(String[] args) {
		Member02 m = new Member02();
		m.setId("aaaa");
		m.setName("홍길동");
		m.setAddr("서울시 종로구");
		
		System.out.println("회원 아이디: "+m.getId());
		System.out.println("회원 이름: "+m.getName());
		System.out.println("회원 주소: "+m.getAddr());
	}
}
