// 화면
public class RR004Child1 extends RR004Parents{
	public String kind;
	public int size;
	public boolean touch;
	
	public void getInfo() {
		System.out.println("모델명: " + modelName);
		System.out.println("상품번호: " + modelNumber);
		System.out.println("브랜드: " + brand);
		System.out.println("색상: " + color);
		System.out.println("신상여부: " + brandNew);
		System.out.println("화면종류: " + kind);
		System.out.println("화면크기: " + size);
		System.out.println("터치화면: " + touch);
		
	}
	
}
