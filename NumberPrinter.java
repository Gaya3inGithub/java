package j19_Multithreading;
class NumberPrinter implements Runnable {
    private boolean reverse;

    public NumberPrinter(boolean reverse) {
        this.reverse = reverse;
    }

    @Override
    public void run() {
        if (reverse) {
            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread forwardThread = new Thread(new NumberPrinter(false));
        Thread reverseThread = new Thread(new NumberPrinter(true));

        forwardThread.start();
        Thread.sleep(3000); 
        reverseThread.start();

        forwardThread.join(); 
        reverseThread.join(); 
    }
}

