package j20_Collection;

import java.util.Scanner;

public class Longest_string {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String1: ");
		String a =scanner.nextLine();
		System.out.print("Enter String2: ");
		String b =scanner.nextLine();
		
		LongString islong = (x,y) -> {
			return x.length() >= y.length() ? x : y; 
			
		};
		System.out.println("Longest String is: "+islong.s(a,b));
		scanner.close();
	}

}


