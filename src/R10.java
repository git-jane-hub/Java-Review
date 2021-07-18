import java.util.Scanner;

public class R10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("2 ~ 9 사이의 숫자를 입력해주세요.");
		int dan = scan.nextInt();
		if((dan > 1) && (dan < 10)) {
			System.out.printf("----%d단----%n", dan);
			for (int num = 1; num < 10; num++) {
				System.out.printf("%d * %d = %2d%n", dan, num, (dan*num));
			}
		} else {
			System.out.println("범위 내의 숫자를 입력해주세요.");
		}
	}
}
