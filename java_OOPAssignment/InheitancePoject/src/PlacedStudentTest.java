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
	void display()
	{
		System.out.println("student Frn:"+this.frn);
		System.out.println("student Name:"+StudentName);
		System.out.println("Distance Covered :"+this.distanceCovered);
		
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
	void display()
	{
		super.display();
		System.out.println("company name is:"+this.companyName);
		System.out.println("designation is:"+this.designation);

	}
}

class PlacedStudentTest {

	public static void main(String[] args) {
		
			PlacedStudent ps1=new PlacedStudent (21,"Simran",900,"deloit","Java Developer");
			PlacedStudent ps2=new PlacedStudent (22,"Rita",400,"TCS","Python Developer");
			
			ps1.display();
			ps2.display();
			System.out.println("Student's Count:"+Student.getCount() );
}
}
