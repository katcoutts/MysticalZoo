import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class TicketTest {

  Ticket ticket;
  
  @Before 
  public void before(){
    ticket = new Ticket(200);
  }

  @Test
  public void canGetPrice(){
    assertEquals(200, ticket.getPrice());
  }

  @Test
  public void canSetPrice(){
    ticket.setPrice(300);
    assertEquals(300, ticket.getPrice());
  }


}