package j3_ControlStructure;
import java.util.Scanner;
public class Reverse_an_array {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter the size of an array: ");
	int size = scanner.nextInt();
	int []a=new int[size];
	int[]b=new int[size];
	int j=size;
	for(int i=0;i<size;i++)
	{
		a[i]=scanner.nextInt();
		b[j-1]=a[i];
		j=j-1;
	}
	System.out.println("The reversed array is: ");
	for(int k=0;k<size;k++)
	{
		
		System.out.println(b[k]);
	}
	
scanner.close();
	}

}
