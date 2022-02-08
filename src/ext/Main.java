package ext;

public class Main {

	public static void main(String[] args) {
		Notice notice = new Notice();

		notice.setTitle("첫번째 공지글");
		System.out.println(notice.getTitle());

		Gallery gallery = new Gallery();

//		gallery.setImgFile("그림.png");
		System.out.println(gallery.getFile());

	}

}
