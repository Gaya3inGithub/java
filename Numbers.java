package j19_Multithreading;

public class Numbers extends Thread{
public void run()
{
	for(int i=1;i<=10;i++)
	System.out.println(i);
}
}
