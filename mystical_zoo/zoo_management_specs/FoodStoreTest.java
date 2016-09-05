import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class FoodStoreTest {

  FoodStore foodStore;
  Chicken chicken;

  @Before
  public void before(){
    foodStore = new FoodStore();
    chicken = new Chicken();
  }

  @Test
  public void canAddFood(){
    foodStore.addFood(chicken);
    assertEquals(1, foodStore.getCount());
  }

  @Test
  public void canRemoveFood(){
    foodStore.addFood(chicken);
    foodStore.removeFood();
    assertEquals(0, foodStore.getCount());
  }

}