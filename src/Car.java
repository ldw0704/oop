
public class Car {

	String modelName;
	int speed;

//source - generate getter and setters
	public String getModelName() {// get 값 가져오기
		return modelName;
	}

	public void setModelName(String modelName) {// set 값 주기
		this.modelName = modelName;
	}
/**
 * 함수설명 : 현재속도를 출력한다.
 * @return 현재속도 km/h
 */
	public String getSpeed() {
		return speed + "km/h"; // 문자가 되기때문에 String
	}
/**
 * 함수설명 : 현재속도를 설정한다. 
 * 0이하는 0을 나타내고, 최고속도는 240이다.
 * @param speed:현재속도
 */
	// 위의 설명이 해당요소 마우스 오버시 나타나게 된다.
	public void setSpeed(int speed) {
		if (speed <= 0) {
			this.speed = 0;
			return;
		} else if (speed > 240) {
			this.speed = 240;
		}
		this.speed = speed;
	}

}
