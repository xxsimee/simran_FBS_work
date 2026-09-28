class Vehicle {

    int vehicleNumber;
    String model;
    double price;
    String companyName;

    Vehicle() {
        super();

        this.vehicleNumber = 0;
        this.model = "Not Given";
        this.price = 0;
        this.companyName = "Not Given";
    }

    Vehicle(int vehicleNumber, String model, double price, String companyName) {
        super();

        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.price = price;
        this.companyName = companyName;
    }

    int getVehicleNumber() {
        return vehicleNumber;
    }

    void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    String getCompanyName() {
        return companyName;
    }

    void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    void display() {
        System.out.println("Vehicle Number: " + this.vehicleNumber);
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
        System.out.println("Company Name: " + this.companyName);
    }

    public String toString() {
        return "Vehicle Number: " + this.vehicleNumber+ "\nModel: " + this.model + "\nPrice: " + this.price
             + "\nCompany Name: " + this.companyName;
    }
}

class VehicleTest {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle(101, "Swift", 800000, "Maruti");

        v1.display();
        System.out.println("\nHashcode: " + v1.hashCode());
        System.out.println("\ntoString():");
        System.out.println(v1);
    }
}