package interaction;

public class R03Main {
	public static void main(String[] args) {
		R01Buyer b1 = new R01Buyer(100000);
		R02Seller s1 = new R02Seller(5, 5);
		b1.showBuyerInfo();
		s1.showSellerInfo();
		b1.buyCoffeeOnly(s1, 5);
		b1.showBuyerInfo();
		s1.showSellerInfo();
		b1.returnCoffee(s1, 3);
		b1.showBuyerInfo();
		s1.showSellerInfo();
	}
}
