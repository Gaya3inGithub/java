package Polymorphism;
import java.util.Scanner;
public class Login_main {
public static void main(String[]ags)
{
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter MailId: ");
	String mailId =scanner.nextLine();
	
	System.out.print("Enter password: ");
	String password =scanner.nextLine();
	
	System.out.print("Enter mobile No: ");
	long mobileNo =scanner.nextLong();
	
	LoginManager l = new LoginManager();
	l.login(mailId, password);
	l.login(mobileNo, password);
	
	scanner.close();
}
}
