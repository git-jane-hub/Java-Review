package review;

public class Ri004SuperSonicAirplane extends Ri004Airplane{

	public Ri004SuperSonicAirplane(int s) {
		super(s);
	}
	public void fly() {
		if(speed + 500 < 900) {
			super.fly();
		}else {
			if(speed + 500 < 1300) {
				speed += 500;
			}else{
				speed = 1300;
			}
		System.out.println("초음속 비행 시속 " + speed + "km/h 로 비행중입니다.");
	
	}
}
}