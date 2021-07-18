
public class HomeWork {
	public static void main(String[] args) {
		for (int dan = 2; dan < 20; dan++) {
			System.out.printf("%n-----%d단-----%n", dan);
			for(int num = 1; num < 20; num++) {
				System.out.printf("%d * %2d = %2d%n", dan, num, (dan * num));
			}
		}
	}
}
