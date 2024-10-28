package io_packages;
import java.io.FileReader;
import java.io.IOException;
public class Count_char_in_file {
	public static void main(String[] args) {
		String n="E:\\java programs\\J13_io_packages\\virat kholi.txt";
		try
		{
			FileReader fr = new FileReader(n);
			int d;
			int count =0;
			while((d=fr.read())!=-1)
			{
				count++;
			}
			System.out.println("No.of.characters in file: "+count);
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println("File is not located the given location");
		}
}
}