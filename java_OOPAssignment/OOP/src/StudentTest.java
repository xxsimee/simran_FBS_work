class Student
{	
	int frn;
	String StudentName;
	int distanceCovered;
	
	Student() {
		super();
		this.frn = 0;
		StudentName = "Simran";
		this.distanceCovered = 0;
	}
	Student(int frn, String studentName, int distanceCovered) {
		super();
		this.frn = frn;
		StudentName = studentName;
		this.distanceCovered = distanceCovered;
	}
	int getFrn() {
		return frn;
	}
	void setFrn(int frn) {
		this.frn = frn;
	}
	String getStudentName() {
		return StudentName;
	}
	void setStudentName(String studentName) {
		StudentName = studentName;
	}
	int getDistanceCovered() {
		return distanceCovered;
	}
	void setDistanceCovered(int distanceCovered) {
		this.distanceCovered = distanceCovered;
	}
	
	public String toString() {
		return "\nFRN: "+this.frn+"\nStudent Name: "+this.StudentName+"\nDistance Covered: "+this.distanceCovered;
	}
}
class StudentTest
{
	public static void main(String [] args){
	Student s1;
	s1=new Student(101,"Simran",399);//
	System.out.println(s1);
	System.out.println("Hashcode: "+s1.hashCode());
	}
}