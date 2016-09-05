import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;
import behaviours.*;

public class ZooKeeperTest {

  ZooKeeper zooKeeper;
  FoodStore foodStore;
  Chicken chicken;
  CreatureManagementUnit cmu;
  Enclosure enclosure;
  Enclosure enclosure2;
  Chicken chicken2;

  @Before
  public void before(){
    enclosure = new Enclosure(20, HabitatType.SEA);
    enclosure2 = new Enclosure(4, HabitatType.SEA);
    foodStore = new FoodStore();
    chicken = new Chicken();
    chicken2 = new Chicken();
    foodStore.addFood(chicken);
    foodStore.addFood(chicken2);
    cmu = new CreatureManagementUnit();
    cmu.addEnclosure(enclosure);
    cmu.addEnclosure(enclosure2);
    zooKeeper = new ZooKeeper(foodStore, cmu);      
  }

  @Test
  public void canFillAllTroughs(){
    zooKeeper.fillAllTroughs(chicken);
    assertEquals(1, enclosure.countFoodInTrough());
    assertEquals(1, enclosure2.countFoodInTrough());
  }





}