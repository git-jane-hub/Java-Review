package review;

public class Ri002IPhone {
	public String model;
	public int price;
	public boolean fiveG;
	public String color;
	
	// this 좀 헷갈림 - 구조가 맞는지 확인
	public Ri002IPhone(String model, int price, boolean fiveG, String color) {
		this.model = model;
		this.price = price;
		this.fiveG = fiveG;
		this.color = color;
	}
	
	public void getInfo() {
		System.out.println("모델명: " + model);
		System.out.println("가격: " + price + "만원");
		System.out.println("5G: " + fiveG);
		System.out.println("색상: " + color);
	}
}
