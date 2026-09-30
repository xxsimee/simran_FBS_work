package p2;

import java.util.Scanner;

public class TestMovieBookinf {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		MovieBooking mb=new MovieBooking();
		
		System.out.println("Movie Name:"+MovieBooking.movieName);
		System.out.println("Ticket Price: "+MovieBooking.ticketPrice);
		System.out.println("Remaining ticket: "+MovieBooking.remainingTickets);
		 System.out.println("Enter number of tickets: ");
		 int numberOfTickets=sc.nextInt();
		 
		 try {
			 mb.bookingTickets(numberOfTickets);
		 }catch(InvalidTicketNumberException e)
		 {
			 System.out.println(e.getMessage());
			 e.printStackTrace();
		 } catch (TicketSoldOutException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		 
sc.close();
	}
}
