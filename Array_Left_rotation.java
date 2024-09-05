package j3_ControlStructure;
import java.util.Scanner;
public class Array_Left_rotation {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int n=scanner.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;i++)
		{
		a[i]=scanner.nextInt();
		}
		System.out.print("Enter the number of positions to rotate left:");
        int r= scanner.nextInt();
       for(int i=0;i<r;i++)
       {
    	   int first=a[0];
    	   for(int j=0;j<n-1;j++)
    	   {
    		   a[j]=a[j+1];
    	   }
    	   a[n-1]=first;
       }
    
       for(int i=0;i<a.length;i++)
       {
    	   System.out.print(a[i]+" ");
       }
      scanner.close();
    }
	}

