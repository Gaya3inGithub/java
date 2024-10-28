package io_packages;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reverse_data_in_file {

	public static void main(String[] args) {
		String src="E:\\java programs\\J13_io_packages\\virat kholi.txt";
		String dest ="E:\\java programs\\vk.txt";
		
		try
		{
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			int d;
			String data="";
			while((d=fr.read())!=-1)
			{
				data = data+(char)d;
			}
			String rev ="";
			for(int i=0;i<data.length();i++)
			{
				
				rev=data.charAt(i)+rev;
			}
			fw.write(rev);
			fr.close();
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
}
}

