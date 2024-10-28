package Polymorphism;

public class Arrange {

	public void sort(String[] s)
	{
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].compareTo(s[j])>0)
				{
					String t =s[i];
					s[i]=s[j];
					s[j]=t;
				}
			}
		}
		System.out.println("The sorted  string array is: ");
		for(int i=0;i<s.length;i++)
		{
			System.out.print(" "+s[i]);
		}
	}
	public void sort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The sorted  integer array is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
}

