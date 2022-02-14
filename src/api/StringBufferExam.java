package api;

public class StringBufferExam {

	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer()
				.append("\n select ")
				.append("\n * ")
				.append("\n from memeber "); //잘보이게 하기위해.
//		StringBuffer sql = new StringBuffer();
//		sql.append(" select ");
//		sql.append(" * ");
//		sql.append(" from member "); //sql 문은 양쪽을 띄워줘야한다.
//		//StringBuffer -> string 클래스만들기
		String sqlStr = sql.toString();//스트링버퍼.toString: String을 리턴
		System.out.println(sqlStr);
	}

}
