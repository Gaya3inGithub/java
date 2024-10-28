package j20_Collection;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        Calulate_sum plus = (x,y)-> {
        	return x+y;
        };
        System.out.println("The sum of two numbers is: "+plus.add(num1, num2));
        scanner.close();
    }
}