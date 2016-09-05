import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class CreatureManagementUnitTest {

  CreatureManagementUnit cmu;
  Enclosure enclosure;
  Enclosure enclosure2;
  Enclosure enclosure3;
  Kraken kraken;

  @Before
  public void before(){
    cmu = new CreatureManagementUnit();
    kraken = new Kraken("Robbie", 3000, GenderType.MALE, HabitatType.SEA, 26);
    enclosure = new Enclosure(20, HabitatType.SEA);
    enclosure2 = new Enclosure(42, HabitatType.SEA);
    enclosure3 = new Enclosure(5, HabitatType.LAND);
  }

  @Test
  public void canAddEnclosure(){
    cmu.addEnclosure(enclosure);
    assertEquals(1, cmu.countEnclosures());
  }

  @Test
  public void canGetTotalCapacityOfAllEnclosures(){
    cmu.addEnclosure(enclosure);
    cmu.addEnclosure(enclosure2);
    assertEquals(62, cmu.getTotalCapacity());
  }

  @Test
  public void canGetTotalAvailableSpaceInAllEnclosures(){
    cmu.addEnclosure(enclosure);
    cmu.addEnclosure(enclosure2);
    enclosure2.addOccupant(kraken);
    assertEquals(61, cmu.getTotalAvailableSpace());
  }

  @Test
  public void canSortEnclosuresBasedOnSpace(){
    cmu.addEnclosure(enclosure2);
    cmu.addEnclosure(enclosure);
    assertEquals(42, cmu.getEnclosure(0).getSpace());
    cmu.sortEnclosuresByAvailableSpace();
    assertEquals(20, cmu.getEnclosure(0).getSpace());
  }

  @Test
  public void canGetTotalNoOfCreatures(){
    cmu.addEnclosure(enclosure);
    cmu.addEnclosure(enclosure2);
    enclosure2.addOccupant(kraken);
    enclosure.addOccupant(kraken);
    assertEquals(2, cmu.getTotalCreatures());
  }

  @Test
  public void canFindMysticalCreature(){
    cmu.addEnclosure(enclosure);
    cmu.addEnclosure(enclosure2);
    enclosure2.addOccupant(kraken);
    assertEquals(enclosure2, cmu.findMysticalCreature(kraken));
  }

  @Test
  public void canMoveMysticalCreature(){
    cmu.addEnclosure(enclosure);
    cmu.addEnclosure(enclosure2);
    enclosure2.addOccupant(kraken);
    assertEquals(1, enclosure2.getCount());
    cmu.moveMysticalCreature(kraken, enclosure);
    assertEquals(1, enclosure.getCount());
    assertEquals(0, enclosure2.getCount());
  }

  @Test
  public void canGetEnclosuresOfSpecificHabitat(){
    cmu.addEnclosure(enclosure);
    cmu.addEnclosure(enclosure2);
    cmu.addEnclosure(enclosure3);
    assertEquals(3, cmu.countEnclosures());
    int number = cmu.getEnclosuresOfParticularHabitatType(HabitatType.SEA).size();
    assertEquals(2, number);
  }

  @Test
  public void canPickRightEnclosureForAnimal(){
    cmu.addEnclosure(enclosure2);
    cmu.addEnclosure(enclosure);
    cmu.addEnclosure(enclosure3);
    Enclosure enclosure = cmu.pickEnclosureForCreature(kraken);
    assertEquals(20, enclosure.getCapacity());
  }


}