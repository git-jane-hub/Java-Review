package interaction;

public class R02Seller {
	private int money;
	private int coffee;
	private int cola;
	
	public R02Seller(int coffee, int cola) {
		this.money = 0;
		this.coffee = coffee;
		this.cola = cola;
	}
	
	public void showSellerInfo() {
		System.out.println("------판매자-------");
		System.out.println("판매 금액: " + money);
		System.out.println("보유 커피: " + this.coffee + "잔");
		System.out.println("보유 콜라: " + this.cola + "개");
		System.out.println("-----------------");
	}
	
	public void sellCoffee(int coffee) {
		if(this.coffee < coffee) {
			System.out.println("대신 콜라드실래요?");
			return;
		}
		this.money += (coffee*3000);
		this.coffee -= coffee;
	}
	public void sellCola(int cola) {
		if(this.cola < cola) {
			System.out.println("대신 커피드실래요?");
			return;
		}
		this.money += (cola*1500);
		this.cola -= cola;
	}
	public void refundCoffee(int coffee) {
		if(this.money < (coffee * 3000)) {
			System.out.println("판매자가 가진 돈이 없어 환불을 못해드립니다.");
			System.out.println("-----------------");
		}
		this.money -= (coffee * 3000);
		this.coffee += coffee;
	}
	public void refundCola(int cola) {
		if(this.money < (cola * 3000)) {
			System.out.println("판매자가 가진 돈이 없어 환불을 못해드립니다.");
			System.out.println("-----------------");
		}
		this.money -= (cola * 3000);
		this.cola += cola;
	}
	public int sellerMoneyInfo() {
		return money;
	}
	public int sellerCoffeeInfo() {
		return coffee;
	}
	public int sellerColaInfo() {
		return cola;
	}
}
