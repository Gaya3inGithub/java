package j3_ControlStructure;
import java.util.Scanner;
public class All_zero_to_end_of_an_array {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the size of an array: ");
	int size=scanner.nextInt();
	int[]a=new int[size];
	int count=0;
	for(int i=0;i<size;i++)
	 {
		a[i]=scanner.nextInt();
	 }
	 for (int i = 0; i < size; i++) {
         if (a[i] != 0) {
             int temp = a[count];
             a[count] = a[i];
             a[i] = temp;
             count++;
         }
     }
     System.out.println("Array after moving zeros to the end:");
     for (int i=0;i<size;i++) {
         System.out.println(a[i]);
     }
scanner.close();
	}

}
