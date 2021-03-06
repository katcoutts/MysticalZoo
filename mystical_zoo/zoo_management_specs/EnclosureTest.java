import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;
import java.util.*;

public class EnclosureTest{

  Enclosure seaEnclosure;
  Kraken kraken;
  Enclosure seaEnclosure2;
  Chicken chicken;
  Dragon dragon;
  Dragon dragon2;
  Flump flump;
  
  @Before 
  public void before(){
    seaEnclosure = new Enclosure(20, HabitatType.SEA);
    seaEnclosure2 = new Enclosure(1, HabitatType.SEA);
    chicken = new Chicken();
    kraken = new Kraken("Robbie", 3000, GenderType.MALE, 26, 20);
    dragon2 = new Dragon("Charley", 2500, GenderType.FEMALE, 22, 5);
    flump = new Flump("Aela", 500, GenderType.FEMALE, 22, 5);
  }

  @Test
  public void canGetCapacity(){
    assertEquals(20, seaEnclosure.getCapacity());
  }

  @Test
  public void canGetHabitatType(){
    assertEquals(HabitatType.SEA, seaEnclosure.getHabitatType());
  }

  @Test
  public void troughStartsEmpty(){
    assertEquals(0, seaEnclosure.countFoodInTrough());
  }

  @Test
  public void canAddFoodToTrough(){
    seaEnclosure.addFoodToTrough(chicken);
    assertEquals(1, seaEnclosure.countFoodInTrough());
  }

  @Test
  public void testEnclosureStartsEmpty(){
    assertEquals(0, seaEnclosure.getCount());
  }

  @Test
  public void canCheckForPredators(){
    seaEnclosure.addOccupant(kraken);
    assertEquals(1, seaEnclosure.getCount());
    assertEquals(3, kraken.getMysticalPrey().size());
    // assertEquals("Dragon", kraken.getMysticalPrey().remove(0));
    assertEquals("Dragon", dragon2.getClass().getSimpleName());
    assertEquals(true, seaEnclosure.checkForPredatorInEnclosure(dragon2));
    // assertEquals(1, seaEnclosure.getOccupants().remove(0).getMysticalPrey().size());
    // assertEquals("Dragon", dragon2.getClass().getSimpleName());
    // assertEquals("Dragon", seaEnclosure.checkForPredator(dragon2));
    // assertEquals(true, seaEnclosure.checkForPredator(dragon2));
    // assertEquals(false, seaEnclosure2.checkForPredator(dragon));
  }

  @Test
  public void canCheckIfNewCreatureWouldAttackAnOccupant(){
    seaEnclosure.addOccupant(flump);
    assertEquals(1, seaEnclosure.getCount());
    assertEquals(true, seaEnclosure.checkIfANewCreatureWillAttackAnOccupant(kraken));
  }



  @Test
  public void canAddAnOccupant(){
    seaEnclosure.addOccupant(kraken);
    assertEquals("Kraken", kraken.getClass().getSimpleName());
    assertEquals(1, seaEnclosure.getCount());
    assertEquals(19, seaEnclosure.getSpace());
  }

  @Test
  public void canReturnTrueIfContainsThatOccupant(){
    seaEnclosure.addOccupant(kraken);
    assertEquals( true, seaEnclosure.checkForOccupant(kraken));
  }

  @Test
  public void canRemoveAnOccupant(){
    seaEnclosure.addOccupant(kraken);
    seaEnclosure.removeOccupant(kraken);
    assertEquals(0, seaEnclosure.getCount());
    assertEquals(20, seaEnclosure.getSpace());
  }

  // @Test
  // public void canGetAvailableSpace(){
  //   seaEnclosure.addOccupant(kraken);
  //   assertEquals(19, seaEnclosure.getAvailableSpace());
  // }

  @Test
  public void canReturnFalseIfNoSpace(){
    seaEnclosure2.addOccupant(kraken);
    assertEquals(1, seaEnclosure2.getCount());
    assertEquals(false, seaEnclosure2.checkIfSpace());
  }

  

}