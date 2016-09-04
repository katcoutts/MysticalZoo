import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class CreatureManagementUnitTest {

  CreatureManagementUnit cmu;
  Enclosure enclosure;
  Enclosure enclosure2;
  Kraken kraken;

  @Before
  public void before(){
    cmu = new CreatureManagementUnit();
    kraken = new Kraken("Robbie", 3000, GenderType.MALE, HabitatType.SEA, 26);
    enclosure = new Enclosure(20, HabitatType.SEA);
    enclosure2 = new Enclosure(42, HabitatType.SEA);
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
  public void canGetTotalNoOfCreatures(){
    cmu.addEnclosure(enclosure);
    cmu.addEnclosure(enclosure2);
    enclosure2.addOccupant(kraken);
    enclosure.addOccupant(kraken);
    assertEquals(2, cmu.getTotalCreatures());
  }


}