package io_packages;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Words_in_alphabetic_order_from_file {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String allWords = "";
            String line;
            while ((line = reader.readLine()) != null) {
                allWords += line.toLowerCase() + " "; 
            }
            reader.close();
            fr.close();
            String[] words = allWords.trim().split("\\s+");
            for (int i = 0; i < words.length - 1; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].compareTo(words[j]) > 0) {
                        String temp = words[i];
                        words[i] = words[j];
                        words[j] = temp;
                    }
                }
            }
            System.out.println("Words in alphabetical order:");
            for (String word : words) {
                System.out.println(word);
            }
        } catch (IOException e) {
            System.out.println("File not found: " + fileName);
        }
        scanner.close();	
	}
}





