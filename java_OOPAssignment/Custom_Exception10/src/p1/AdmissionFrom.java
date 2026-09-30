package p1;

public class AdmissionFrom {
String studentName;
int age;
double percentage;
double fees;
double feesPaid;
public AdmissionFrom(String studentName, int age, double percentage, double fees, double feesPaid) {

	this.studentName = studentName;
	this.age = age;
	this.percentage = percentage;
	this.fees = fees;
	this.feesPaid = feesPaid;
}
public void validateFrom() throws EmptyNameException, UnderAgeException, InvalidPercentageException, NotFitForAdmissionException, InsufficientFeesException, FeesNotPaidException
{
	if(studentName ==null || studentName.trim().isEmpty()) {
		throw new EmptyNameException("Student name cannot empty");
		
	}
	if (this.age<18) {
		throw new UnderAgeException ("Invalid Age");
	}else {
		System.out.println("Valid for voting");
	}
	if(percentage <0 || percentage >100)
	{
		throw new InvalidPercentageException("Invalid percentage");
	}
	if(percentage <35)
	{
		throw new NotFitForAdmissionException("Not fit for admission");
	}
	if(feesPaid==0)
	{
		throw new  FeesNotPaidException("Fees not paid ");
	}
	if(feesPaid <(fees*30/100))
	{
		throw new InsufficientFeesException("Insufficient Fees Exception");
	}
}

}
