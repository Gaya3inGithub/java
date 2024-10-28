package io_packages;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Image_copy_paste {
public static void main(String[]args)
{
	String src="E:\\certificate\\Alison certificate.png";
	String dest="E:\\My certificate.png";
	try
	{
		FileInputStream fr = new FileInputStream(src);
		FileOutputStream fw = new FileOutputStream(dest);
		byte []a=fr.readAllBytes();
		fw.write(a);
		System.out.println("Copied");
		fr.close();
		fw.close();
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
}
}
