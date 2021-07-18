
public class RR02 {
	public static void main(String[] args) {
		RR002 personA = new RR002(170, 120, 15);
		personA.dunkShoot();
		personA.skillUpUnderNineteen();
		personA.dunkShoot();
		System.out.println("-----------");
		RR002 personB = new RR002(180, 90, 19);
		personB.dunkShoot();
		System.out.println("-----------");
		
		RR002 personC = new RR002(200, 150, 25);
		personC.dunkShoot();
		personC.skillUpGetMilk();
		personC.dunkShoot();
		System.out.println("-----------");
		
		RR002 personD = new RR002(180, 110, 21);
		personD.dunkShoot();
		System.out.println("-----------");
	}
}
