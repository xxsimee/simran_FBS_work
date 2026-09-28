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
	public String toString() {
		return "\nVehicle Number: "+this.vehicleNumber+"\nModel: "+this.model+"\nComapany Name:"+this.companyName+"Number of Wheels:"+this.noOfWheels+"\nPrice"+this.price;
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

	public String toString() {
		return super.toString()+"\nNo of Stand"+this.noOfStand+"\nNo of Helmets"+this.noOfHelmets+"\nBike Catergory:"+this.bikeCategory;
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
	public String toString() {
		return super.toString()+"\nHas Power Streeing:"+this.hasPowerStreeing+"\nDrive Mode:"+this.driveMode+"\nparking Streeing:"+this.parkingAssistSensors;
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
	public String toString() {
		return super.toString()+"\nPassenger Capacity:"+this.passengerCapacity+"\nStanding Capacity:"+this.standingCapacity;
	}
	
}
class VehicleTest {
	public static void main(String[] args) {
		System.out.println("Vehicle Deatils: ");
		Vehicle v1=new Vehicle();
		System.out.println(v1);
		System.out.println();
		
		System.out.println("Bike Detial: ");
		v1=new Bike(11,"Splendor","Hero MotoCorp",2,80000, 2, 1, " motorcycle");
		System.out.println(v1);
		System.out.println();
		
		System.out.println("Car details: ");
		v1=new Car(23,"Tata","Corolla",4,900000,true,"custom mode",true);
		System.out.println(v1);
		System.out.println();
		
		System.out.println("Bus Detail: ");
		v1=new Bus(34,"PCMC","Mahindra",8,8000000,64, 10);
		System.out.println(v1);
	}
}
