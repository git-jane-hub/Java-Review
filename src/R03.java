import java.util.Scanner;

public class R03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("원화 금액을 입력하세요.");
		int money = scan.nextInt();
		double rate = 0.0011631;
		System.out.println("호주 환율은 859.79AUD입니다.");
		System.out.printf(money + "원(KRW)을 환전시 %d(AUD)입니다.", (int)(money*rate));
	}
}
