package Abstraction;

public class Flight implements Bookable{
public String flightNumber;
public double ticketPrice;
public String departureCity,arrivalCity;
public boolean Booked=false;
	public Flight(String fNum, String dc, String ac, double Tp) {
		flightNumber=fNum;
		departureCity=dc;
		arrivalCity=ac;
		ticketPrice=Tp;
}

	@Override
	public void bookTicket() 
	{
		if(!Booked)
		{
			Booked = true;
            System.out.println("Flight " + flightNumber + " from " + departureCity + " to " + arrivalCity + " has been booked.");
            System.out.println("The price of the ticket is: "+ticketPrice);
        } 
		else
        {
            System.out.println("Flight " + flightNumber + " is already booked.");
        }
	}
		
	@Override
	public void cancelBooking() 
	{
		 if (Booked) 
		 {
	         Booked = false;
	         System.out.println("Booking for flight " + flightNumber + " has been canceled.");
	         System.out.println("The price returned is :"+ticketPrice);
	     }
		 else 
		 {
	      System.out.println("No booking found for flight " + flightNumber + ".");
	     }
		
	}
	public void displayBookingStatus() {
        String status = Booked ? "Booked" : "Not Booked";
        System.out.println("Flight " + flightNumber + ": " + status);
    }

}
