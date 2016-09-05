import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class EnclosureTest{

  Enclosure seaEnclosure;
  Kraken kraken;
  Enclosure seaEnclosure2;
  Chicken chicken;
  
  @Before 
  public void before(){
    seaEnclosure = new Enclosure(20, HabitatType.SEA);
    seaEnclosure2 = new Enclosure(1, HabitatType.SEA);
    chicken = new Chicken();
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
  public void canAddAnOccupant(){
    seaEnclosure.addOccupant(kraken);
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