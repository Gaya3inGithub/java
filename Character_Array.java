package j5_String;
import java.util.Scanner;
public class Character_Array {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string:");
	        String inputString = scanner.nextLine();
	        int length = inputString.length();
	        char[] charArray = new char[length];
	        for (int i = 0; i < length; i++) {
	            charArray[i] = inputString.charAt(i);
	        }
	        System.out.print("Character array:");
	        for (int i=0;i<length;i++) {
	            System.out.print(charArray[i]+ " ");
	        }
	        scanner.close();
	}

}




