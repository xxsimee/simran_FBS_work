class StudentPlaced{
	int frn;
	String studentName;
	int distanceCovered;
	String companyName;
	String designation;
	
	StudentPlaced() {
		super();
		this.frn = 0;
		this.studentName = "Not Given";
		this.distanceCovered = 0;
		this.companyName = "Not Given";
		this.designation = "Not Given";
	}
	StudentPlaced(int frn, String studentName, int distanceCovered, String companyName, String designation) {
		super();
		this.frn = frn;
		this.studentName = studentName;
		this.distanceCovered = distanceCovered;
		this.companyName = companyName;
		this.designation = designation;
	}
	int getFrn() {
		return frn;
	}
	void setFrn(int frn) {
		this.frn = frn;
	}
	String getStudentName() {
		return studentName;
	}
	void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	int getDistanceCovered() {
		return distanceCovered;
	}
	void setDistanceCovered(int distanceCovered) {
		this.distanceCovered = distanceCovered;
	}
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

	void display() {
	        System.out.println("FRN: " + this.frn);
	        System.out.println("Student Name: " + this.studentName);
	        System.out.println("Distance Covered: " + this.distanceCovered);
	        System.out.println("Company Name: " + this.companyName);
	        System.out.println("Designation: " + this.designation);
	    }
	public String toString() {
		return "\nFRN: "+this.frn+"\nStudent Name:"+this.studentName+"\nDistance Covered:"+this.distanceCovered+"\nCompany Name:"+this.companyName+"\nDesignation:"+this.designation;
	}
	
}
class StudentPlacedTest {

	public static void main(String[] args) {
		StudentPlaced sp1;
		sp1=new StudentPlaced(101,"Simran",399,"TCS","SaleManager");//
		 sp1.display();
	        System.out.println("Hashcode: " + sp1.hashCode());
	        System.out.println("toString():");
	        System.out.println(sp1);
	
	}

}
