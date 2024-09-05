package j2_variables_datatypes_operators;
import java.util.Scanner;
public class Marks {
	public static void main(String[]args)
	{
Scanner M = new Scanner(System.in);
System.out.print("Enter the mark obtained in English:");
int Eng=M.nextInt();
System.out.print("Enter the mark obtained in Maths:");
int Mat=M.nextInt();
System.out.print("Enter the mark obtained in Science:");
int Sci=M.nextInt();

int t = Eng+Mat+Sci;
System.out.print("Total:");
System.out.println(t);

int avg=t/3;
System.out.print("Average:");
System.out.print(avg);
M.close();
}
}