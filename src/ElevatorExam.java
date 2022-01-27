import java.util.Scanner;

public class ElevatorExam {

	public static void main(String[] args) throws Exception {
		Elevator2 e = new Elevator2();
		Scanner scan = new Scanner(System.in);
		e.floorMax = 4;
		e.floorMin = 1;
		e.weight = 550;
		e.currFloor = 1;
		e.nopsMax = 8; // 8명

		int menuNum = 0;
		while (true) {
			System.out.println("현재 계신 층을 눌러주세요");
			switch (scan.next()) { // .next는 한단어 .nextline은 한줄
			case "1상":
				e.currFloor = 1;
				break;
			case "2상":
			case "2하":
				e.currFloor = 2;
			case "3상":
			case "3하":
				e.currFloor = 3;
			case "4하":
				e.currFloor = 4;
				break;

			default:
				break;
			}
			e.openDoor();
			System.out.println("탑승했습니다.");
			e.closeDoor();
			e.displayMenu();
		}
	}

}
