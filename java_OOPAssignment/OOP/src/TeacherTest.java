class Teacher {

    int id;
    String name;
    double salary;
    String subject;

    Teacher() {
        super();

        this.id = 0;
        this.name = "Not Given";
        this.salary = 0;
        this.subject = "Not Given";
    }

    Teacher(int id, String name, double salary, String subject) {
        super();

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.subject = subject;
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

    String getSubject() {
        return subject;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    void display() {
        System.out.println("Teacher ID: " + this.id);
        System.out.println("Teacher Name: " + this.name);
        System.out.println("Teacher Salary: " + this.salary);
        System.out.println("Teacher Subject: " + this.subject);
    }

    public String toString() {
        return "Teacher ID: " + this.id + "\nTeacher Name: " + this.name
             + "\nTeacher Salary: " + this.salary+ "\nTeacher Subject: " + this.subject;
    }
}

class TeacherTest {

    public static void main(String[] args) {

        Teacher t1 = new Teacher(101, "Simran", 35000, "Java");
        t1.display();
        System.out.println("Hashcode: " + t1.hashCode());
        System.out.println("\ntoString():");
        System.out.println(t1);
    }
}