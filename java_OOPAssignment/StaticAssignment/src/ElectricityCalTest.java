class ElectricityBill{
	int customerId;
	String customerName;
	double unitConsumed;
	static double rateperUnit= 5.0;
	
	ElectricityBill() {
		this.customerId = 0;
		this.customerName = "Not Given";
		this.unitConsumed = 0;
	}
	
	ElectricityBill(int customerId, String customerName, double unitConsumed) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.unitConsumed = unitConsumed;
	}

	int getCustomerId() {
		return customerId;
	}

	void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	String getCustomerName() {
		return customerName;
	}

	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	double getUnitConsumed() {
		return unitConsumed;
	}

	void setUnitConsumed(double unitConsumed) {
		this.unitConsumed = unitConsumed;
	}

	static double getRateperUnit() {
		return rateperUnit;
	}

	static void setRateperUnit(double rateperUnit) {
		ElectricityBill.rateperUnit = rateperUnit;
	}
	
	double calBill() {
		return unitConsumed* rateperUnit;
	}
	void display() {
        System.out.println("ID: " + customerId);
        System.out.println("Name: " + customerName);
        System.out.println("Unit Consumed: " + unitConsumed);
        System.out.println("Rate per unit: " + rateperUnit);
        System.out.println("Total Bill: " + calBill());
    }
}
class ElectricityCalTest {

	public static void main(String[] args) {
        ElectricityBill b1 =new ElectricityBill(101, "Simran", 150);
        ElectricityBill b2 =new ElectricityBill(102, "Rita", 200);

        System.out.println("First Customer:");
        b1.display();

        System.out.println();

        System.out.println("Second Customer:");
        b2.display();

        System.out.println();
        ElectricityBill.setRateperUnit(10.0);

        System.out.println("After Updating Rate:");

        b1.display();

        System.out.println();

        b2.display();

	}

}
