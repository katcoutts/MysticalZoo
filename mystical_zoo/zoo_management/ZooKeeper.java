package zoo_management;
import java.util.*;
import behaviours.*;

public class ZooKeeper extends Staff{

  ArrayList<Edible> feed;

  public ZooKeeper(String name, CreatureUnit creatureUnit){
    super(name, creatureUnit);
    this.feed = new ArrayList<Edible>();
  }

  public ArrayList<Edible> getFeed(){
    ArrayList<Edible> clone = new ArrayList<Edible>(this.feed);
    return clone;
  }


  public ArrayList<Enclosure> getEnclosures(){
    return creatureUnit.getEnclosures();
  }

  public int getFoodCount(){
    return feed.size();
  }

  public void addFood(Edible food){
    feed.add(food);
  }

  // public void fillAllTroughs(Edible item){
  //   ArrayList<Enclosure> enclosures = getEnclosures();
  //   for (Enclosure enclosure : enclosures){
  //     // get no of animals and then leave that many bits of food
  //     int noOfAnimals = enclosure.getCount();
  //     for (int i=0; i<noOfAnimals; i++){
  //     enclosure.addFoodToTrough(item);
  //     }
  //   }
  // }

  // public void callAnimalsToEat(Edible item){
  //   for (Enclosure enclosure : getEnclosures()){
  //     for (MysticalCreature creature : enclosure.getOccupants()){
            // for (int i=0; i<creature.getDailyFoodNeed(); i++){
            // creature.eat(item);
            // }
  //       creature.eat(item);
  //     }
  //   }
  // }

  public void feedAnimals(Edible item){
    ArrayList<Enclosure> enclosures = getEnclosures();
    // for (Enclosure enclosure : enclosures){
    //   
    //   int noOfAnimals = enclosure.getCount();
    //   for (int i=0; i<noOfAnimals; i++){
    //   enclosure.addFoodToTrough(item);
    //   }
    // }
    for (Enclosure enclosure : getEnclosures()){
      for (MysticalCreature creature : enclosure.getOccupants()){
        for (int i=0; i<creature.getDailyFoodNeed(); i++){
        creature.eat(item);
        }
        // enclosure.removeFoodFromTrough(item);
      }
    }
  }

}