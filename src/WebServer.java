
public class WebServer {

	// 필드
	int port;

	// 메소드
	/**
	 * 서버시작
	 */
	void start() {
		System.out.println("서버시작");
	}

	/**
	 * 서버종료
	 */
	void stop() {
		System.out.println("서버종료");
	}

	/**
	 * 서버재시작
	 */
	void reStart() {
		stop();
		start();
	}

}
