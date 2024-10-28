package Polymorphism;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter size of an integer array: ");
		 int size = scanner.nextInt();
		 int []a= new int[size];
		 System.out.print("Enter element of an integer array: ");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=scanner.nextInt();
		 }
		 
		 Type_of_sort t = new Type_of_sort();
		 t.Bubble_sort(a);
		 t.Merge_sort(a,0,a.length-1);
		 t.printArray(a);
scanner.close();
	}

}
