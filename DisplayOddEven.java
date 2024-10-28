package j19_Multithreading;

public class DisplayOddEven {
    public static void main(String[] args) {
        OddNumbers oddThread = new OddNumbers();
        EvenNumbers evenThread = new EvenNumbers();
        
        oddThread.start();
        evenThread.start();
    }
}




