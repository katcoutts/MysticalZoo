import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;
import java.util.*;

public class StockManagerTest {

  StockManager stockManager;
  CreatureUnit creatureUnit;
  Enclosure enclosure;
  Enclosure enclosure2;
  Enclosure enclosure3;
  Kraken kraken;
  Dragon dragon;
  Enclosure enclosure4;


  @Before
  public void before(){
    creatureUnit = new CreatureUnit();
    stockManager = new StockManager("Alan", creatureUnit);
    kraken = new Kraken("Robbie", 3000, GenderType.MALE, HabitatType.SEA, 26, 20);
    dragon = new Dragon("Charley", 2500, GenderType.FEMALE, HabitatType.AIR, 22, 5);
    enclosure = new Enclosure(20, HabitatType.SEA);
    enclosure2 = new Enclosure(42, HabitatType.SEA);
    enclosure3 = new Enclosure(5, HabitatType.LAND);
    enclosure4 = new Enclosure(2, HabitatType.AIR);
  }

  @Test
  public void canAddEnclosure(){
    stockManager.addEnclosure(enclosure);
    assertEquals(1, stockManager.countEnclosures());
  }

  @Test
  public void canGetTotalCapacityOfAllEnclosures(){
    stockManager.addEnclosure(enclosure);
    stockManager.addEnclosure(enclosure2);
    assertEquals(62, stockManager.getTotalCapacity());
  }

  @Test
  public void canGetTotalAvailableSpaceInAllEnclosures(){
    stockManager.addEnclosure(enclosure);
    stockManager.addEnclosure(enclosure2);
    enclosure2.addOccupant(kraken);
    assertEquals(61, stockManager.getTotalAvailableSpace());
  }

  @Test
  public void canSortEnclosuresBasedOnSpace(){
    stockManager.addEnclosure(enclosure2);
    stockManager.addEnclosure(enclosure);
    assertEquals(42, stockManager.getEnclosure(0).getSpace());
    creatureUnit.sortEnclosuresByAvailableSpace();
    assertEquals(20, stockManager.getEnclosure(0).getSpace());
  }

  @Test
  public void canGetTotalNoOfCreatures(){
    stockManager.addEnclosure(enclosure);
    stockManager.addEnclosure(enclosure2);
    enclosure2.addOccupant(kraken);
    enclosure.addOccupant(kraken);
    assertEquals(2, stockManager.getTotalCreatures());
  }

  @Test
  public void canFindMysticalCreature(){
    stockManager.addEnclosure(enclosure);
    stockManager.addEnclosure(enclosure2);
    enclosure2.addOccupant(kraken);
    assertEquals(enclosure2, stockManager.findMysticalCreature(kraken));
  }

  @Test
  public void canMoveMysticalCreature(){
    stockManager.addEnclosure(enclosure);
    stockManager.addEnclosure(enclosure2);
    enclosure2.addOccupant(kraken);
    assertEquals(1, enclosure2.getCount());
    stockManager.moveMysticalCreature(kraken, enclosure);
    assertEquals(1, enclosure.getCount());
    assertEquals(0, enclosure2.getCount());
  }

  @Test
  public void canGetEnclosuresOfSpecificHabitat(){
    stockManager.addEnclosure(enclosure);
    stockManager.addEnclosure(enclosure2);
    stockManager.addEnclosure(enclosure3);
    assertEquals(3, stockManager.countEnclosures());
    int number = stockManager.getEnclosuresOfParticularHabitatType(HabitatType.SEA).size();
    assertEquals(2, number);
  }

  @Test
  public void canPickRightEnclosureForAnimal(){
    stockManager.addEnclosure(enclosure2);
    stockManager.addEnclosure(enclosure);
    stockManager.addEnclosure(enclosure3);
    Enclosure enclosure = stockManager.pickEnclosureForCreature(kraken);
    assertEquals(20, enclosure.getCapacity());
  }

  @Test
  public void canGetCreatureIntoRightEnclosure(){
    stockManager.addEnclosure(enclosure2);
    stockManager.addEnclosure(enclosure);
    stockManager.addEnclosure(enclosure3);
    stockManager.getCreatureIntoRightEnclosure(kraken);
    assertEquals(1, enclosure.getCount());
  }

  @Test
  public void canGetRampageableCreatures(){
    stockManager.addEnclosure(enclosure4);
    enclosure4.addOccupant(dragon);
    stockManager.addEnclosure(enclosure2);
    enclosure2.addOccupant(kraken);
    int num = stockManager.getRampageableCreatures().size();
    assertEquals(1, num);
  }


}