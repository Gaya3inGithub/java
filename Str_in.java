package j5_String;

import java.util.Scanner;
public class Str_in {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the number of strings: ");
	int n = scanner.nextInt();
    scanner.nextLine(); 
    String[] strings = new String[n];
    System.out.println("Enter the strings:");
    for (int i = 0; i < n; i++) {
        strings[i] = scanner.nextLine();
    }
    for (int i = 1; i < n; i++) {
        String key = strings[i];
        int j = i - 1;
        while (j >= 0 && strings[j].compareTo(key) > 0) {
            strings[j + 1] = strings[j];
            j--;
        }
        strings[j + 1] = key;
    }
    System.out.println("Sorted strings:");
    for (String str : strings) {
        System.out.println(str);
    }
    scanner.close();
}
}
