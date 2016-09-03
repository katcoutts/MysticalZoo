import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class OgreTest {

  Ogre ogre;
  
  @Before 
  public void before(){
    ogre = new Ogre("Robbie", 3000, GenderType.MALE, HabitatType.LAND, 80, 26);
  }

  @Test
  public void canGetName(){
    assertEquals("Robbie", ogre.getName());
  }

  @Test
  public void canEat(){
    assertEquals("Bonecrunching, bloodcurdling, munch, munch, munch.", ogre.eat());
  }

  @Test
  public void canSetAge(){
    ogre.setAge(32);
    assertEquals(32, ogre.getAge());
  }

  @Test
  public void getValue(){
    assertEquals(3000, ogre.getValue());
  }

  @Test
  public void getGender(){
    assertEquals(GenderType.MALE, ogre.getGender());
  }

  @Test
  public void getHabitat(){
    assertEquals(HabitatType.LAND, ogre.getHabitat());
  }

  @Test
  public void getAge(){
    assertEquals(26, ogre.getAge());
  }

  @Test
  public void getLifeExpectancy(){
    assertEquals(80, ogre.getLifeExpectancy());
  }

}