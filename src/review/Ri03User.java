package review;

public class Ri03User {
	public static void main(String[] args) {
		Ri003PayRoll p1 = new Ri003PayRoll(53, 15, 3);
		p1.getInfo();
		p1.getAge();
		p1.passTest();
		
		p1.getAge();
		p1.getAge();
//		p1.pay = 100000000;
		System.out.println(p1.age);
//		System.out.println(p1.pay);
		
	}
}
