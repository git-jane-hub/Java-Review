import java.util.Scanner;

public class R04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력하세요.");
		int score = scan.nextInt();
		if (score >= 95) {
			System.out.println("A");
		}
		else if (score >= 85) {
			System.out.println("B");
		}
		else if (score >= 75) {
			System.out.println("C");
		}
		else if (score >= 65) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
}
