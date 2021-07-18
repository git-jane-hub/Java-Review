
public class RR002 {
	public int height;
	public int jumpPower;
	public int age;
	
	public RR002(int h, int j, int a) {
		height = h;
		jumpPower = j;
		age = a;
	}
	public void dunkShoot(){
		if(height + jumpPower >= 300) {
			System.out.println("덩크슛에 성공했습니다.");
		}else {
			System.out.println("골대에 닿지 않았습니다.");
		}
	}
	public void skillUpGetMilk(){
		height ++;
	}
	public void skillUpPractice() {
		jumpPower += 10;
	}
	public void skillUpUnderNineteen() {
		for(age = 15; age <= 19; age++) {
			height += 3;
			System.out.println("19세 이하이므로 3cm가 커집니다. 현재 키: " + height);
		}
	}
}
