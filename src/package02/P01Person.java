package package02;

public class P01Person {
	private int energy;
	private int edu;
	private int getMoney;
	private int saveMoney;
	private int goal;
	
	public P01Person(int goal) {
		this.energy = 100;
		this.edu = 10;
		this.getMoney = 0;
		this.saveMoney = 300;
		this.goal = goal;
	}
	
	public void getPersonInfo() {
		System.out.println("-------노동자-------");
		System.out.println("현재     에너지: " + this.energy + "/100");
		System.out.println("교육        수준: " + this.edu + "/100");
		System.out.println("월              급: " + this.getMoney + "만원");
		System.out.println("현재 모은 금액: " + this.saveMoney + "만원");
		System.out.println("목표        금액: " + this.goal + "만원");
		System.out.println("------------------");
	}
	
	public void getEdu(int a) {
		System.out.println("교육을 받습니다.");
		if(a <= 3) {
			if((this.energy - (10 * a)) < 0) {
				System.out.println("교육 받을 체력이 부족합니다.");
				System.out.println("------------------");

				return;
			}
			if(this.edu + (15 * a) > 100) {
				System.out.println("교육을 들을 필요가 없습니다.");
				System.out.println("------------------");
				return;
			}
			if((this.saveMoney - (20 * a)) < 0) {
				System.out.println("교육 받을 돈이 부족합니다.");
				System.out.println("------------------");
				return;
			}
			this.energy -= (10 * a);
			this.edu += (15 * a);
			this.saveMoney -= (20 * a);
		}
	}
	
	public void doWork(int a) {
		System.out.println("노동을 합니다.");
		System.out.println("------------------");
		if(a <= 3) {
			if((this.energy - (25 * a)) < 0) {
				System.out.println("노동할 체력이 부족합니다.");
				System.out.println("------------------");

				return;
			}
			this.energy -= (25 * a);
			this.getMoney += (85 * a);
			this.saveMoney += (30 * a);
		}
	}
	
	public void doExcercise() {
		System.out.println("운동을 합니다.");
		System.out.println("------------------");

		if((this.saveMoney - 10) < 0) {
			System.out.println("운동할 돈이 부족합니다.");
			System.out.println("------------------");

			return;
		}
		this.energy += 30;
	}
	public int getPersonEnergy() {
		return this.energy;
	}
}
