import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;
import behaviours.*;
import java.util.*;

public class DisgruntledEmployeeTest {

  DisgruntledEmployee disgruntledEmployee;
  EnclosureManager enclosureManager;
  Enclosure enclosure1;
  Enclosure enclosure2;
  Dragon dragon;
  ArrayList<String> mysticalPrey;


  @Before
  public void before(){
    enclosure1 = new Enclosure(20, HabitatType.AIR);
    enclosure2 = new Enclosure(4, HabitatType.AIR);
    ArrayList<String> mysticalPrey = new ArrayList<String>();
    enclosureManager = new EnclosureManager();
    enclosureManager.addEnclosure(enclosure1);
    enclosureManager.addEnclosure(enclosure2);
    disgruntledEmployee = new DisgruntledEmployee("John", enclosureManager); 
    dragon = new Dragon("Charley", 2500, GenderType.FEMALE, HabitatType.AIR, 22, 5, mysticalPrey);
    enclosure1.addOccupant(dragon);
  }

  @Test
  public void canMakeRampagerRampage(){
    String string = disgruntledEmployee.makeRampagerRampage();
    assertEquals("Aaaargh. I'm rampaging. I'll burn you all.", string);
    assertEquals(0, enclosure1.getCount());
  }

}