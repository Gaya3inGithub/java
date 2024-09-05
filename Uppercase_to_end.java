package j5_String;

import java.util.Scanner;

public class Uppercase_to_end {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string :");
        String Str = scanner.nextLine();
        char[] result = new char[Str.length()];
        int lowercaseIndex = 0; 
        int uppercaseIndex = Str.length(); 
        for (int i = 0; i < Str.length(); i++) {
            char ch = Str.charAt(i);
            if (Character.isUpperCase(ch)) {
                result[--uppercaseIndex] = ch;
            } else {
                result[lowercaseIndex++] = ch;
            }
        }
        String output = new String(result);
        System.out.println(output);
scanner.close();
	}

}
