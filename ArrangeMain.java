package Polymorphism;
import java.util.Scanner;
public class ArrangeMain {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 
 Arrange A = new Arrange(); 
 
 System.out.print("Enter size of an string array: ");
 int  n= scanner.nextInt();
 String []s=new String[n];
 System.out.println("Enter element of string array: ");
 scanner.nextLine();
 for(int i=0;i<s.length;i++)
 {
	 s[i]=scanner.nextLine();
 }
 
 A.sort(s);
 System.out.println();
 System.out.print("Enter size of an integer array: ");
 int size = scanner.nextInt();
 int []a= new int[size];
 System.out.print("Enter element of an integer array: ");
 for(int i=0;i<a.length;i++)
 {
	 a[i]=scanner.nextInt();
 }
 
 A.sort(a);
 
 scanner.close();
	}

}
