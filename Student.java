package j14_Serialization;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class Student {
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
			throw new IOException("Student data already exists");
		}
		
		System.out.print("Enter reg.no: ");
		int reg_no= scanner.nextInt();
		System.out.print("Enter marks: ");
		int marks = scanner.nextInt();
		
		Stu s = new Stu(name,reg_no,marks);
		
		FileOutputStream fos = new FileOutputStream(fname);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.close();
		fos.close();
		System.out.println("Student data saved");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	scanner.close();
		}
}
