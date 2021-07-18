// 상품
public class RR004Parents {
	public String modelName;
	public int modelNumber;
	public String brand;
	public String color;
	public boolean brandNew;
	
	/*
	public RR004Parents(String mN1, int mN2, String b, String c, boolean bN){
		modelName = mN1;
		modelNumber = mN2;
		brand = b;
		color = c;
		brandNew = bN;
	}
	*/
	public void getInfo() {
		System.out.println("모델명: " + modelName);
		System.out.println("상품번호: " + modelNumber);
		System.out.println("브랜드: " + brand);
		System.out.println("색상: " + color);
		System.out.println("신상여부: " + brandNew);
	}
}
