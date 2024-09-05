package j7_logical_programming;
import java.util.Scanner;
public class Rep_nonRep_char_in_str {
	public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter String: ");
    String s= scanner.nextLine();
    char[] chars = s.toCharArray();
    int length = chars.length;
    String repeatedChars = "";
    String nonRepeatedChars = "";
    for (int i = 0; i < length; i++)
    {
        char currentChar = chars[i];
        int count = 0;
        for (int j = 0; j < length; j++)
        {
            if (chars[j] == currentChar)
            {
                count++;
            }
        }
        if (count > 1 && repeatedChars.indexOf(currentChar) == -1)
        {
            repeatedChars += currentChar;
        } 
        else if (count == 1 && nonRepeatedChars.indexOf(currentChar) == -1) 
        {
            nonRepeatedChars += currentChar;
        }
    }
    System.out.println("Repeated Characters are: " + repeatedChars);
    System.out.println("Non Repeated Characters are: " + nonRepeatedChars);
    scanner.close();

	}

}
