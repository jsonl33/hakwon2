package test;

class AnimalTest01 {
	public static void main(String[] args) {
		Animal a; // 레퍼런스 변수 선언
		a = new Animal(); // 객체 생성
		a.name = "원숭이"; // 생성된 객체의 멤버에 접근해서 값 대입
		a.age = 26;
		System.out.print(a.name); // 객체의 멤버에 저장된 값 출력
		System.out.print("," + a.age);
		System.out.println();
		
		Animal b = new Animal();
		b.name="펭귄";
		b.age=12;
		System.out.print(b.name);
		System.out.print(","+b.age);
		System.out.println();
		
		Thing thing = new Thing();
		thing.x = 10;
		System.out.println(thing.x);
	}
}

//이름과 나이를 속성으로 갖는 Animal 클래스에 설계
class Animal {
	String name;
	int age;
}


class Thing{
	int x;
}
