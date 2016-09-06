package zoo_management;
import java.util.*;
import behaviours.*;

public class Enclosure {

  private int capacity;
  private HabitatType habitat;
  private ArrayList<MysticalCreature> occupants;
  private ArrayList<Edible> trough;



  public Enclosure (int capacity, HabitatType habitat){
    this.capacity = capacity;
    this.habitat = habitat;
    this.occupants = new ArrayList<MysticalCreature>();
    this.trough = new ArrayList<Edible>();
    // NEED TO FILL A TROUGH UNTIL IT HAS ONE ITEM FOR EACH ANIMAL IN THE ENCLOSURE?
  }

  public int getCapacity(){
    return this.capacity;
  }

  public int getSpace(){
    return (getCapacity() - getCount());
  }

  public int getCount(){
    return occupants.size();
  }

  public ArrayList<Edible> getTrough(){
    return this.trough;
  }

  public int countFoodInTrough(){
    return trough.size();  
  }



  public void addFoodToTrough(Edible item){
    trough.add(item);
  }

  public HabitatType getHabitatType(){
    return this.habitat;
  }

  public ArrayList<MysticalCreature> getOccupants(){
    return this.occupants;
  }

  public boolean checkForOccupant(MysticalCreature creature){
    for (MysticalCreature mysticalCreature : occupants){
      if (mysticalCreature == creature){
        return true;
      }
    }
    return false;
  }

  // public int getAvailableSpace(){
  //   int space = (getCapacity() - getCount());
  //   return space;
  // }

  public boolean checkIfSpace(){
    if (getCount() >= getCapacity()){
      return false;
    }
    else{
      return true;
    }
  }

  public void addOccupant(MysticalCreature mysticalCreature){
    occupants.add(mysticalCreature);
  }

  public MysticalCreature removeOccupant(MysticalCreature mysticalCreature){
    int index = occupants.indexOf(mysticalCreature);
    MysticalCreature creature = occupants.remove(index);
    return creature;
  }



  

}