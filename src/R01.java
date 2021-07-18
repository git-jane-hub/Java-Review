import java.util.Scanner;

public class R01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int a = scan.nextInt();
		if (a > 0) {
			System.out.printf("%d는 양수입니다.%n", a);
		} else if (a == 0) {
			System.out.printf("%d는 0입니다.%n", a);
		}else {
			System.out.printf("%d는 음수입니다.%n", a);
		}
		scan.close();
	}
}
