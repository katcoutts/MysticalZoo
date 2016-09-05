package zoo_management;
import java.util.*;

public class Enclosure {

  private int capacity;
  private HabitatType habitat;
  private ArrayList<MysticalCreature> occupants;



  public Enclosure (int capacity, HabitatType habitat){
    // PROBABLY HERE DON'T NEED TO PASS IN THE SPACE AS THAT'S THE CAPACITY TO START WITH SO JUST SAY THIS.SPACE = CAPACITY.
    this.capacity = capacity;
    this.habitat = habitat;
    this.occupants = new ArrayList<MysticalCreature>();
    // MAYBE CHANGE THE ABOVE SO DIFFERENT TYPES OF ENCLOSURES CAN TAKE DIFFERENT TYPES OF ANIMALS BASED ON INTERFACE SO YOU CAN'T PUT A LAND ANIMAL IN A SEA ENCLOSURE.
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