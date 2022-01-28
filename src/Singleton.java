
public class Singleton {

	private static Singleton singleton = new Singleton(); //private 접근불가

	private Singleton() {
	}
	
	static Singleton getInstance() {
		return singleton;
	}
}
