package j3_ControlStructure;

import java.util.Scanner;

public class Pair_on_array_Equal_sum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int n=scanner.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;i++)
		{
		a[i]=scanner.nextInt();
		}
		System.out.print("Enter the sum: ");
		int sum=scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.println(a[i]+" , "+a[j]);
				}
			}
		}
scanner.close();
	}

}
