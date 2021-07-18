
public class R15 {
	public static void main(String[] args) {
		int num = 4;
		for(int row = 1; row <= num; row++) {
			// 0-1-2-3
			for(int colA = 1; colA <= (row - 1); colA++) {
				System.out.print(" ");
			}
			// 4-3-2-1
			for(int colB = 0; colB <= (num - row); colB++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
