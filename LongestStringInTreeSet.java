package j20_Collection;

import java.util.Scanner;
import java.util.TreeSet;

public class LongestStringInTreeSet {
public static void main(String[]args) {
	TreeSet<String> s = new TreeSet<>();
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the number of elements: ");
	int n=scanner.nextInt();
	scanner.nextLine();
	System.out.println();
	
	System.out.println("Enter " + n + " elements: ");
	for(int i=0;i<n;i++)
	{
		String st = scanner.nextLine();
		s.add(st);
	}
	System.out.println();
	
	String longestString = "";
    for (String ls: s) {
        if (ls.length() > longestString.length()) {
            longestString = ls;
        }
    }

 
    System.out.println("Longest string: " + longestString);
	scanner.close();
}
}


