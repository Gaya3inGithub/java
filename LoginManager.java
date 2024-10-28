package Polymorphism;

public class LoginManager 
{
	public void login(String mailId,String password)
	{
		System.out.println("Check mailId and password");
	}
	public void login(long mobileNo,String password)
	{
		System.out.println("Check mobileNo and password");
	}
}
