import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;
import behaviours.*;

public class ZooKeeperTest {

  ZooKeeper zooKeeper;
  FoodStore foodStore;
  Edible chicken;

  @Before
  public void before(){
    foodStore = new FoodStore();
    foodStore.addFood(chicken);
    zooKeeper = new ZooKeeper();  
  }

  @Test
  public void canAddFood(){
    zooKeeper.addFood(chicken);
    assertEquals(1, zooKeeper.getCount());
  }

  @Test
  public void canGetFoodFromFoodStore(){
    zooKeeper.getFoodFromFoodStore();
    assertEquals(1, zooKeeper.getCount());
  }



}