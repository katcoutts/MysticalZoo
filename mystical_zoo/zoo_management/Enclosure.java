package zoo_management;
import java.util.*;

public class Enclosure {

  private int capacity;
  private HabitatType habitat;
  private ArrayList<MysticalCreature> occupants;
  private int space;


  public Enclosure (int capacity, HabitatType habitat, int space){
    // PROBABLY HERE DON'T NEED TO PASS IN THE SPACE AS THAT'S THE CAPACITY TO START WITH SO JUST SAY THIS.SPACE = CAPACITY.
    this.capacity = capacity;
    this.habitat = habitat;
    this.space = space;
    this.occupants = new ArrayList<MysticalCreature>();
  }

  public int getCapacity(){
    return this.capacity;
  }

  public int getSpace(){
    return this.space;
  }

  public int getCount(){
    return occupants.size();
  }

  public HabitatType getHabitatType(){
    return this.habitat;
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
    this.space -= 1;
  }

  

}