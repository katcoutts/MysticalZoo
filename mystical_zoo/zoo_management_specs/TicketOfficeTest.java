import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class TicketOfficeTest {

  TicketOffice ticketOffice;
  TicketOffice ticketOffice2;


  @Before
  public void before(){
    ticketOffice = new TicketOffice(25, 200);
    ticketOffice2 = new TicketOffice(25, 1);
  }

  @Test
  public void canGetTakings(){
    assertEquals(0, ticketOffice.getTakings());
  }

  @Test
  public void canGetCapacity(){
    assertEquals(200, ticketOffice.getCapacity());
  }

  @Test
  public void canSetCapacity(){
    ticketOffice.setCapacity(250);
    assertEquals(250, ticketOffice.getCapacity());
  }

  @Test
  public void canSellATicket(){
    ticketOffice.sellTicket();
    assertEquals(25, ticketOffice.getTakings());
    assertEquals(1, ticketOffice.getCurrentVisitors());
    assertEquals(1, ticketOffice.getTicketsSold());
    assertEquals(199, ticketOffice.getRemainingSpace());
  }

  @Test
  public void canNotSellTicketIfNoSpace(){
    ticketOffice2.sellTicket();
    assertEquals(0, ticketOffice2.getRemainingSpace());
    assertEquals(1, ticketOffice2.getCurrentVisitors());
    ticketOffice2.sellTicket();
    assertEquals(1, ticketOffice2.getCurrentVisitors());
  }

  @Test
  public void canExitAVisitor(){
    ticketOffice.sellTicket();
    assertEquals(1, ticketOffice.getCurrentVisitors());
    ticketOffice.exitVisitor();
    assertEquals(0, ticketOffice.getCurrentVisitors());
  }


}