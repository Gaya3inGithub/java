package j7_logical_programming;
import java.util.Scanner;
public class Remove_Space_in_string {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter string: ");
	String s =scanner.nextLine();
	String rev="";
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c!=' ')
		{
		  rev=rev+c;
		}
	}
	System.out.println(rev);
	scanner.close();
	}

}
