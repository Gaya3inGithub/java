package j3_ControlStructure;

import java.util.Scanner;

public class Frequency_of_each_element_in_array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int size=scanner.nextInt();
		int[]a=new int[size];
		for(int i=0;i<size;i++)
		 {
			a[i]=scanner.nextInt();
		 }
        System.out.println("Frequency of each element:");
        boolean[] printed = new boolean[size]; 
        
        for (int i = 0; i < size; i++) {
            if (!printed[i]) {
                int count = 1;
                for (int j = i + 1; j < size; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        printed[j] = true; 
                    }
                }
                System.out.println(a[i] + ": " + count);
            }
        }

scanner.close();
	}

}
