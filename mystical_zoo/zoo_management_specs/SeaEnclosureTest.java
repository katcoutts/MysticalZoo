import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class SeaEnclosureTest{

  SeaEnclosure seaEnclosure;
  Kraken kraken;
  SeaEnclosure seaEnclosure2;
  
  @Before 
  public void before(){
    seaEnclosure = new SeaEnclosure(20, HabitatType.SEA);
    seaEnclosure2 = new SeaEnclosure(1, HabitatType.SEA);
  }

  @Test
  public void canGetCapacity(){
    assertEquals(20, seaEnclosure.getCapacity());
  }

  @Test
  public void testEnclosureStartsEmpty(){
    assertEquals(0, seaEnclosure.getCount());
  }

  @Test
  public void canAddAnOccupant(){
    seaEnclosure.addOccupant(kraken);
    assertEquals(1, seaEnclosure.getCount());
  }

  @Test
  public void canGetAvailableSpace(){
    seaEnclosure.addOccupant(kraken);
    assertEquals(19, seaEnclosure.getAvailableSpace());
  }

  @Test
  public void canReturnFalseIfNoSpace(){
    seaEnclosure2.addOccupant(kraken);
    assertEquals(1, seaEnclosure2.getCount());
    assertEquals(false, seaEnclosure2.checkIfSpace());
  }

  

}