package zoo_management;
import java.util.*;
import behaviours.*;

public class ZooKeeper{

  private CreatureManagementUnit cmu;
  private FoodStore foodStore;

  public ZooKeeper(FoodStore foodStore, CreatureManagementUnit cmu){
    this.cmu = cmu;
    this.foodStore = foodStore;
  }

  public FoodStore getFoodStore(){
    return this.foodStore;
  }

  public CreatureManagementUnit getCMU(){
    return this.cmu;
  }

  public void fillAllTroughs(Edible item){
    ArrayList<Enclosure> enclosures = cmu.getEnclosures();
    for (Enclosure enclosure : enclosures){
      enclosure.addFoodToTrough(item);
    }
  }

}