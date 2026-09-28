class Student{
	int rollNo;
	String name;
	double percentage;
	Student(int rollNo, String name, double percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
		
	}
	int getRollNo() {
		return rollNo;
	}
	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getPercentage() {
		return percentage;
	}
	void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	void display()
	{
		System.out.println("Roll No: "+this.rollNo);
		System.out.println("Name:"+name);
		System.out.println("Percentage: "+this.percentage);
	}
}
class Employee{
	int id;
	String name;
	double annualSalaryLPA;
	Employee(int id, String name, double annualSalaryLPA) {
		super();
		this.id = id;
		this.name = name;
		this.annualSalaryLPA = annualSalaryLPA;
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
	double getAnnualSalaryLPA() {
		return annualSalaryLPA;
	}
	void setAnnualSalaryLPA(double annualSalaryLPA) {
		this.annualSalaryLPA = annualSalaryLPA;
	}
	void display()
	{
		System.out.println("Employee Id: "+this.id);
		System.out.println("Name: "+name);
		System.out.println("Annual Salary: "+this.annualSalaryLPA);
	}
}
class Bank{
	void approveLoan(Student s) {
		if(s.percentage>80) 
		{
			System.out.println("Loan Approve for 2,00,000");
		}
		else if(s.percentage>=60)
		{
			System.out.println("Loan Approve for 1,00,000");
		}
		else if(s.percentage>=40)
		{
			System.out.println("Loan Approve for 50,000");
		}
		else 
		{
			System.out.println("Loan not Approve ");
		}
	}
	void approveLoan(Employee e)
	{
		if(e.annualSalaryLPA>12)
		{
			System.out.println("Loan Approve for 7,00,000");
		}
		else if(e.annualSalaryLPA>=10)
		{
			System.out.println("Loan Approve for 6,00,000");
		}
		else if(e.annualSalaryLPA>=6)
		{
			System.out.println("Loan Approve for 5,00,000");
		}
		else if(e.annualSalaryLPA>=4)
		{
			System.out.println("Loan Approve for 4,00,000");
		}
		else 
		{
			System.out.println("Loan Not Approve");
		}
	}
}
class LoanTest {

	public static void main(String[] args) {
		
		Bank b1=new Bank();
		System.out.println("Student Details:");
		Student s1=new Student(101,"Simran",80);
		s1.display();
		b1.approveLoan(s1);
		
		System.out.println("Employee Details:");
		Employee e1=new Employee(202,"Rita",12);
		e1.display();
		b1.approveLoan(e1);
	}

}
