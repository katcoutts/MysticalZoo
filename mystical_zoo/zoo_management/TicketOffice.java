package zoo_management;
import java.util.*;


public class TicketOffice {

  private int takings;
  private int ticketsSold;
  private int currentVisitors;
  private int ticketPrice;
  private int capacity;

  public TicketOffice(int ticketPrice, int capacity){
    this.takings = 0;
    this.ticketPrice = ticketPrice;
    this.capacity = capacity;
    this.ticketsSold = 0;
    this.currentVisitors = 0;
  }

  public int getTakings(){
    return this.takings;
  }

  public void setTakings(int newTakings){
    this.takings = newTakings;
  }

  public int getTicketPrice(){
    return this.ticketPrice;
  }

  public void setTicketPrice(int newTicketPrice){
    this.ticketPrice = newTicketPrice;
  }

  public int getTicketsSold(){
    return this.ticketsSold;
  }

  public int getCurrentVisitors(){
    return this.currentVisitors;
  }

  public int getCapacity(){
    return this.capacity;
  }

  public void setCapacity(Integer newCapacity){
    this.capacity = newCapacity;
  }

  public void exitVisitor(){
    this.currentVisitors -= 1;
  }

  public int getRemainingSpace(){
    return (capacity - currentVisitors);
  }


  public String sellTicket(){
    if (getRemainingSpace() >= 1){
    takings += ticketPrice;
    this.ticketsSold += 1;
    this.currentVisitors +=1;
    return "Ticket Sold";
    }
    return "Zoo is full";
  }



 
  // extension could be to think about different types of tickets - kids, students, over-60 etc.
  // ticket office needs to keep track of takings.
  // refer to bear and salmon/human example with different nutrition counts.



}