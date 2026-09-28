class Employee{
	int id ;
	String name;
	double salary;
	Employee() {
		this.id = 0;
		this.name = "not given";
		this.salary = 0;
	}
	Employee(int id, String name, double salary) {
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
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	void display() {
        System.out.println("Employee ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }
	 public String toString() {
	        return "\nID: " + this.id+ "\nName: " + this.name+ "\nSalary: " + this.salary;
	    }
}
class EmployeeTest {

	public static void main(String[] args) {
		 Employee e1 = new Employee(101, "Simran", 35000);

	        e1.display();
	        System.out.println("Hashcode: " + e1.hashCode());
	        System.out.println("toString():");
	        System.out.println(e1);

	}

}
