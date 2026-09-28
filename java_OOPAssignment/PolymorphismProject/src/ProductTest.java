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
	@Override
	public String toString() {
		return "\nProduct Id:"+this.productId+"\nProduct Name:"+this.productName+"\nPrice: "+this.price;
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
	@Override
	public String toString() {
		return super.toString()+"\nScreen Size:"+this.screenSize+"\nOperating System"+this.operatingSystem;
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
	@Override
	public String toString() {
		return super.toString()+"\nRAM: "+this.ram+"\nProcessor: "+this.processor;
	}
}
class ProductTest {

	public static void main(String[] args) {
		
		System.out.println("Product details:");
		Product p1=new Product(100,"product",900000);
		System.out.println(p1);
		System.out.println();
		
		System.out.println("Mobile Details:");
		p1=new Mobile(101,"iPhone 16",79999,6.1,"iOS");
		System.out.println(p1);
		System.out.println();
		
		System.out.println("Laptop Details: ");
		p1=new Laptop(102,"Hp",65000,16,"Intel core i5");
		System.out.println(p1);

	}

}
