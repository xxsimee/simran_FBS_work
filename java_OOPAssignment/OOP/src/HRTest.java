class HR{
	int id;
	String name;
	double salary;
	double commission;
	HR() {
		this.id = 0;
		this.name = "Not Given";
		this.salary = 0;
		this.commission =0;
	}
	HR(int id, String name, double salary, double commission) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.commission = commission;
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
	double getCommission() {
		return commission;
	}
	void setCommission(double commission) {
		this.commission = commission;
	}
	
	 void display() {
	        System.out.println("ID: " + this.id);
	        System.out.println("Name: " + this.name);
	        System.out.println("Salary: " + this.salary);
	        System.out.println("Commission: " + this.commission);
	    }

	    public String toString() {
	        return "\nID: " + this.id+ "\nName: " + this.name+ "\n Salary: " + this.salary + "\nCommission: " + this.commission;
	    }
}
class HRTest {

	public static void main(String[] args) {
		HR h1 = new HR(101, "Simran", 35000, 5000);

        h1.display();
        System.out.println("Hashcode: " + h1.hashCode());
        System.out.println("\ntoString():");
        System.out.println(h1);

	}

}
