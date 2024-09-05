package j5_String;
import java.util.Scanner;
public class First_letter_to_uppercase {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string:");
	        String inputString = scanner.nextLine();
	        int length = inputString.length();
	        char[] resultArray = new char[length];
	        int resultIndex = 0;
	        boolean capitalize = true;
	        for (int i = 0; i < length; i++) {
	            char currentChar = inputString.charAt(i);
	            if (currentChar == ' ') {
	                resultArray[resultIndex++] = currentChar;
	                capitalize = true;
	            } else {
	                if (capitalize) {
	                	resultArray[resultIndex++] = Character.toUpperCase(currentChar);
	                    capitalize = false;
	                } else {
	                    resultArray[resultIndex++] = currentChar;
	                }
	            }
	        }
	        String resultString = new String(resultArray);
	        System.out.print("String with capitalized words:");
	        System.out.println(resultString);
	        scanner.close();
	}

}
