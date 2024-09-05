package j3_ControlStructure;
import java.util.Scanner;
public class Sum_and_avg_of_array
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
{
	System.out.print("Enter size of an array: ");
	int size = scanner.nextInt();
	int i,sum=0,avg = 0;
	int[] a = new int[size];
     for (i=0;i<size;i++)
     {
	a[i] = scanner.nextInt(); 
	sum += a[i];
	avg=sum/size;
     }
System.out.println("The total sum of an array is: "+sum);
System.out.println("The average of an array is: "+avg);
scanner.close();
	}
}
}
