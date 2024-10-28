package io_packages;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

 class Emp_Main  {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	try
	{
	System.out.print("Enter name: ");
	String name = scanner.nextLine();
	
	
	String fname = "E:\\java programs"+name+".ser";
	File f = new File(fname);
	if(f.exists()==true)
	{
		throw new IOException("Employee data already exists");
	}
	
	System.out.print("Enter id: ");
	int id= scanner.nextInt();
	System.out.print("Enter salary: ");
	int salary = scanner.nextInt();
	
	Employee e = new Employee(name,id,salary);
	
	FileOutputStream fos = new FileOutputStream(fname);
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(e);
	oos.close();
	fos.close();
	System.out.println("Employee data saved");
	}
	catch(IOException e)
	{
		System.out.println(e.getMessage());
	}
scanner.close();
	}

}
