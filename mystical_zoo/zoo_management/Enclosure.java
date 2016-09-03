package zoo_management;

public abstract class Enclosure {

  int capacity;
  HabitatType habitat;
  // ArrayList<MysticalCreature> occupants;


  public Enclosure (int capacity, HabitatType habitat){
    this.capacity = capacity;
    this.habitat = habitat;
    // this.occupants = new ArrayList<MysticalCreature>;
  }

  public int getCapacity(){
    return this.capacity;
  }

  

}