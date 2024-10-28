package Abstraction;
import java.util.Scanner;
public class Bookable_Main 
{
	public static void main(String[] args) 
	{
	Scanner scanner = new Scanner(System.in);
	
	Flight flight = new Flight("AA123", "New York", "GAYATHRI T", 350.00);
    Movie movie = new Movie("Vellai illa pattathari", "7:00 PM", 12.00);

    while (true) 
    {
        System.out.println("\n--- Booking System ---");
        System.out.println("1. Book Flight");
        System.out.println("2. Cancel Flight Booking");
        System.out.println("3. Book Movie");
        System.out.println("4. Cancel Movie Booking");
        System.out.println("5. Display Flight Status");
        System.out.println("6. Display Movie Status");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice)
        {
            case 1:
                flight.bookTicket();
                break;
            case 2:
                flight.cancelBooking();
                break;
            case 3:
                movie.bookTicket();
                break;
            case 4:
                movie.cancelBooking();
                break;
            case 5:
                flight.displayBookingStatus();
                break;
            case 6:
                movie.displayBookingStatus();
                break;
            case 7:
                System.out.println("Exiting...");
                scanner.close();
                return;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
    }
	
	}

}

