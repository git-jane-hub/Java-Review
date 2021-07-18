package package01;

public class P001Person {
	private int age;
	private int saveMoney;
	private int social;
	
	public P001Person() {
		this.age = 1 ;
		this.saveMoney = 0;
		this.social = 0;
	}
	
	public void getInfo() {
		System.out.println("---------");
		System.out.println("나이: " + this.age);
		System.out.println("저축액: " + this.saveMoney);
		System.out.println("사회성: " + this.social);
	}
	public int getA() {
		return this.age;
	}
	public void setA(int age) {
		this.age += age;
	}
	public int getSM() {
		return this.saveMoney;
	}
	public void setSM(int saveMoney) {
		this.saveMoney += saveMoney;
	}
	public int getS() {
		return this.social;
	}
	public void setS(int social) {
		this.social += social;
	}
}
