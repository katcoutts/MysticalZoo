package zoo_management;
import java.util.*;

public class Enclosure {

  private int capacity;
  private HabitatType habitat;
  private ArrayList<MysticalCreature> occupants;


  public Enclosure (int capacity, HabitatType habitat){
    this.capacity = capacity;
    this.habitat = habitat;
    this.occupants = new ArrayList<MysticalCreature>();
  }

  public int getCapacity(){
    return this.capacity;
  }

  public int getCount(){
    return occupants.size();
  }

  public HabitatType getHabitatType(){
    return this.habitat;
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

  public void addOccupant(MysticalCreature mysticalCreature){
    occupants.add(mysticalCreature);
  }

  

}