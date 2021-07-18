
public class R13 {
	public static void main(String[] args) {
		int num = 4;
		for (int row = num; row >= 1; row--) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
