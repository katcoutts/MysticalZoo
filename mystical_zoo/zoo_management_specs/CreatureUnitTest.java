import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;
import java.util.*;

public class CreatureUnitTest {

  CreatureUnit creatureUnit;
  Enclosure enclosure;
  Enclosure enclosure2;
  Enclosure enclosure3;
  Kraken kraken;
  Dragon dragon;
  Enclosure enclosure4;


  @Before
  public void before(){
    kraken = new Kraken("Robbie", 3000, GenderType.MALE, HabitatType.SEA, 26, 20);
    dragon = new Dragon("Charley", 2500, GenderType.FEMALE, HabitatType.AIR, 22, 5);
    enclosure = new Enclosure(20, HabitatType.SEA);
    enclosure2 = new Enclosure(42, HabitatType.SEA);
    enclosure3 = new Enclosure(5, HabitatType.LAND);
    enclosure4 = new Enclosure(2, HabitatType.AIR);
    creatureUnit = new CreatureUnit();
  }

  @Test
  public void canAddEnclosure(){
    creatureUnit.addEnclosure(enclosure);
    assertEquals(1, creatureUnit.countEnclosures());
  }

  @Test
  public void canCountEnclosures(){
    creatureUnit.addEnclosure(enclosure);
    creatureUnit.addEnclosure(enclosure);
    assertEquals(2, creatureUnit.countEnclosures());
  }

  @Test
  public void canGetSpace(){
    creatureUnit.addEnclosure(enclosure);
    creatureUnit.addEnclosure(enclosure2);
    enclosure2.addOccupant(kraken);
    assertEquals(61, creatureUnit.getTotalAvailableSpace());
  }

  @Test
  public void canGetTotalCreatures(){
    creatureUnit.addEnclosure(enclosure);
    creatureUnit.addEnclosure(enclosure2);
    enclosure2.addOccupant(kraken);
    assertEquals(1, creatureUnit.getTotalCreatures());
    assertEquals(enclosure2, creatureUnit.findMysticalCreature(kraken));
  }

  @Test
  public void canFindMysticalCreature(){
    creatureUnit.addEnclosure(enclosure);
    creatureUnit.addEnclosure(enclosure2);
    enclosure2.addOccupant(kraken);
    assertEquals(enclosure2, creatureUnit.findMysticalCreature(kraken));
  }

}