package interaction;

public class R01Buyer {
	private int money;
	private int coffee;  // 한잔 3000원
	private int cola;    // 한캔 1500원
	
	public R01Buyer(int money) {
		this.money = money;
		this.coffee = 0;
		this.cola = 0;
	}
	
	public void showBuyerInfo() {
		System.out.println("------구매자-------");
		System.out.println("현재 가진 돈: " + this.money);
		System.out.println("구매 커피: " + this.coffee + "잔");
		System.out.println("구매 콜라: " + this.cola + "개");
		System.out.println("-----------------");
	}
	// 커피만 주문
	public void buyCoffeeOnly(R02Seller seller, int coffee) {
		System.out.println("커피 " + coffee +"잔 살게요.");
		System.out.println("-----------------");
		if(this.money < (coffee * 3000)) {
			System.out.println("구매자의 돈이 부족해요.");
			System.out.println("-----------------");
			return;
		}
		if(seller.sellerCoffeeInfo() < coffee) {
			System.out.println("판매자의 커피가 부족합니다.");
			System.out.println("-----------------");
			return;
		}
		seller.sellCoffee(coffee);
		this.money -= (coffee * 3000);
		this.coffee += coffee;
	}
	// 콜라만 주문
	public void buyColaOnly(R02Seller seller, int cola) {
		System.out.println("콜라 " + cola +"캔 살게요.");
		System.out.println("-----------------");
		if(this.money < (cola * 1500)) {
			System.out.println("구매자의 돈이 부족해요.");
			System.out.println("-----------------");
			return;
		}
		if(seller.sellerColaInfo() < cola) {
			System.out.println("판매자의 콜라가 부족합니다.");
			System.out.println("-----------------");
			return;
		}
		seller.sellCola(cola);
		this.money -= (cola * 3000);
		this.cola += cola;
	}
	// 커피와 콜라 주문
	public void buyCoffeeAndCola(R02Seller seller, int coffee, int cola) {
		System.out.println("커피" + coffee +"잔이랑 콜라" + cola +"캔 살게요.");
		System.out.println("-----------------");
		if(this.money < (coffee * 3000) + (cola * 1500)) {
			System.out.println("돈이 부족해요.");
			System.out.println("-----------------");
			return;
		}
		if(seller.sellerCoffeeInfo() < coffee) {
			System.out.println("판매자의 커피가 부족합니다.");
			System.out.println("-----------------");
			return;
		}
		if(seller.sellerColaInfo() < cola) {
			System.out.println("판매자의 콜라가 부족합니다.");
			System.out.println("-----------------");
			return;
		}
		seller.sellCoffee(coffee);
		seller.sellCola(cola);
		this.money -= (coffee * 3000) + (cola * 1500);
		this.coffee += coffee;
		this.cola += cola;
	}
	// 커피 환불
	public void returnCoffee(R02Seller seller, int coffee) {
		System.out.println("커피 환불해주세요.");
		System.out.println("-----------------");
		if(this.coffee < coffee) {
			System.out.println("가진 커피가 없습니다.");
			System.out.println("-----------------");
			return;
		}
		seller.refundCoffee(coffee);
		this.coffee -= coffee;
		this.money += (coffee * 3000);
	}
	// 콜라 환불
	public void returnCola(R02Seller seller, int cola) {
		System.out.println("콜라 환불해주세요.");
		System.out.println("-----------------");
		if(this.cola < cola) {
			System.out.println("가진 콜라가 없습니다.");
			System.out.println("-----------------");
			return;
		}
		seller.refundCola(cola);
		this.cola -= cola;
		this.money += (cola * 1500);
	}
}
