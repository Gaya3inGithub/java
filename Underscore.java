package j5_String;

import java.util.Scanner;

public class Underscore {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string:");
	        String inputString = scanner.nextLine();
		char[] characters = inputString.toCharArray();
        for (int i = 3; i < characters.length; i += 4) {
            characters[i] = '_';
        }
        String result = new String(characters);
        System.out.println(result);
        scanner.close();
	}

}
