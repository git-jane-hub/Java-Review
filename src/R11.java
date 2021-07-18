import java.util.Scanner;

public class R11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("<*로 만드는 정사각형>");
		System.out.println("정수를 입력하세요.");
		int square = scan.nextInt();
		for (int a = 1; a <= square; a++) { 
			for (int b = 1; b <= square; b++) {
				System.out.print("* ");
			}System.out.println();
		}
	}
}