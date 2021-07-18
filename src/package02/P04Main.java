package package02;

public class P04Main {
		public static void main(String[] args) {
		
			P01Person p1 = new P01Person(1000);
			P03White w1 = new P03White(10000);
			P02Blue b1 = new P02Blue(5000);
			
			p1.getPersonInfo();
			p1.doExcercise();
			p1.doExcercise();
			w1.getWhiteInfo();

	
			b1.hire1(p1);
			b1.hire1(p1);
			b1.hire1(p1);

			p1.getPersonInfo();
			b1.getBlueInfo();
			
			
	}
}
