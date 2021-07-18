package review;

public class Ri004Airplane {
	public int speed;
	
	public Ri004Airplane(int s) {
		speed = s;
	}

	public void fly() {
		speed += 500;
		if(speed > 900) {
			speed = 900;
		}
		System.out.println("시속 " + speed + "km/h 로 비행중입니다.");
	}
	public void breakSpeed() {
		speed -= 100;
		if(speed < 0) {
			speed = 0;
		}
		System.out.println("감속결과 시속 " + speed + "km/h 입니다.");
	}
}
