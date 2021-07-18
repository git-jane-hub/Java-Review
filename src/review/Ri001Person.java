package review;

public class Ri001Person {
	public String name;
	public int age;
	public int family;
	
	public Ri001Person(String n, int a, int f) {
		name = n;
		age = a;
		family = f;
	}
	
	public void getInfo() {
		System.out.println("이름은: " + name+ "입니다.");
		System.out.println("나이는: " + age+ "세 입니다.");
	}
	public void passYear() {
			age++;
			System.out.println("나이가 " + age + "로 한살 더 먹었습니다.");
	}
	public void familyMember() {
		System.out.println("가족 구성원 수는 " + family + "명 입니다.");
	}
}
