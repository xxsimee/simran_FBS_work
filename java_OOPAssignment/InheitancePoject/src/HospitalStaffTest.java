class HositalStaff{
	int staffId;
	String name;
	int age;
	double salary;
	HositalStaff() {
		this.staffId = 0;
		this.name = "Not Given";
		this.age = 0;
		this.salary = 0;
	}
	HositalStaff(int staffId, String name, int age, double salary) {
		this.staffId = staffId;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	int getStaffId() {
		return staffId;
	}
	void setStaffId(int staffId) {
		this.staffId = staffId;
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
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	void display() {
		System.out.println("Staff ID: "+this.staffId);
		System.out.println("Name: "+name);
		System.out.println("Age: "+this.age);
		System.out.println("Salary: "+this.salary);
	}
}
class Doctor extends  HositalStaff{
	String specialization;
	int numberOfPatients;
	Doctor() {
		super();
		this.specialization ="Not Given";
		this.numberOfPatients = 0;
	}
	Doctor(int staffId,String name,int age,int salary,String specialization, int numberOfPatients) {
		super(staffId,name,age,salary);
		this.specialization = specialization;
		this.numberOfPatients = numberOfPatients;
	}
	String getSpecialization() {
		return specialization;
	}
	void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	int getNumberOfPatients() {
		return numberOfPatients;
	}
	void setNumberOfPatients(int numberOfPatients) {
		this.numberOfPatients = numberOfPatients;
	}
	void display() {
		super.display();
		System.out.println("Specialization: "+specialization);
		System.out.println("Number of Patients: "+this.numberOfPatients);
	}
}
class Nurse extends HositalStaff {
	String shift;
	String wardName;
	Nurse() {
		super();
		this.shift = "Not Given";
		this.wardName = "Not Given";
		}
	Nurse(int staffId,String name,int age,int salary,String shift, String wardName) {
		super(staffId,name,age,salary);
		this.shift = shift;
		this.wardName = wardName;
	}
	String getShift() {
		return shift;
	}
	void setShift(String shift) {
		this.shift = shift;
	}
	String getWardName() {
		return wardName;
	}
	void setWardName(String wardName) {
		this.wardName = wardName;
	}
	void display() {
		super.display();
		System.out.println("Shift: "+shift);
		System.out.println("Ward name: "+wardName);
	}
}
class HospitalStaffTest {

	public static void main(String[] args) {
	
		System.out.println("Doctor's Details");
		Doctor d1=new Doctor(101,"simran",22,777777,"surgen",22);
		d1.display();
		System.out.println();
		
		System.out.println("Nurse Details :");
		Nurse n1=new Nurse(102,"rita",33,80000,"Morning","OT");
		n1.display();

	}

}
