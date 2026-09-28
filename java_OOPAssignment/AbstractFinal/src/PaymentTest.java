abstract class Payment{
	int payId;
	double amount;
	String payName;
	String status;
	
	Payment() {
		this.payId = 0;
		this.amount =0;
		this.payName = "Not Given";
		this.status ="Pending";
	}
	
	Payment(int payId, double amount, String payName) {
		this.payId = payId;
		this.amount = amount;
		this.payName = payName;
		this.status ="pending";
	}

	int getPayId() {
		return payId;
	}

	void setPayId(int payId) {
		this.payId = payId;
	}

	double getAmount() {
		return amount;
	}

	void setAmount(double amount) {
		this.amount = amount;
	}

	String getPayName() {
		return payName;
	}

	void setPayName(String payName) {
		this.payName = payName;
	}

	String getStatus() {
		return status;
	}

	void setStatus(String status) {
		this.status = status;
	}
	abstract boolean validate();
	abstract void deductAmount();
	abstract void sendNotification();
	
	final void process() {
		if(validate()) {
			deductAmount();
			sendNotification();
			setStatus("Success");
		}
		else {
			setStatus("Failed");
		}
	}
	void paymentDisplay() {
		System.out.println("Payment ID: " + getPayId());
        System.out.println("Amount: " + getAmount());
        System.out.println("Payer Name: " + getPayName());
        System.out.println("Status: " + getStatus());
	}
}
class CardPayment extends Payment {

    String cardNumber;
    String cvv;

    CardPayment() {
        super();
        this.cardNumber = "Not Given";
        this.cvv = "Not Given";
    }

    CardPayment(int payId, double amount, String payName,
                String cardNumber, String cvv) {

        super(payId, amount, payName);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    String getCardNumber() {
        return cardNumber;
    }

    void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    String getCvv() {
        return cvv;
    }

    void setCvv(String cvv) {
        this.cvv = cvv;
    }

    boolean validate() {

        if (getCardNumber().length() == 16 &&
            getCvv().length() == 3 &&
            getAmount() > 0) {

            return true;
        }

        return false;
    }

    void deductAmount() {
        System.out.println("Amount deducted from card.");
    }

    void sendNotification() {
        System.out.println("Card payment notify.");
    }
}

class UPIPayment extends Payment{
	String upiId;

	UPIPayment() {
		super();
		this.upiId = "Not Given";
	}
	UPIPayment(int payId, double amount, String payName,
            String upiId) {
		super(payId,amount,payName);
		this.upiId = upiId;
	}
	String getUpiId() {
		return upiId;
	}
	void setUpiId(String upiId) {
		this.upiId = upiId;
	}
	boolean validate() {
		if(getUpiId().contains("@") && getAmount() >=1 && getAmount() <=100000) {
			return true;
		}
		return false;
	}
	 void deductAmount() {
	        System.out.println("Amount deducted from UPI account.");
	    }

	    void sendNotification() {
	        System.out.println("UPI payment notify sent.");
	    }
}
class PaymentTest {

	public static void main(String[] args) {
  Payment p1 ;
  p1= new CardPayment(101,2500,"Simran","1234567891234567","123");
  Payment p2= new UPIPayment(102,5500,"Rutuja","rutuja@upi");
  Payment p3= new CardPayment(103,8000,"rita","123577","12");
  
  System.out.println("Card Payment:");
  p1.process();
  p1.paymentDisplay();

  System.out.println();

  System.out.println("UPI Payment:");
  p2.process();
  p2.paymentDisplay();

  System.out.println();

  System.out.println("Invalid Card Payment:");
  p3.process();
  p3.paymentDisplay();
}

}

