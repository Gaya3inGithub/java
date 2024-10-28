package j19_Multithreading;

public class Alphabets extends Thread {
public void run()
{
 for(int i=65;i<=75;i++)
  System.out.println((char)i);
}
}