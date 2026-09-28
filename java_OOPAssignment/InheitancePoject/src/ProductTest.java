class Product{
	int productId;
	String  productName;
	double price;
	Product() {
		this.productId = 0;
		this.productName ="Not Given";
		this.price = 00;
	}
	Product(int productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	int getProductId() {
		return productId;
	}
	void setProductId(int productId) {
		this.productId = productId;
	}
	String getProductName() {
		return productName;
	}
	void setProductName(String productName) {
		this.productName = productName;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	void display() {
		System.out.println("Product Id: "+this.productId);
		System.out.println("Product Name: "+productName);
		System.out.println("Price: "+this.price);
	}
}

class Mobile extends Product{
	double screenSize;
	String operatingSystem;
	Mobile() {
		super();
		this.screenSize = 0;
		this.operatingSystem = "Not Given";
	}
	Mobile(int productId,String productName,double price,double screenSize, String operatingSystem) {
		super(productId,productName,price);
		this.screenSize = screenSize;
		this.operatingSystem = operatingSystem;
	}
	double getScreenSize() {
		return screenSize;
	}
	void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	String getOperatingSystem() {
		return operatingSystem;
	}
	void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	void display() {
		super.display();
		System.out.println("Screen Size:"+this.screenSize);
		System.out.println("Operating System: "+operatingSystem);
	}
}

class Laptop extends Product{
	int ram;
	String processor;
	Laptop() {
		super();
		this.ram = 0;
		this.processor = "Not Given";
	}
	
	Laptop(int productId,String productName,double price,int ram, String processor) {
		super(productId,productName,price);
		this.ram = ram;
		this.processor = processor;
	}

	int getRam() {
		return ram;
	}

	void setRam(int ram) {
		this.ram = ram;
	}

	String getProcessor() {
		return processor;
	}

	void setProcessor(String processor) {
		this.processor = processor;
	}
	void display() {
		super.display();
		System.out.println("RAM: "+this.ram);
		System.out.println("Processor: "+processor);
	}
}
class ProductTest {

	public static void main(String[] args) {
		System.out.println("Mobile Details:");
		Mobile m1=new Mobile(101,"iPhone 16",79999,6.1,"iOS");
		m1.display();
		System.out.println();
		
		System.out.println("Laptop Details: ");
		Laptop l1=new Laptop(102,"Hp",65000,16,"Intel core i5");
		l1.display();

	}

}
