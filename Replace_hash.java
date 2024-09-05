package j5_String;

import java.util.Scanner;

public class Replace_hash{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string :");
        String input = scanner.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
             
                result+="###";
            } else {
           
                result+=ch;
            }
        }
        System.out.println(result);
        scanner.close();
	}
}