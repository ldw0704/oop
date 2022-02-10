package impl;

public class Televsion implements Remotecontrol {

	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			volume = MIN_VOLUME;
		}
		System.out.println("현재 Tv볼륨 " + volume);
	}

}
