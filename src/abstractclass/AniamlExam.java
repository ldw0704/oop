package abstractclass;

public class AniamlExam {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();

		dog.sound();
		cat.sound();
		System.out.println("-----------");

		Animal animal = null; // 추상클래스라 new 불가해 null값 줌.
		animal = new Dog(); // 다형성. 상속. 큰 - > 작은 문제없음. 자동 타입변환
		animal.sound();
		animal = new Cat();
		animal.sound();
		
		System.out.println("-----------");
		//메소드 다형성
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	private static void animalSound(Animal animal) {
		animal.sound();
		
	}

}
