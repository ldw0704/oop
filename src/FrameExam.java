import java.awt.*; // awt.* 패키지안의 모든 클래스 불러옴(옛날)

public class FrameExam {
	Frame frame = new Frame("ㅎㅎㅎ");
	Button button = new Button("ㅋㅋㅋ");

	public FrameExam() {
		// 프레임에 컴포넌트 추가
		frame.add(button);

		// 프레임 크기 지정
		frame.setSize(300, 600);

		// 프레임 보이기
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new FrameExam();

	}

}
