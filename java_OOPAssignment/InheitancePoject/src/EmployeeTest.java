class Employee{
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
	
	void display() {
		System.out.println("Employee Id: "+this.id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+this.salary);
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
	
	void display() {
		super.display();
		System.out.println("Allownace"+this.allownace);
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
	
	void display() {
		super.display();
		System.out.println("Incentive: "+this.incentive );
		System.out.println("Target: "+this.target);
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
	
	void display() {
		super.display();
		System.out.println("Commission :"+this.commission);
	}
}

	
class EmployeeTest {

	public static void main(String[] args) {
		System.out.println("Employee Detail are:");
		Employee e1=new Employee(101,"simran",10000);
		e1.display();
		System.out.println();
		
		System.out.println("Admin Detail are: ");
		AdminEmployee p1=new AdminEmployee(101,"jiya",10000,2000);
		p1.display();
		System.out.println();
		
		System.out.println("Sale Manager details are: ");
		SaleManagerEmp se=new SaleManagerEmp(101,"simran",2999,9000,3455);
		se.display();
		System.out.println();
		
		System.out.println("HR detail are: ");
		HrEmp h1=new HrEmp(101,"simran",30000,2999);
		h1.display();
	}

}
