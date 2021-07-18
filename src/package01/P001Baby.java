package package01;

public class P001Baby extends P001Person{

	private int dependence;

	public P001Baby() {
		this.dependence = 100;
	}
	
	public void getBabyInfo() {
		getInfo();
		System.out.println("의존성: " + this.dependence);
	}
	
	public void growUp(int age) {
		for(int b = 1; b < age; b++) {
			setA(1);
			dependence -= 5;
			setS(3);
		}
	}
}
