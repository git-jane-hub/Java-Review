
public class RR003 {
	public int orderNumber;
	public int date;
	public int price;
	public boolean freeShip;
	public String id;
	public String name;
	public String address;
	
	public RR003(int d, int p, String i, String n, String a) {
//		orderNumber = o;
		date = d;
		price = p;
		id = i;
//		freeShip = f;
		name = n;
		address = a;
		// 여기 아직 해결안됨
		System.out.println("주문 정보");
		for(orderNumber = 1; orderNumber >= 1; orderNumber++) {
			System.out.printf("주문번호: %06d%n", orderNumber);
			break;
		}
		System.out.println("주문 날짜: "+ date);
		System.out.println("(주문 가격: "+ price + ")");
		if(price >= 70000) {
			freeShip = true;
			System.out.println("무료배송 대상입니다.");
		}else if(address == "seoul"){
			System.out.println("(무료배송 대상이 아닙니다.)");
			price += 2000;
		}else {
			System.out.println("(무료배송 대상이 아닙니다.)");
			price += 3000;
		}
		System.out.println("총주문 가격: "+ price);
		System.out.println("주문 아이디: "+ id);
		System.out.println("주문자 이름: "+ name);
		System.out.println("주문자 주소: "+ address);
		System.out.println("------------------");
	}
}
