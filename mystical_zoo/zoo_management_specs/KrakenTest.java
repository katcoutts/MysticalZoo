import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;
import java.util.*;

public class KrakenTest {

  Kraken kraken;
  Chicken chicken;
  Dragon dragon;
  
  @Before 
  public void before(){
    kraken = new Kraken("Robbie", 3000, GenderType.MALE, 26, 20);
    chicken = new Chicken();
  }

  @Test
  public void canGetName(){
    assertEquals("Robbie", kraken.getName());
  }

  @Test
  public void getMysticalPrey(){
    assertEquals(3, kraken.getMysticalPrey().size());
  }


  // @Test
  // public void canEat(){
  //   assertEquals("Rrrraagh. I'll drag you down to the depths of the sea.", kraken.eat(chicken));
  // }

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

  @Test
  public void canGetFoodInBelly(){
    kraken.eat(chicken);
    assertEquals(1, kraken.getBelly().size());
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