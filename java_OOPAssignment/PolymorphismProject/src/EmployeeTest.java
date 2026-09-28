abstract class Employee{
	int id;
	String name;
	int salary;
	
	Employee() {
		this.id = 0;
		this.name = "Not Given";
		this.salary = 0;
	}
	Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getSalary() {
		return salary;
	}
	void setSalary(int salary) {
		this.salary = salary;
	}
	
	abstract double calsal();
	public String toString() {
		return "ID: "+this.id+"\nName: "+this.name+"\nSalary: "+this.salary;
	}
}

class AdminEmployee extends Employee{
	int allownace;

	AdminEmployee() {
		super();
		this.allownace = 0;
	}
	AdminEmployee(int id,String name,int salary,int allownace) {
		super(id,name,salary);
		this.allownace = allownace;
	}
	int getAllownace() {
		return allownace;
	}
	void setAllownace(int allownace) {
		this.allownace = allownace;
	}
	
	double calsal()
	{
		return this.salary+this.allownace;
	}
	public String toString() {
		return super.toString()+"\n Allownace: "+this.allownace;
	}
}
class SaleManagerEmp extends Employee{
	int incentive;
	int target;
	
	SaleManagerEmp() {
		super();
		this.incentive = 0;
		this.target = 0;
	}
	SaleManagerEmp(int id,String name,int salary,int incentive, int target) {
		super(id,name,salary);
		this.incentive = incentive;
		this.target = target;
	}
	int getIncentive() {
		return incentive;
	}
	void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}
	double calsal()
	{
		return this.salary+this.incentive;
	}
	public String toString() {
		return super.toString()+"\nTarget: "+this.target+"\nIncentive: "+this.incentive;
	}
}
class HrEmp extends Employee{
	int commission;

	HrEmp() {
		super();
		this.commission = 0;
	}
	HrEmp(int id,String name,int salary,int commission) {
		super(id,name,salary);
		this.commission = commission;
	}
	int getCommission() {
		return commission;
	}
	void setCommission(int commission) {
		this.commission = commission;
	}
	double calsal()
	{
		return this.salary+this.commission;
	}
	public String toString() {
		return super.toString()+"\nCommission: "+this.commission;
	}
}

class EmployeeTest {

	public static void main(String[] args) {
		Employee e1;
		
		System.out.println("Admin Detail are: ");
		 e1=new AdminEmployee(101,"jiya",10000,2000);
		System.out.println(e1);
		System.out.println();
		
		System.out.println("Sale Manager details are: ");
		e1=new SaleManagerEmp(101,"simran",2999,9000,3455);
		System.out.println(e1);
		System.out.println();
		
		System.out.println("HR detail are: ");
		e1=new HrEmp(101,"simran",30000,2999);
		System.out.println(e1);
	}

}
