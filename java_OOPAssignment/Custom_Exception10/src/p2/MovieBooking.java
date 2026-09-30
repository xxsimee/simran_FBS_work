package p2;

public class MovieBooking {
	

    static String movieName = "3 Idiots";
    static double ticketPrice = 200;
    static int remainingTickets = 50;
   public void bookingTickets(int numberOfTickets) throws InvalidTicketNumberException, TicketSoldOutException
    {
    	if(numberOfTickets <=0)
    	{
    		throw new InvalidTicketNumberException("Invalid ticket number exception!!!!");
    	}
    	if(remainingTickets==0 || numberOfTickets > remainingTickets )
    	{
    		throw new TicketSoldOutException("Ticket Sold out!!!!");
    	}
    	remainingTickets = remainingTickets - numberOfTickets;

        double amount = numberOfTickets * ticketPrice;
        System.out.println("Booking Successful for \"" + movieName + "\"!");
        System.out.println("Tickets booked: " + numberOfTickets);
        System.out.println("Total amount: ₹" + amount);
    }
}
