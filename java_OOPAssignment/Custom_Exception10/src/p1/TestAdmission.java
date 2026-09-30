package p1;


public class TestAdmission {

	public static void main(String[] args) {
		AdmissionFrom af=new AdmissionFrom("Simran ", 18, 20, 10000, 4000);
		try {
			af.validateFrom();
			System.out.println("Admission Successful!!!");
		} catch(EmptyNameException e)
		{
			System.out.println(e.getMessage());
		} 
		catch (UnderAgeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		catch (InvalidPercentageException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		catch (NotFitForAdmissionException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		catch (InsufficientFeesException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		catch (FeesNotPaidException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
