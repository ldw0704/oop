
public class Elevator {

	// 필드
	int currentFloor;
	int floorMax;
	int floorMin;
	boolean doorSW; // false면 닫음, true면 열림
	int lampSW; // false면 닫음, true면 열림
	int weight;
	int nops; // 현재탑승인원
	int nopsMax; // 최대탑승인원

	// 메소드
	void openDoor() throws InterruptedException {
		System.out.println("문열림");
		Thread.sleep(2000);
	}

	void closeDoor() throws InterruptedException {
		System.out.println("문닫힘");
		Thread.sleep(2000);
	}

	void downFloor(int currentFloor, int finishFloor) throws InterruptedException {
		System.out.println("내려갑니다");
		for (int i = currentFloor; i >= finishFloor; i--) {
			System.out.println(i);
			Thread.sleep(2000);
		}
		nops = 0;
	}

	void upFloor(int currentFloor, int finishFloor) throws InterruptedException {
		System.out.println("올라갑니다");
		for (int i = currentFloor; i <= finishFloor; i++) {
			System.out.println(i);
			Thread.sleep(2000);
		}
		nops = 0;
	}

	void butoonCtl() {
		System.out.println("버튼 컨트롤");
	}
}
