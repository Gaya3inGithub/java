package Abstraction;

public class Movie implements Bookable{
public String movieTitle;
public String showTime;
public double ticketPrice;
public boolean Booked=false;

	public Movie(String mT, String sT, double tP ) {
		movieTitle=mT;
		showTime=sT;
		ticketPrice=tP;
}

	@Override
	public void bookTicket() {
		if (!Booked) {
            Booked = true;
            System.out.println("Movie " + movieTitle + " at " + showTime + " has been booked.");
        } else {
            System.out.println("Movie " + movieTitle + " is already booked.");
        }
		
	}

	@Override
	public void cancelBooking() {
		if (Booked) {
            Booked = false;
            System.out.println("Booking for movie " + movieTitle + " has been canceled.");
        } else {
            System.out.println("No booking found for movie " + movieTitle + ".");
        }
		
	}
	
	public void displayBookingStatus() {
        String status = Booked ? "Booked" : "Not Booked";
        System.out.println("Movie " + movieTitle + ": " + status);
    }

}
