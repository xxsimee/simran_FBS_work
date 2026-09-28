class Student
{	
	int frn;
	String StudentName;
	int distanceCovered;
	static int count;
	
	Student() {
		this.frn = 0;
		StudentName = "not given";
		this.distanceCovered = 0;
		count++;
	}
	Student(int frn, String studentName, int distanceCovered) {
		this.frn = frn;
		StudentName = studentName;
		this.distanceCovered = distanceCovered;
		count++;
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
	static int getCount() {
		return count;
	}
	static void setCount(int count) {
		Student.count = count;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nStudent Frn: "+this.frn+"\nStudent Name:"+this.StudentName+"\nDistance Covered: "+this.distanceCovered;
	}
}

class PlacedStudent extends Student//step 1
{	
	//step2 remove repeat attribute
	String companyName;
	String designation;
	
	//step3 remove  from both constructor and add super class i.e student
	PlacedStudent() {
		super();
		this.companyName = "not given";
		this.designation = "not given";
	}
	PlacedStudent(int frn, String studentName, int distanceCovered, String companyName, String designation) {
		super(frn,studentName,distanceCovered);
		this.companyName = companyName;
		this.designation = designation;
	}
	
	//step4 remove that attribute from setter and getter
	
	String getCompanyName() {
		return companyName;
	}
	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	String getDesignation() {
		return designation;
	}
	void setDesignation(String designation) {
		this.designation = designation;
	}
	
	//step5 call Student class display() method
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nCompany Name:"+this.companyName+"\nDesignation: "+this.designation;
	}
}

class PlacedStudentTest {

	public static void main(String[] args) {
		
		Student s1=new Student(20,"Vaishu",200);
		System.out.println(s1);
		System.out.println("");
			s1=new PlacedStudent (21,"Simran",900,"deloit","Java Developer");
			s1=new PlacedStudent (22,"Rita",400,"TCS","Python Developer");
			System.out.println(s1);
			System.out.println("");
			System.out.println(s1);
			System.out.println("Student's Count:"+Student.getCount() );
}
}
