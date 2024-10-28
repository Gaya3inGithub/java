package j19_Multithreading;

public class OddNumbers extends Thread {
    public void run() {
        for (int i = 1; i <= 30; i += 2) {
            System.out.println("Odd Number: " + i);
        }
    }
}
