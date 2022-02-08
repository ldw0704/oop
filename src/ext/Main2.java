package ext;

public class Main2 {

	public static void main(String[] args) {
		Board notice = new Board();

		notice.setTitle("첫번째 공지글");
		System.out.println(notice.getTitle());
		
		Board gallery = new Board();

		gallery.setTitle("첫번째 공지글");
		System.out.println(gallery.getTitle());
		System.out.println(gallery.getFile());

	}

}
