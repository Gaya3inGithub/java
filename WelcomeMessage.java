package j20_Collection;

public class WelcomeMessage {
	public static void main(String[] args) {
     
        Message welcome = () -> "Welcome to the Java Program!";
        System.out.println(welcome.display());
    }
}


