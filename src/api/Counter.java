package api;

public class Counter {

	private int no;

	public Counter(int no) {
		this.no = no;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 finalize()가 실행됨");
	}//finalize - 객체가 사라지면(System.gc();가 호출되면) 자동실행됨. 

}
