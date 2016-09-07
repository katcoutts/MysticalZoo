import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;
import java.util.*;

public class ZooTest {

  CreatureUnit creatureUnit;
  TicketOffice ticketOffice;
  ZooKeeper zooKeeper;
  StockManager stockManager;
  MarketingManager marketingManager;
  Zoo zoo;

  @Before
  public void before(){
    creatureUnit = new CreatureUnit();
    ticketOffice = new TicketOffice(25, 250);
    zooKeeper = new ZooKeeper("Tony", creatureUnit);
    stockManager = new StockManager("Alan", creatureUnit);
    marketingManager = new MarketingManager("John", creatureUnit);
    zoo = new Zoo("Mabel's Marvellous Mystical Creatures", creatureUnit, ticketOffice, zooKeeper, stockManager, marketingManager);
  }


  @Test
  public void canGetName(){
    assertEquals("Mabel's Marvellous Mystical Creatures", zoo.getName());
  }

  @Test
  public void canGetTakings(){
    assertEquals(0, zoo.getTakings());
  }


}

