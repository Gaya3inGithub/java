package j3_ControlStructure;
import  java.util.Scanner;
public class Largest_number {
	public static void main(String[] args) {
	 Scanner s=new Scanner (System.in);
	 int a = s.nextInt();
	 System.out.println("a= "+a);
	 int b = s.nextInt();
	 System.out.println("b= "+b);
	 int c = s.nextInt();
	 System.out.println("c= "+c);
	 
	 if(a>b && a>c)
		 System.out.println("a is greater among these three");
	 else if(b>a && b>c)
		 System.out.println("b is greater among these three");
	 else
		 System.out.print("c is greater among these three");
	 s.close();
	 }

}
