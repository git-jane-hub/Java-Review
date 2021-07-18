package package01;

public class P01Main {
	public static void main(String[] args) {
		P001Baby p1 = new P001Baby();
		p1.getBabyInfo();
		p1.growUp(3);
		p1.getBabyInfo();
		
		P001GettingOld o1 = new P001GettingOld();
		o1.getOldInfo();
		o1.getOld(30);
		o1.getOldInfo();
	}
}
