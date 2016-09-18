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
  }

  public int getCapacity(){
    return this.capacity;
  }

  public ArrayList<MysticalCreature> getOccupants(){
    ArrayList<MysticalCreature> clone = new ArrayList<MysticalCreature>(this.mysticalCreature);
    return clone;
  }

  public ArrayList<Edible> getTrough(){
    ArrayList<Edible> clone = new ArrayList<Edible>(this.trough);
    return clone;
  }

  public void setCapacity(int newCapacity){
    this.capacity = newCapacity;
  }

  public void setHabitat(HabitatType newHabitat){
    this.habitat = newHabitat;
  }


  public int countFoodInTrough(){
    return trough.size();  
  }

  public int getSpace(){
    return (getCapacity() - getCount());
  }

  public int getCount(){
    return occupants.size();
  }

  public void addFoodToTrough(Edible item){
    trough.add(item);
  }

  public void removeFoodFromTrough(Edible item){
    trough.remove(item);
  }

  public HabitatType getHabitatType(){
    return this.habitat;
  }

  

  public boolean checkForOccupant(MysticalCreature creature){
    for (MysticalCreature mysticalCreature : occupants){
      if (mysticalCreature == creature){
        return true;
      }
    }
    return false;
  }

  public boolean checkForPredatorInEnclosure(MysticalCreature creature){
    String creatureClass = creature.getClass().getSimpleName().toUpperCase();
    for (MysticalCreature mysticalCreature : occupants){
      for (MysticalPreyType mysticalPrey : mysticalCreature.getMysticalPrey()){
        if (mysticalPrey.toString().equals(creatureClass)){
          return true;
        }
      }
    }
    return false;
  }



  public void addOccupant(MysticalCreature mysticalCreature){
    if (mysticalCreature.getHabitat() == getHabitatType()){
     occupants.add(mysticalCreature);}
  }

  public MysticalCreature removeOccupant(MysticalCreature mysticalCreature){
    int index = occupants.indexOf(mysticalCreature);
    MysticalCreature creature = occupants.remove(index);
    return creature;
  }

  public boolean checkIfANewCreatureWillAttackAnOccupant(MysticalCreature creature){
    for (MysticalPreyType mysticalPrey : creature.getMysticalPrey()){
      for (MysticalCreature mysticalCreature : occupants){
        if (mysticalPrey.toString().equals(mysticalCreature.getClass().getSimpleName().toUpperCase())){
          return true;
        }
      }
    }
    return false;
  }


  public int getAvailableSpace(){
    int space = (getCapacity() - getCount());
    return space;
  }

  public boolean checkIfSpace(){
    if (getCount() >= getCapacity()){
      return false;
    }
    else{
      return true;
    }
}

}






