package zoo_management;
import java.util.*;

public class TicketOffice {

  private int takings;
  private ArrayList<Ticket> tickets;

  public TicketOffice(int takings){
    this.takings = takings;
    this.tickets = new ArrayList<Ticket>();
  }

  public int getTakings(){
    return this.takings;
  }

  public ArrayList<Ticket> getTickets(){
    return this.tickets;
  }

  public void addTicket(Ticket ticket){
    tickets.add(ticket);
  }

  public int countTickets(){
    return tickets.size();
  }

  public Ticket sellTicket(){
    if (countTickets() >= 1){
    Ticket ticket = tickets.remove(0);
    takings += ticket.getPrice();
    return ticket;
    }
    else{
      return null;
    }
  }


  public void setDaysTicketTotal(int total, Ticket ticket){
    for (int i=1; i<=(total); i++){
      tickets.add(ticket);
    }
  }

  // create method with a for loop to add the number of tickets for the day = you can maybe pass in the number so it's flexible.


  // need to create tickets 
  // ticket office contains an array of tickets. Maybe need a method which starts it up each day, putting in whatever we decide the maximum number of tickets is. 
  // extension could be to think about different types of tickets - kids, students, over-60 etc.
  // ticket office needs a till which keeps track of money.
  // refer to bear and salmon/human example with different nutrition counts.



}