class Person{
	String name;
	int age;
	Person() {
		super();
		this.name = "Not Given";
		this.age = 0;
	}
	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+this.age);
	}
}

class ExStudent extends Person{
	int rollNumber;
	String course;
	int marks;
	ExStudent() {
		super();
		this.rollNumber = 0;
		this.course = "Not Given";
		this.marks = 0;
	}
	ExStudent(String name,int age,int rollNumber, String course, int marks) {
		super(name,age);
		this.rollNumber = rollNumber;
		this.course = course;
		this.marks = marks;
	}
	int getRollNumber() {
		return rollNumber;
	}
	void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	String getCourse() {
		return course;
	}
	void setCourse(String course) {
		this.course = course;
	}
	int getMarks() {
		return marks;
	}
	void setMarks(int marks) {
		this.marks = marks;
	}
	
	void display() {
		super.display();
		System.out.println("Roll Number: "+this.rollNumber);
		System.out.println("Course: "+course);
		System.out.println("Marks: "+this.marks);
	}
}

class Teacher extends Person{
	int experience;
	String subject;
	String qualification;
	Teacher() {
		super();
		this.experience = 0;
		this.subject = "Not Given";
		this.qualification = "Not Given";
	}
	Teacher(String name,int age,int experience, String subject, String qualification) {
		super(name,age);
		this.experience = experience;
		this.subject = subject;
		this.qualification = qualification;
	}
	int getExperience() {
		return experience;
	}
	void setExperience(int experience) {
		this.experience = experience;
	}
	String getSubject() {
		return subject;
	}
	void setSubject(String subject) {
		this.subject = subject;
	}
	String getQualification() {
		return qualification;
	}
	void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	void display() {
		super.display();
		System.out.println("Experience: "+this.experience);
		System.out.println("Subject: "+subject);
		System.out.println("Qualification: "+qualification);
	}
}
class PersonTest {

	public static void main(String[] args) {
		
		System.out.println("Student details: ");
		ExStudent s1=new ExStudent("Simran",22,004,"Java Full stack",100);
		s1.display();
		System.out.println();
		
		System.out.println("Teacher Details: ");
		Teacher t1=new Teacher("Rita",28,3,"science","MSC");
		t1.display();
	}

}
