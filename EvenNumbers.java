package j19_Multithreading;

public class EvenNumbers extends Thread {
    public void run() {
        for (int i = 2; i <= 30; i += 2) {
            System.out.println("Even Number: " + i);
        }
    }
}
