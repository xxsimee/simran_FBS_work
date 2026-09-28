class Vehicle{
	int vehicleNumber;
	String model;
	String companyName;
	int noOfWheels;
	int price;
	
	Vehicle() {
		this.vehicleNumber = 0;
		this.model = "Not Given";
		this.companyName = "Not Given";
		this.noOfWheels =0;
		this.price =0;
	}
	Vehicle(int vehicleNumber, String model, String companyName, int noOfWheels, int price) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.companyName = companyName;
		this.noOfWheels = noOfWheels;
		this.price = price;
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
	String getCompanyName() {
		return companyName;
	}
	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	int getNoOfWheels() {
		return noOfWheels;
	}
	void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Vehicle number: "+this.vehicleNumber);
		System.out.println("Model Name:"+this.model);
		System.out.println("Compnay Name: "+this.companyName);
		System.out.println("No of Wheel:"+this.noOfWheels);
		System.out.println("Price :"+this.price);
	}
}

class Bike extends Vehicle{
	int noOfStand;
	int noOfHelmets;
	String bikeCategory;
	
	Bike() {
		super();
		this.noOfStand = 0;
		this.noOfHelmets =0;
		this.bikeCategory ="Not Given";
	}
	Bike(int vehicleNumber,String model,String companyName,int noOfWheels,int price, int noOfStand, int noOfHelmets, String bikeCategory) {
		super(vehicleNumber,model,companyName,noOfWheels,price);
		this.noOfStand = noOfStand;
		this.noOfHelmets = noOfHelmets;
		this.bikeCategory = bikeCategory;
	}
	int getNoOfStand() {
		return noOfStand;
	}
	void setNoOfStand(int noOfStand) {
		this.noOfStand = noOfStand;
	}
	int getNoOfHelmets() {
		return noOfHelmets;
	}
	void setNoOfHelmets(int noOfHelmets) {
		this.noOfHelmets = noOfHelmets;
	}
	String getBikeCategory() {
		return bikeCategory;
	}
	void setBikeCategory(String bikeCategory) {
		this.bikeCategory = bikeCategory;
	}
	
	void display()
	{
		super.display();
		System.out.println("No of Stands: "+this.noOfStand);
		System.out.println("No of Helmets: "+this.noOfHelmets);
		System.out.println("Bike Catergory: "+this.bikeCategory);
	}
	
}

class Car extends Vehicle{
	boolean hasPowerStreeing;
	String driveMode;
	boolean parkingAssistSensors;
	
	Car() {
		super();
		this.hasPowerStreeing =false ;
		this.driveMode = "Not Given";
		this.parkingAssistSensors = false;
	}
	Car(int vehicleNumber,String model,String companyName,int noOfWheels,int price,boolean hasPowerStreeing, String driveMode, boolean parkingAssistSensors) {
		super(vehicleNumber,model,companyName,noOfWheels,price);
		this.hasPowerStreeing = hasPowerStreeing;
		this.driveMode = driveMode;
		this.parkingAssistSensors = parkingAssistSensors;
	}
	boolean isHasPowerStreeing() {
		return hasPowerStreeing;
	}
	void setHasPowerStreeing(boolean hasPowerStreeing) {
		this.hasPowerStreeing = hasPowerStreeing;
	}
	String getDriveMode() {
		return driveMode;
	}
	void setDriveMode(String driveMode) {
		this.driveMode = driveMode;
	}
	boolean isParkingAssistSensors() {
		return parkingAssistSensors;
	}
	void setParkingAssistSensors(boolean parkingAssistSensors) {
		this.parkingAssistSensors = parkingAssistSensors;
	}
	
	void display()
	{
		super.display();
		System.out.println("Has Power Streeing: "+this.hasPowerStreeing);
		System.out.println("Drive Mode: "+driveMode);
		System.out.println("Parking Assist Sensors:"+this.parkingAssistSensors);
	}
}

class Bus extends Vehicle{
	int passengerCapacity;
	int standingCapacity;
	Bus() {
		super();
		this.passengerCapacity = 0;
		this.standingCapacity = 0;
	}
	
	Bus(int vehicleNumber,String model,String companyName,int noOfWheels,int price,int passengerCapacity, int standingCapacity) {
		super(vehicleNumber,model,companyName,noOfWheels,price);
		this.passengerCapacity=passengerCapacity;
		this.standingCapacity =standingCapacity;
	}

	int getPassengerCapacity() {
		return passengerCapacity;
	}

	void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	int getStandingCapacity() {
		return standingCapacity;
	}

	void setStandingCapacity(int standingCapacity) {
		this.standingCapacity = standingCapacity;
	}
	
	void display() {
		super.display();
		System.out.println("Passenger Capacity:"+this.passengerCapacity);
		System.out.println("Standing Capacity:"+this.standingCapacity);
	}
	
}
class VehicleTest {
	public static void main(String[] args) {
		System.out.println("Bike Detial: ");
		Bike b1=new Bike(11,"Splendor","Hero MotoCorp",2,80000, 2, 1, " motorcycle");
		b1.display();
		System.out.println();
		
		System.out.println("Car details: ");
		Car c1=new Car(23,"Tata","Corolla",4,900000,true,"custom mode",true);
		c1.display();
		System.out.println();
		
		System.out.println("Bus Detail: ");
		Bus bs1=new Bus(34,"PCMC","Mahindra",8,8000000,64, 10);
		bs1.display();
	}
}
