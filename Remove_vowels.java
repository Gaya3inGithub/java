package j5_String;

import java.util.Scanner;

public class Remove_vowels {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string :");
        String Str = scanner.nextLine();
        char[] result = new char[Str.length()];
        int index = 0;
        for (int i = 0; i < Str.length(); i++) {
            char ch = Str.charAt(i);
            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' &&
                ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                result[index++] = ch;
            }
        }
        String output = new String(result, 0, index);
        System.out.println(output);
        scanner.close();
	}
}
