import java.util.Scanner;
abstract class InsurancePolicy{
	String policyHolderName;
    double basePremium;

    InsurancePolicy() {
        this.policyHolderName = "Not Given";
        this.basePremium = 0;
    }

    InsurancePolicy(String policyHolderName, double basePremium) {
        this.policyHolderName = policyHolderName;
        this.basePremium = basePremium;
    }
    

    abstract double calPremium();

    void printPolicyDetails() {
        System.out.println("Policy Holder Name: " + policyHolderName);
        System.out.println("Base Premium: " + basePremium);
        System.out.println("Final Premium: " + calPremium());
    }
}
class CarInsurance extends InsurancePolicy{
	int carAgeInYear;
	boolean hadAccidentInLastYear;
	double carValue;
	CarInsurance(int carAgeInYear, boolean hadAccidentInLastYear, double carValue, String policyHolderName, double basePremium) {
		super(policyHolderName,basePremium);
		this.carAgeInYear = carAgeInYear;
		this.hadAccidentInLastYear = hadAccidentInLastYear;
		this.carValue = carValue;
	}
	double calPremium()
	{
		double premium=basePremium;
		if(carAgeInYear <=3)
		{
			premium=premium+premium*10/100;
		}else if(carAgeInYear <= 7){
			 premium = premium + premium * 20 / 100;
		}else
		{
			premium = premium + premium * 30 / 100;
		}
		
		if(hadAccidentInLastYear) {
			premium=premium+premium*25 /100;
		}else {
			 premium = premium - premium * 10 / 100;
		}
		 if (carValue > 1000000) {
	            premium = premium + 2000;
	        }
		 return premium;
	}
	
}
class HealthInsurance extends InsurancePolicy {

    int age;
    boolean isSmoker;
    boolean hasPreExistingDisease;
    HealthInsurance(String policyHolderName, double basePremium,int age, boolean isSmoker,boolean hasPreExistingDisease) 
    { super(policyHolderName, basePremium);
        this.age = age;
        this.isSmoker = isSmoker;
        this.hasPreExistingDisease = hasPreExistingDisease;
    }

    double calPremium() {

        double premium = basePremium;

        if (age < 30) {
            premium = premium + premium * 10 / 100;
        } else if (age <= 45) {
            premium = premium + premium * 25 / 100;
        } else {
            premium = premium + premium * 40 / 100;
        }

        if (isSmoker) {
            premium = premium + premium * 30 / 100;
        } else {
            premium = premium - premium * 5 / 100;
        }

        if (hasPreExistingDisease) {
            premium = premium + premium * 20 / 100;
        }

        return premium;
    }
}
class InsuranceCalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Select Policy Type:");
        System.out.println("1. Car Insurance");
        System.out.println("2. Health Insurance");

        int choice = sc.nextInt();
        System.out.print("Enter Policy Holder Name: ");
        String policyHolderName = sc.next();

        System.out.print("Enter Base Premium: ");
        double basePremium = sc.nextDouble();

        InsurancePolicy ip;
        if (choice == 1) {

            System.out.print("Enter Car Age in Years: ");
            int carAgeInYear = sc.nextInt();

            System.out.print("Had Accident in Last Year (true/false): ");
            boolean hadAccidentInLastYear = sc.nextBoolean();

            System.out.print("Enter Car Value: ");
            double carValue = sc.nextDouble();
            
            ip=new CarInsurance (carAgeInYear,hadAccidentInLastYear, carValue,policyHolderName,basePremium);
        }
        else if(choice==2)
        {
        	System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Is Smoker (true/false): ");
            boolean isSmoker = sc.nextBoolean();

            System.out.print("Has Pre-existing Disease (true/false): ");
            boolean hasPreExistingDisease = sc.nextBoolean();
            
            ip=new HealthInsurance(policyHolderName,basePremium, age, isSmoker, hasPreExistingDisease);
 
        }
        else {
        	System.out.println("Invalid policy Type");
        	sc.close();
        	return;
        }
        System.out.println("\nInsurance Policy Details");
        ip.printPolicyDetails();

        sc.close();
	}

}
