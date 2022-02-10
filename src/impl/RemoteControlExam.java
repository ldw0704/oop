package impl;

public class RemoteControlExam {

	public static void main(String[] args) {
		Remotecontrol rc = new Televsion();		
		rc.turnOn();
		rc.setVolume(15);
		rc.turnOff();
		
	}

}
