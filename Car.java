
public class Car {
	String color;
	int speed;
	int gear;
	int need; // 필요한 연료를 나타내는 속성
	int ratio = 12; // 연비를 나타내는 속성
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" +
				gear + ", 필요한 연료 = " + need +"]";
	}
	
	void changeGear(int g) {
		gear = g;
	}
	
	void speedUp() {
		speed = speed + 10;
	}
	
	void speedDown() {
		speed = speed - 10;
	}
	
	void needFuel(int f) // 필요한 연료의 양을 계산하는 메소드
	{
		need = f / ratio; // 필요한 연료 = 주행거리 / 연비
	}
}
