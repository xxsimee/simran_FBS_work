package p3;

public class Login {
String userName="admin";
String password="1234";

public void ValidateLogin(String user,String pass) throws InvalidUsernameException, InvalidPasswordException
{
	if(!userName.equals(user)) {
		throw new InvalidUsernameException("Invalid Username exception.....");
	}
	if(!password.equals(pass)) {
		throw new InvalidPasswordException("invalid password Exception");
	}
}
}
