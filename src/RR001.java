
public class RR001 {
	public int age;
	public String name;
	public boolean marriage;
	public int children;
	
	public RR001(int a, String n, boolean m, int c) {
		age = a;
		name = n;
		marriage = m;
		children = c;
	}
	
	public void getInfo() {
	System.out.println("나이: " + age);
	System.out.println("이름: " + name);
	System.out.println("결혼여부: " + marriage);
	System.out.println("자녀 수: " + children);
	}
	
	public void nextYear() {
		System.out.println("1년이 지났습니다.");
		for(int year = 0; year < 1; year ++) {
			children++;
			age++;
	
		}
	}
}