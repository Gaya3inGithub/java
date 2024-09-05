package j3_ControlStructure;
import java.util.Scanner;
public class Age {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter age: ");
	int age = s.nextInt();
	if(age>20)
	{
		System.out.print("Enter salary: ");
		int salary = s.nextInt();
		if(salary>25000)
		{
			System.out.println("loan sactioned");
		}
		else
			System.out.println("Rejected");
	}
s.close();
	}

}
