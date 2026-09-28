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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nName:"+this.name+"\nAge:"+this.age;
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
	@Override
	public String toString() {
		return super.toString()+"\nRoll Number: "+this.rollNumber+"\nCourse: "+this.course+"\nMarks:"+this.marks;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nExperience:"+this.experience+"\nSubject:"+this.experience+"\nQualification :"+this.qualification;
	}
}
class PersonTest {

	public static void main(String[] args) {
		
		Person p1=new Person("simee",23);
		System.out.println(p1);
		System.out.println("");
		System.out.println("Student details: ");
		p1=new ExStudent("Simran",22,004,"Java Full stack",100);
		System.out.println(p1);
		System.out.println();
		
		System.out.println("Teacher Details: ");
		p1=new Teacher("Rita",28,3,"science","MSC");
		System.out.println(p1);
	}

}
