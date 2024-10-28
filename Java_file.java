package io_packages;
import java.io.FileReader;
import java.io.IOException;
public class Java_file {

	public static void main(String[] args) {
		String n="E:\\java programs\\J13_io_packages\\src\\io_packages\\Java_file.java";
		try
		{
			FileReader fr = new FileReader(n);
			int d;
			String data="";
			while((d=fr.read())!=-1)
			{
				data = data+(char)d;
			}
			System.out.println(data);
			fr.close();
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}

