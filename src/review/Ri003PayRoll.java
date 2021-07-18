package review;

import java.util.Scanner;

public class Ri003PayRoll {
	public int age;
	public int lengthService;
	public int certificate;
	private boolean testPass;
	private int pay;
	
	public Ri003PayRoll(int age, int lengthService, int certificate) {
		this.age = age;
		this.lengthService = lengthService;
		this.certificate = certificate;
		this.testPass = false;
		this.pay = 3000;
	}
	public void getInfo() {
		System.out.println("당신의 나이는 " + age + "입니다.");
		System.out.println("당신의 근속연수는 " + lengthService + "입니다.");
		System.out.println("당신의 자격증 개수는 " + certificate + "입니다.");
		System.out.println("현재 테스트 결과는 " + testPass + "입니다.");
		System.out.println("당신의 연봉은 " + pay + "만원입니다.");
	}
	public void getAge() {
		age++;
		if(age > 55) {
			System.out.println("정년입니다. 회사에서 나가세요.");
		} else {
			System.out.println("아직 일할 시간이 남아있습니다. 남은 기간동안 더 열심히 일하세요.");
		}
	}
	public void passTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("테스트 결과를 입력하세요(true/false)");
		testPass = scan.nextBoolean();
		if(testPass == true) {
		pay += 1000;
		System.out.println("테스트 결과는 합격입니다.");
		System.out.println("당신의 연봉은 " + pay + "만원입니다.");
		System.out.println("축하합니다.");
		}else {
			System.out.println("더 노력하세요.");
		}
	}
}

