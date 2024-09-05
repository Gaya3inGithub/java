package j3_ControlStructure;
import java.util.Scanner;
class Read_and_print_3_x_3 {

	public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter the row size: ");
    int row=scanner.nextInt();
    System.out.print("Enter the col size: ");
    int col=scanner.nextInt();
    int [][]a=new int[row][col];
    int i,j;
    for(i=0;i<row;i++)
    {
    	for(j=0;j<col;j++)
    	{
    	a[i][j]=scanner.nextInt();
    	}
    }
    System.out.println("The given matirx: ");
    for(i=0;i<row;i++)
    {
    	for(j=0;j<col;j++)
    	{ 
         System.out.print(a[i][j] + " ");
    	}
	 System.out.println();	
    }
	}
	}