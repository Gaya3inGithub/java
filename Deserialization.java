package io_packages;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Deserialization {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			try
			{
			System.out.print("Enter name: ");
			String name = scanner.nextLine();
			
			
			String fname = "E:\\\\java programs"+name+".ser";
			File f = new File(fname);
			Employee e = null;
			if(f.exists()==false)
			{
				throw new IOException ("Employee data not found");
			}
			
			FileInputStream fos = new FileInputStream(fname);
			ObjectInputStream ois = new ObjectInputStream(fos);
			
			e= (Employee)ois.readObject();
			
			System.out.println("Name: " + e.getName());
            System.out.println("ID: " + e.getId());
            System.out.println("Salary: " + e.getSalary());
			System.out.println("Employee data saved");

			ois.close();
			fos.close();
			}
			catch(IOException | ClassNotFoundException e)
			{
				System.out.println(e.getMessage());
			}

			}

		}


