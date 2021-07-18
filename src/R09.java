import java.util.Scanner;

public class R09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("주문금액을 입력해주세요.");
		int order = scan.nextInt();
		do {
			System.out.printf("주문 금액은 %d원 입니다.%n", order);
			System.out.println("배달을 완료했습니다.");
			System.out.println("주문금액을 입력해주세요.");
			order = scan.nextInt();
		}while (order >= 15000); {
			System.out.println("주문금액이 부족합니다.");
	}
}
}