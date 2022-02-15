package api;

public class Member implements Comparable<Member> {
	
	String name;
	int age;
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Member o) { //compareTo 두값을 비교해서 정렬시켜줌
//		return name.compareTo(o.name);
//		return o.age - age; //내림
		return age - o.age; //오름
	}
	
}
