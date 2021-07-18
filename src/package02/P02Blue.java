package package02;

public class P02Blue {
	private int sales;
	private int growth;
	private int goal;
	
	public P02Blue(int goal) {
		this.sales = 0;
		this.growth = 0;
		this.goal = goal;
	}
	
	public void getBlueInfo() {
		System.out.println("-------직장1-------");
		System.out.println("매       출: " + this.sales + "만원");
		System.out.println("성  장  세 : " + this.growth + "/100");
		System.out.println("목표 금액: " + this.goal + "만원");
		System.out.println("------------------");
	}
	public void hire1(P01Person p) {
		if(p.getPersonEnergy() < 30) {
			System.out.println("노동자의 체력은 " + p.getPersonEnergy() + "입니다.");
			System.out.println("노동자의 체력이 부족해 고용할 수 없습니다.");
			System.out.println("------------------");
			return;
		}
		if(p.getPersonEnergy() < 60) {
			this.sales += 500;
			this.growth += 10;
			if(this.growth > 100) {
				System.out.println("매출이 1000만원 증가했습니다.");
				this.growth = (this.growth - 100);
				this.sales += 1000;
			}
			p.doWork(1);
			return;
		}
		if(p.getPersonEnergy() <= 100) {
			this.sales += 800;
			this.growth += 20;
			if(this.growth > 100) {
				System.out.println("매출이 1000만원 증가했습니다.");
				this.growth = (this.growth - 100);
				this.sales += 1000;
			}
			p.doWork(2);
		}
	}
}
