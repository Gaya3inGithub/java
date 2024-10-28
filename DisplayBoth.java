package j19_Multithreading;

public class DisplayBoth {

	public static void main(String[] args) {
		Numbers n = new Numbers();
		Alphabets a = new Alphabets();
		n.start();
		a.start();
	}

}
