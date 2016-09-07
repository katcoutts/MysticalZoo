import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;
import java.util.*;

public class EnclosureManagerTest {

  EnclosureManager enclosureManager;
  Enclosure enclosure;
  Enclosure enclosure2;
  Enclosure enclosure3;
  Kraken kraken;
  Dragon dragon;
  Enclosure enclosure4;
  ArrayList<String> mysticalPrey;
  ArrayList<String> mysticalPrey2;

  @Before
  public void before(){
    ArrayList<String> mysticalPrey  = new ArrayList<String>();
    mysticalPrey.add("Dragon");
    ArrayList<String> mysticalPrey2  = new ArrayList<String>();
    enclosureManager = new EnclosureManager();
    kraken = new Kraken("Robbie", 3000, GenderType.MALE, HabitatType.SEA, 26, 20, mysticalPrey2);
    dragon = new Dragon("Charley", 2500, GenderType.FEMALE, HabitatType.AIR, 22, 5, mysticalPrey);
    enclosure = new Enclosure(20, HabitatType.SEA);
    enclosure2 = new Enclosure(42, HabitatType.SEA);
    enclosure3 = new Enclosure(5, HabitatType.LAND);
    enclosure4 = new Enclosure(2, HabitatType.AIR);
  }

  @Test
  public void canAddEnclosure(){
    enclosureManager.addEnclosure(enclosure);
    assertEquals(1, enclosureManager.countEnclosures());
  }

  @Test
  public void canGetTotalCapacityOfAllEnclosures(){
    enclosureManager.addEnclosure(enclosure);
    enclosureManager.addEnclosure(enclosure2);
    assertEquals(62, enclosureManager.getTotalCapacity());
  }

  @Test
  public void canGetTotalAvailableSpaceInAllEnclosures(){
    enclosureManager.addEnclosure(enclosure);
    enclosureManager.addEnclosure(enclosure2);
    enclosure2.addOccupant(kraken);
    assertEquals(61, enclosureManager.getTotalAvailableSpace());
  }

  @Test
  public void canSortEnclosuresBasedOnSpace(){
    enclosureManager.addEnclosure(enclosure2);
    enclosureManager.addEnclosure(enclosure);
    assertEquals(42, enclosureManager.getEnclosure(0).getSpace());
    enclosureManager.sortEnclosuresByAvailableSpace();
    assertEquals(20, enclosureManager.getEnclosure(0).getSpace());
  }

  @Test
  public void canGetTotalNoOfCreatures(){
    enclosureManager.addEnclosure(enclosure);
    enclosureManager.addEnclosure(enclosure2);
    enclosure2.addOccupant(kraken);
    enclosure.addOccupant(kraken);
    assertEquals(2, enclosureManager.getTotalCreatures());
  }

  @Test
  public void canFindMysticalCreature(){
    enclosureManager.addEnclosure(enclosure);
    enclosureManager.addEnclosure(enclosure2);
    enclosure2.addOccupant(kraken);
    assertEquals(enclosure2, enclosureManager.findMysticalCreature(kraken));
  }

  @Test
  public void canMoveMysticalCreature(){
    enclosureManager.addEnclosure(enclosure);
    enclosureManager.addEnclosure(enclosure2);
    enclosure2.addOccupant(kraken);
    assertEquals(1, enclosure2.getCount());
    enclosureManager.moveMysticalCreature(kraken, enclosure);
    assertEquals(1, enclosure.getCount());
    assertEquals(0, enclosure2.getCount());
  }

  @Test
  public void canGetEnclosuresOfSpecificHabitat(){
    enclosureManager.addEnclosure(enclosure);
    enclosureManager.addEnclosure(enclosure2);
    enclosureManager.addEnclosure(enclosure3);
    assertEquals(3, enclosureManager.countEnclosures());
    int number = enclosureManager.getEnclosuresOfParticularHabitatType(HabitatType.SEA).size();
    assertEquals(2, number);
  }

  @Test
  public void canPickRightEnclosureForAnimal(){
    enclosureManager.addEnclosure(enclosure2);
    enclosureManager.addEnclosure(enclosure);
    enclosureManager.addEnclosure(enclosure3);
    Enclosure enclosure = enclosureManager.pickEnclosureForCreature(kraken);
    assertEquals(20, enclosure.getCapacity());
  }

  @Test
  public void canGetCreatureIntoRightEnclosure(){
    enclosureManager.addEnclosure(enclosure2);
    enclosureManager.addEnclosure(enclosure);
    enclosureManager.addEnclosure(enclosure3);
    enclosureManager.getCreatureIntoRightEnclosure(kraken);
    assertEquals(1, enclosure.getCount());
  }

  @Test
  public void canGetRampageableCreatures(){
    enclosureManager.addEnclosure(enclosure4);
    enclosure4.addOccupant(dragon);
    enclosureManager.addEnclosure(enclosure2);
    enclosure2.addOccupant(kraken);
    int num = enclosureManager.getRampageableCreatures().size();
    assertEquals(1, num);
  }


}