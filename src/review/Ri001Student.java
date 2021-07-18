package review;
//상속
public class Ri001Student extends Ri001Person {
	public String schoolName;
	public int grade;
	public String major;
	
	public Ri001Student(String n, int a, int f,String s, int g, String mj) {
		super(n ,a, f);
		schoolName = s;
		grade = g;
		major = mj;
	}
	
	public void getStudentInfo() {
		getInfo();
		System.out.println("학교 이름은: " + schoolName + "입니다.");
		System.out.println("학년은: " + grade + "학년입니다.");
		System.out.println("전공은: " + major + "입니다.");
	}
	/*
	public void gradeUp() {
		if(grade >= 4) {
			System.out.println("졸업을 축하합니다.");
		} else {
			grade += 1;
			System.out.println("한 학년 올라가 현재 " + grade + "학년입니다.");
		}
	}
	*/
	// overriding 메서드 재정의
	public void passYear() {
		age++;
		System.out.println("나이가 " + age + "로 한살 더 먹었습니다.");
		grade += 1;
		if(grade > 4) {
			System.out.println("졸업을 축하합니다.");
		} else {
			System.out.println("한 학년 올라가 현재 " + grade + "학년입니다.");
		}
	}
}
