package io_packages;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
public class Read_txt_file_and_display_no_of_alpha_num_splchar_spaces {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	System.out.print("Enter path of the file: ");
    String filePath = scanner.nextLine(); 
    int alphabets = 0, numbers = 0, spaces = 0, specialSymbols = 0;
        try 
        {
        	FileReader f = new FileReader(filePath);
        	BufferedReader reader = new BufferedReader(f);
        	
            int character;
            while ((character = reader.read()) != -1) {
                if (Character.isLetter(character)) {
                    alphabets++;
                } else if (Character.isDigit(character)) {
                    numbers++;
                } else if (Character.isWhitespace(character)) {
                    spaces++;
                } else {
                    specialSymbols++;
                }
            }
            reader.close();
            f.close();
        } 
        catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        System.out.println("Alphabets: " + alphabets);
        System.out.println("Numbers: " + numbers);
        System.out.println("Blank spaces: " + spaces);
        System.out.println("Special symbols: " + specialSymbols);
scanner.close();
	}

}
