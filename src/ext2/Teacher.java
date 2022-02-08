package ext2;

public class Teacher extends Person {
	private String professorID;

	public String getProfessorID() {
		return professorID;
	}

	public void setProfessorID(String professorID) {
		this.professorID = professorID;
	}

	public Teacher(String name, int age, int height, int weight, String professorID) {
		super(name, age, height, weight);
		this.professorID = professorID;
	}

	@Override
	public String toString() {
		return "Person[name=" + getName() + ", age=" + getAge() + ", height=" + getHeight() + ", weight=" + getWeight() + "], Teacher [professorID=" + professorID + "]";
	}
	
	
}
