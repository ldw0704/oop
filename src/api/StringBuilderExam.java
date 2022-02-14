package api;

public class StringBuilderExam {

	public static void main(String[] args) {
		StringBuilder sql = new StringBuilder()
				.append("\n select ")
				.append("\n * ")
				.append("\n from memeber "); //잘보이게 하기위해.
//		StringBuilder sql = new StringBuilder();
//		sql.append(" select ");
//		sql.append(" * ");
//		sql.append(" from member "); //sql 문은 양쪽을 띄워줘야한다.
//		//StringBuffer -> string 클래스만들기
		String sqlStr = sql.toString();//스트링버퍼.toString: String을 리턴
		System.out.println(sqlStr);
	}
//단일 쓰레드일때만 builder 사용
}
