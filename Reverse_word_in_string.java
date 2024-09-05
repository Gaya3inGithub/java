package j7_logical_programming;
import java.util.Scanner;
public class Reverse_word_in_string {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter String: ");
	String s=scanner.nextLine();
	String []a=s.split(" ");	
	String Result="";
	for(int i=0;i<a.length;i++)
	{
		String word=a[i];
		String Reverse="";
		for(int j=0;j<word.length();j++)
		{
		   Reverse= word.charAt(j)+Reverse;
		}
		Result=Result+Reverse+" ";
	}
	System.out.println(Result);
	scanner.close();
	}

}
