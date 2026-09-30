package p1;

public abstract class Employee {
	int id;
	String name;
	protected int salary;
	
	 protected Employee() {
		this.id = 0;
		this.name = "Not Given";
		this.salary = 0;
	}
	protected Employee(int id, String name, int salary) {
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
	
	protected abstract double calsal();
	public String toString() {
		return "ID: "+this.id+"\nName: "+this.name+"\nSalary: "+this.salary;
	}

}
