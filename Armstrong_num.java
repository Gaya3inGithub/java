package j6_Num_based_logical_pgm;
import java.util.Scanner;
public class Armstrong_num {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=scanner.nextInt();
		int temp=n;
		int len=String.valueOf(n).length();
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			int q=n/10;
			n=q;
			int p= (int)Math.pow(r, len);
			sum+=p;
		}
		if(temp==sum)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not a Armstrong number");
		}
		scanner.close();
	}

}
