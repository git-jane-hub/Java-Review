
public class R19 {
	static int mul(int a, int b, int c) {
		return (a * b * c);
	}
	static void info(){
		System.out.println("안녕하세요.");
		System.out.println("자바 메서드 학습중입니다.");
		System.out.println("3줄을 한 번의 호출로 적습니다.");
	}
	public static void main(String[] args) {
		int result = mul(10, 20, 30);
		System.out.println(result);
		for(int num = 0; num < 3; num++) {
			info();
		}
	}
}
