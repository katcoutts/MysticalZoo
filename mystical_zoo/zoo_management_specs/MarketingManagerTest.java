import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;
import behaviours.*;
import java.util.*;

public class MarketingManagerTest {

  MarketingManager marketingManager;
  CreatureUnit creatureUnit;
  Enclosure enclosure1;
  Enclosure enclosure2;
  Dragon dragon;


  @Before
  public void before(){
    enclosure1 = new Enclosure(20, HabitatType.AIR);
    enclosure2 = new Enclosure(4, HabitatType.AIR);
    creatureUnit = new CreatureUnit();
    creatureUnit.addEnclosure(enclosure1);
    creatureUnit.addEnclosure(enclosure2);
    marketingManager = new MarketingManager("John", creatureUnit); 
    dragon = new Dragon("Charley", 2500, GenderType.FEMALE, 22, 5);
    enclosure1.addOccupant(dragon);
  }

  @Test
  public void canMakeRampagerRampage(){
    String string = marketingManager.makeRampagerRampage();
    assertEquals("Aaaargh. I'm rampaging. I'll burn you all.", string);
    assertEquals(0, enclosure1.getCount());
  }

}