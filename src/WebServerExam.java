
public class WebServerExam {

	public static void main(String[] args) {
		//has a 방식 - 기존에 만들어둔 것을 가져와서 적용.
		WebServer ws = new WebServer();
		ws.port = 80;
		System.out.printf("현재 웹서버포트는 %d\n", ws.port);
//		ws.start();
//		ws.stop();
		ws.reStart();
	}

}
