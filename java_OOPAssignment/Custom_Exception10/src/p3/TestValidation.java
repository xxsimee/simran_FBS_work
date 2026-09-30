package p3;

import java.util.Scanner;

public class TestValidation {

	public static void main(String[] args) {
		Login l =new Login();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();
        try {
        	l.ValidateLogin(user, pass);
        	System.out.println("Login successful!!!!!");
        }catch(InvalidUsernameException e)
        {
        	System.out.println(e.getMessage());
        	e.printStackTrace();
        } catch (InvalidPasswordException e) {
		System.out.println(e.getMessage());
			e.printStackTrace();
		}
        sc.close();
	}

}
