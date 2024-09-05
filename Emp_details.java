package j8_OOPS;
import java.util.Scanner;
public class Emp_details 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter Employee Salary: Rs.");
        double salary = scanner.nextDouble();
        employee.assignValues(id, name, department, salary);
        employee.printValues();
        scanner.close();
	}

}
