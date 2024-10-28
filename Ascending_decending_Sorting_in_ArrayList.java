package j20_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ascending_decending_Sorting_in_ArrayList {
	 public static void main(String[] args) {
	       
	        ArrayList<Integer> numbers = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of elements you want to add: ");
	        int n = scanner.nextInt();
	        System.out.println();
	        
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            int number = scanner.nextInt();
	            numbers.add(number);
	        }
	        System.out.println();
	        
	        System.out.println("Original List: " + numbers);
	        System.out.println();
	        
	        Collections.sort(numbers);
	        System.out.println("Sorted in Ascending Order: " + numbers);
	        System.out.println();
	        
	        Collections.sort(numbers, Collections.reverseOrder());
	        System.out.println("Sorted in Descending Order: " + numbers);

	        scanner.close();
}
}

