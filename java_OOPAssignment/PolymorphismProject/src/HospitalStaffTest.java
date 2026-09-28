abstract class HospitalStaff{
	int staffId;
	String name;
	int age;
	double salary;
	HospitalStaff() {
		this.staffId = 0;
		this.name = "Not Given";
		this.age = 0;
		this.salary = 0;
	}
	HospitalStaff(int staffId, String name, int age, double salary) {
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
	abstract double calBonus();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nStaff ID:"+this.staffId+"\nName: "+this.name+"\nAge: "+this.age+"\nSalary: "+this.salary;
	}
}
class Doctor extends  HospitalStaff{
	String specialization;
	int numberOfPatients;
	Doctor() {
		super();
		this.specialization ="Not Given";
		this.numberOfPatients = 0;
	}
	Doctor(int staffId,String name,int age,double salary,String specialization, int numberOfPatients) {
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
	double calBonus() {
		return salary*0.10;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nSpecialization: "+this.specialization+"\nNumber Of Patients:"+this.numberOfPatients;
	}
}
class Nurse extends HospitalStaff {
	String shift;
	String wardName;
	Nurse() {
		super();
		this.shift = "Not Given";
		this.wardName = "Not Given";
		}
	Nurse(int staffId,String name,int age,double salary,String shift, String wardName) {
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
	double calBonus() {
		return salary*0.20;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nShift: "+this.shift+"\nWard Name:"+this.wardName;
	}
}
class HospitalStaffTest {

	public static void main(String[] args) {
	
		HospitalStaff h1;
		System.out.println("Doctor's Details");
		h1=new Doctor(101,"simran",22,777777,"surgen",22);
		//h1.display();
		//System.out.println(h1.calBonus());
		System.out.println(h1);
		System.out.println();
		
		System.out.println("Nurse Details :");
	    h1=new Nurse(102,"rita",33,80000,"Morning","OT");
	    System.out.println(h1);
	   // System.out.println(h1.calBonus());
		//h1.display();

	}

}
