import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;
import behaviours.*;

public class ZooKeeperTest {

  ZooKeeper zooKeeper;
  // FoodStore foodStore;
  Chicken chicken;
  EnclosureManager enclosureManager;
  Enclosure enclosure;
  Enclosure enclosure2;
  Chicken chicken2;
  Kraken kraken;

  @Before
  public void before(){
    enclosure = new Enclosure(20, HabitatType.SEA);
    enclosure2 = new Enclosure(4, HabitatType.SEA);
    // foodStore = new FoodStore();
    chicken = new Chicken();
    chicken2 = new Chicken();
    // foodStore.addFood(chicken);
    // foodStore.addFood(chicken2);
    enclosureManager = new EnclosureManager();
    enclosureManager.addEnclosure(enclosure);
    enclosureManager.addEnclosure(enclosure2);
    zooKeeper = new ZooKeeper(enclosureManager); 
    zooKeeper.addFood(chicken);
    zooKeeper.addFood(chicken2);
    kraken = new Kraken("Robbie", 3000, GenderType.MALE, HabitatType.SEA, 26);
  }

  @Test
  public void canGetEnclosures(){
    int num = zooKeeper.getEnclosures().size();
    assertEquals(2, num);
  }

  @Test
  public void canGetFoodCount(){
    assertEquals(2, zooKeeper.getFoodCount());
  }

  // @Test
  // public void canFillAllTroughs(){
  //   enclosure.addOccupant(kraken);
  //   zooKeeper.fillAllTroughs(chicken);
  //   assertEquals(1, enclosure.countFoodInTrough());
  //   assertEquals(0, enclosure2.countFoodInTrough());
  // }

  @Test
  public void canFeedAnimals(){
    enclosure.addOccupant(kraken);
    zooKeeper.feedAnimals(chicken);
    assertEquals(1, kraken.getBelly().size());
  }





}