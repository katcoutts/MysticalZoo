import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class KrakenTest {

  Kraken kraken;
  
  @Before 
  public void before(){
    kraken = new Kraken("Robbie", 3000, GenderType.MALE, HabitatType.SEA, 26);
  }

  @Test
  public void canGetName(){
    assertEquals("Robbie", kraken.getName());
  }

  @Test
  public void canEat(){
    assertEquals("Rrrraagh. I'll drag you down to the depths of the sea.", kraken.eat());
  }

  @Test
  public void canSetAge(){
    kraken.setAge(32);
    assertEquals(32, kraken.getAge());
  }

  @Test
  public void canGetValue(){
    assertEquals(3000, kraken.getValue());
  }

  @Test
  public void canGetGender(){
    assertEquals(GenderType.MALE, kraken.getGender());
  }

  @Test
  public void canGetHabitat(){
    assertEquals(HabitatType.SEA, kraken.getHabitat());
  }

  @Test
  public void canGetAge(){
    assertEquals(26, kraken.getAge());
  }

  // @Test
  // public void canGetLifeExpectancy(){
  //   assertEquals(80, kraken.getLifeExpectancy());
  // }

  // @Test
  // public void canSetLifeExpectancy(){
  //   kraken.setLifeExpectancy(60);
  //   assertEquals(60, kraken.getLifeExpectancy());
  // }

  @Test 
  public void canSetValue(){
    kraken.setValue(2000);
    assertEquals(2000, kraken.getValue());
  }

}