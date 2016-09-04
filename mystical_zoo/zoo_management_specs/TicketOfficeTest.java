import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class TicketOfficeTest {

  Ticket ticket;
  TicketOffice ticketOffice;

  @Before
  public void before(){
    ticket = new Ticket(200);
    ticketOffice = new TicketOffice(0);
  }

  @Test
  public void canGetTakings(){
    assertEquals(0, ticketOffice.getTakings());
  }

  @Test
  public void canCountTickets(){
    assertEquals(0, ticketOffice.countTickets());
  }

  @Test
  public void canAddATicket(){
    ticketOffice.addTicket(ticket);
    assertEquals(1, ticketOffice.countTickets());
  }

  @Test
  public void canSellATicket(){
    ticketOffice.addTicket(ticket);
    ticketOffice.sellTicket(ticket);
    assertEquals(0, ticketOffice.countTickets());
    assertEquals(200, ticketOffice.getTakings());
  }

  @Test
  public void canSetDaysTicketTotal(){
    ticketOffice.setDaysTicketTotal(200, ticket);
    assertEquals(200, ticketOffice.countTickets());
    ticketOffice.sellTicket(ticket);
    assertEquals(199, ticketOffice.countTickets());
    assertEquals(200, ticketOffice.getTakings());
  }


}