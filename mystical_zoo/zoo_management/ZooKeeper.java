package zoo_management;
import java.util.*;
import behaviours.*;

public class ZooKeeper{

  ArrayList<Edible> feed;
  String name;
  EnclosureManager enclosureManager;

  public ZooKeeper(EnclosureManager enclosureManager){
    this.enclosureManager = enclosureManager;
    this.name = name;
    this.feed = new ArrayList<Edible>();
  }

  public ArrayList<Edible> getFeed(){
    return this.feed;
  }

  public EnclosureManager getEnclosureManager(){
    return this.enclosureManager;
  }

  public ArrayList<Enclosure> getEnclosures(){
    return enclosureManager.getEnclosures();
  }

  public int getFoodCount(){
    return feed.size();
  }

  public void addFood(Edible food){
    feed.add(food);
  }

  public void fillAllTroughs(Edible item){
    ArrayList<Enclosure> enclosures = getEnclosures();
    for (Enclosure enclosure : enclosures){
      enclosure.addFoodToTrough(item);
    }
  }

}