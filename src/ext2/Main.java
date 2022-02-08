package ext2;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("홍길동", 20, 180, 70, "20002020", 3, 3.8);
		Student student2 = new Student("이순신", 31, 170, 65, "20002021", 2, 4.0);
//		String name, int age, int height, int weight, 
//		String studentID, int grade, double gPA

		System.out.println(student1.toString());
		System.out.println(student2);// toString생략

		Teacher teacher1 = new Teacher("우와아", 40, 175, 80, "1111111");
		System.out.println(teacher1);
	}

}
