import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class SeaEnclosureTest{

  SeaEnclosure seaEnclosure;
  
  @Before 
  public void before(){
    seaEnclosure = new SeaEnclosure(20, HabitatType.SEA);
  }

  @Test
  public void canGetCapacity(){
    assertEquals(20, seaEnclosure.getCapacity());
  }

}