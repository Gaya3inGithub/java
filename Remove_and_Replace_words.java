package io_packages;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Remove_and_Replace_words {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	try
	{
		System.out.print("Enter the file path: ");
		String f = scanner.nextLine() ;
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.print("Enter the line to add in file: ");
		String d = scanner.nextLine();
		bw.write(d);
		bw.close();
		fw.close();
		System.out.println("saved");
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	scanner.close();
	}

}
