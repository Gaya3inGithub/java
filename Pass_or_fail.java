package j20_Collection;

import java.util.Scanner;

public class Pass_or_fail {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("enter the number: ");
    int n= scanner.nextInt();
    
    Marks is_pass_or_fail = (num)->{
    	return (num >= 35) ? "Pass" : "Fail";
    };
scanner.close();
System.out.println("Result is: "+is_pass_or_fail.check(n));
	}

}
