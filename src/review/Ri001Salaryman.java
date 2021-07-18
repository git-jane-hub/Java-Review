package review;
// 상속
public class Ri001Salaryman extends Ri001Person {
	public String comName;
	public int pay;
	public int saveMoney;
	public double commutingHour;
	
	public Ri001Salaryman(String n, int a, int f, String c, int p, int s, double cH) {
		super(n, a, f);
		comName = c;
		pay = p;
		saveMoney = s;
		commutingHour = cH;
	}
	
	public void getSalarymanInfo() {
		getInfo();
		System.out.println("회사명은 " + comName + "입니다.");
		System.out.println("연봉은 " + pay + "만원입니다.");
		System.out.println("한달 저축액은 " + saveMoney + "만원입니다.");
		System.out.println("통근 시간은 " + commutingHour + "시간걸립니다.");
	}
	public void getPromo() {
		pay += 1000;
	}
	public void independence() {
		System.out.println("자취를 시작합니다.");
		saveMoney -= 50;
		if(saveMoney - 50 <= 0) {
			saveMoney = 0;
		}
		System.out.println("한달 저축액은 " + saveMoney + "만원입니다.");
		commutingHour -= 1;
		if(commutingHour -1 <=0) {
			commutingHour = 0.5;
		}
		System.out.println("통근 시간은 " + commutingHour + "시간걸립니다.");
	}
	// overriding 메서드 재정의
	public void passYear() {
		age++;
		System.out.println("나이가 " + age + "로 한살 더 먹었습니다.");
		pay += 200;
		System.out.println("연봉이 1000만원 증가했습니다.");
		System.out.println("연봉은 " + pay + "만원입니다.");
		saveMoney += 20;
		System.out.println("한달 저축액이 20만원 증가했습니다.");
		System.out.println("한달 저축액은 " + saveMoney + "만원입니다.");
	}
	public void getMarried() {
		if(pay < 8000) {
			familyMember();
		} else {
			System.out.println("결혼을 축하합니다.");
			family -= family - 1;
			family++;
			System.out.println("가족 구성원 수는 " + family + "명 입니다.");
		}
	}
}
