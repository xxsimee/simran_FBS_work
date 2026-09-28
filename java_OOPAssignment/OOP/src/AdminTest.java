class Admin {

    int id;
    String name;
    double salary;
    double allowance;

    Admin() {
    	this.id = 0;
        this.name = "Not Given";
        this.salary = 0;
        this.allowance = 0;
    }
    Admin(int id, String name, double salary, double allowance) {
    	this.id = id;
        this.name = name;
        this.salary = salary;
        this.allowance = allowance;
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

    double getAllowance() {
        return allowance;
    }

    void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    void display() {
        System.out.println("Admin ID: " + this.id);
        System.out.println("Admin Name: " + this.name);
        System.out.println("Admin Salary: " + this.salary);
        System.out.println("Admin Allowance: " + this.allowance);
    }

    public String toString() {
        return "Admin ID: " + this.id + "\nAdmin Name: " + this.name
             + "\nAdmin Salary: " + this.salary+ "\nAdmin Allowance: " + this.allowance;
    }
}

class AdminTest {

    public static void main(String[] args) {

        Admin a1 = new Admin(101, "Simran", 35000, 5000);

        a1.display();
        System.out.println("Hashcode: " + a1.hashCode());
        System.out.println("\ntoString():");
        System.out.println(a1);
    }
}