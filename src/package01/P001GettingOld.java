package package01;

public class P001GettingOld extends P001Person {
	private int dependence;
	private int pay;
	
	public P001GettingOld() {
		this.pay = 0;
		this.dependence = 100;
	}
	
	public void getOldInfo() {
		getInfo();
		System.out.println("의존성: " + this.dependence);
		System.out.println("연봉: " + this.pay);
	}
	
	public void getOld(int age) {
		for(int b = 1; b <= age; b++) {
			setA(1);
			setS(3);
			this.dependence -= 5;
			if(this.dependence - 5 < 10) {
				this.dependence = 10;
			}
			this.pay += 300;
			setSM(100);
		}
	}
}
