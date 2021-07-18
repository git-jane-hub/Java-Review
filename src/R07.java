import java.util.Scanner;

public class R07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int a = scan.nextInt();
		while (a > 4) {
			System.out.println("a는 4보다 크다");
		}System.out.println("a는 4보다 작다");
	}
}
