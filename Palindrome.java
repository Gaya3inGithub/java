package j5_String;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
System.out.print("Enter a string: ");
String s=scanner.nextLine();
int temp=0;
int left=0;
int right=s.length()-1;
while(left<right)
{
	if(s.charAt(left)==s.charAt(right))
	{
		left++;
		right--;
	}
	else
	{
		temp=1;
		break;
	}
}
	if(temp==0)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
	scanner.close();
}

	}


