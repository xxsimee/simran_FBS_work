class SalesManager {

    int id;
    String name;
    double salary;
    double incentive;
    double target;

    SalesManager() {
        super();

        this.id = 0;
        this.name = "Not Given";
        this.salary = 0;
        this.incentive = 0;
        this.target = 0;
    }

    SalesManager(int id, String name, double salary, double incentive, double target) {
        super();

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.incentive = incentive;
        this.target = target;
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

    double getIncentive() {
        return incentive;
    }

    void setIncentive(double incentive) {
        this.incentive = incentive;
    }

    double getTarget() {
        return target;
    }

    void setTarget(double target) {
        this.target = target;
    }

    void display() {
        System.out.println("SalesManager ID: " + this.id);
        System.out.println("SalesManager Name: " + this.name);
        System.out.println("SalesManager Salary: " + this.salary);
        System.out.println("SalesManager Incentive: " + this.incentive);
        System.out.println("SalesManager Target: " + this.target);
    }

    public String toString() {
        return "\nSalesManager ID: " + this.id + "\nSalesManager Name: " + this.name+ "\nSalesManager Salary: " + this.salary
             + "\nSalesManager Incentive: " + this.incentive+ "\nSalesManager Target: " + this.target;
    }
}

class SalesManagerTest {

    public static void main(String[] args) {

        SalesManager sm1 = new SalesManager(101, "Simran", 40000, 5000, 100000);
        sm1.display();
        System.out.println("Hashcode: " + sm1.hashCode());
        System.out.println("Using toString():");
        System.out.println(sm1);
    }
}