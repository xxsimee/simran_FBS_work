import java.util.Scanner;
abstract class ElectricityBill{
	String name;
	double unit;
	ElectricityBill() {
		this.name = "Not given";
		this.unit = 0;
	}
	
	ElectricityBill(String name, double unit) {
		this.name = name;
		this.unit = unit;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getUnit() {
		return unit;
	}

	void setUnit(double unit) {
		this.unit = unit;
	}
	abstract double calBill();
	final void generateBill() {
		double billAmount = calBill();
		double tax= billAmount * 5/100;
		double fixedCharge=50;
		double finalBill = billAmount + tax+ fixedCharge;
		showUsage();
		 System.out.println("Unit Charges: ₹" + billAmount);
	        System.out.println("Tax: ₹" + tax);
	        System.out.println("Fixed Charge: ₹" + fixedCharge);
	        System.out.println("Final Bill Amount: ₹" + finalBill);
	}
	void showUsage() {
		 System.out.println("Customer Name: " + getName());
	        System.out.println("Units Consumed: " + getUnit());
	}
}
class ResidentailBill extends ElectricityBill{

	ResidentailBill() {
		super();
	}
	ResidentailBill(String name,double unit){
		super(name,unit);
	}
	double calBill() {
		double bill=0;
		
		if(getUnit() <=100) 
		{
			bill= getUnit()*2.5;
		}else if(getUnit() <= 300) 
		{
			bill = getUnit()*3.5;
		}else
		{
			bill= getUnit()*5;
		}
		if(getUnit()>500)
		{
			bill =bill+150;
		}
		return bill;
	}
}

class CommercialBill extends ElectricityBill{

	CommercialBill() {
		super();
	}
	CommercialBill(String name,double unit) {
		super(name,unit);
	}
	
	double calBill() {
		double unitCharge= getUnit() *6.5;
		
		if(getUnit()<200 && unitCharge <1500)
		{
			unitCharge=1500;
		}
		if(getUnit() > 1000)
		{
			double energySurCharge = unitCharge * 8/100;
			unitCharge= unitCharge+ energySurCharge;
			
		}
		return unitCharge;
	}
}
class ElectricitycalTest {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.println("Select Customer Type:");
	        System.out.println("1. Residential");
	        System.out.println("2. Commercial");

	        int choice = sc.nextInt();

	        System.out.print("Enter Customer Name: ");
	        String customerName = sc.next();

	        System.out.print("Enter Units Consumed: ");
	        double units = sc.nextDouble();

	        ElectricityBill bill;

	        if (choice == 1) {
	            bill = new ResidentailBill(customerName, units);
	        } else if (choice == 2) {
	            bill = new CommercialBill(customerName, units);
	        } else {
	            System.out.println("Invalid Customer Type.");
	            sc.close();
	            return;
	        }

	        System.out.println();

	        bill.generateBill();

	        sc.close();
		
	}

}
