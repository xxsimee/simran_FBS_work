class Employee{
	String name;
	double salary;
	static double bonusRate=11.5;
	Employee() {
		this.name = "NOt Given";
		this.salary = 0;
	}
	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	static double getBonusRate() {
		return bonusRate;
	}
	static void setBonusRate(double bonusRate) {
		Employee.bonusRate = bonusRate;
	}
	
	double calSal() {
		return salary+(salary*bonusRate/100);
	}
	void display() {
		System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus Rate: " + bonusRate);
        System.out.println("Total Salary: " + calSal());
	}
}

class EmployeeCalTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("Simran", 30000);
        Employee e2 = new Employee("Rita", 40000);

        System.out.println("First Employee:");
        e1.display();

        System.out.println();

        System.out.println("Second Employee:");
        e2.display();

        System.out.println();

        Employee.setBonusRate(15.0);

        System.out.println("After Updating Bonus Rate:");

        e1.display();

        System.out.println();

        e2.display();
	}

}
