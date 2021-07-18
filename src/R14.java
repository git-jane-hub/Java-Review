
public class R14 {
	public static void main(String[] args) {
		int num = 4;
		for (int row = 1; row <= num; row++) {
			//3-2-1-0
			for(int colA = 1; colA <= (num-row); colA++) {
				System.out.print(" ");
			}
			//1-2-3-4
			for(int colB = 1; colB <= row; colB++) {
			System.out.print("*");
			}
		System.out.println();
		}
	}
}
