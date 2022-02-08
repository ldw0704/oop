package ext2;

public class Student extends Person {
	private String studentID;
	private int grade;
	private double GPA;

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public Student(String name, int age, int height, int weight, String studentID, int grade, double gPA) {
		super(name, age, height, weight);
		this.studentID = studentID;
		this.grade = grade;
		GPA = gPA;
	}

	@Override
	public String toString() {
		return "Person[name=" + super.getName() + ", age=" + getAge() + ", height=" + getHeight() + ", weight=" + getWeight() + "], Student [studentID=" + studentID + ", grade=" + grade + ", GPA="
				+ GPA + "]"; //super 생략가능
	}

}
