package zoo_management;
import java.util.*;
import behaviours.*;

public class CreatureManagementUnit {

// want to add in so that you can check for spaces left and check by habitat type so we know if we can accept animals of particular types.
// maybe we should have some smaller units that look after particular types of animals??


  private ArrayList<Enclosure> enclosures;


  public CreatureManagementUnit(){
    this.enclosures = new ArrayList<Enclosure>();
  }


  public int countEnclosures(){
    return enclosures.size();
  }

  public ArrayList<Enclosure> getEnclosures(){
    return this.enclosures;
  }

  public Enclosure getEnclosure(int index){
    return getEnclosures().get(index);
  }

  public void addEnclosure(Enclosure enclosure){
    enclosures.add(enclosure);
  }

  public void sortEnclosuresByAvailableSpace(){
    Collections.sort(enclosures, (e1, e2) -> e1.getSpace() - e2.getSpace());
  }

  public int getTotalCapacity(){
    int capacity = 0;
    for(Enclosure enclosure : enclosures){
      capacity += enclosure.getCapacity();
    }
    return capacity;
  }

  public int getTotalAvailableSpace(){
    int space = 0;
    for (Enclosure enclosure : enclosures){
      space += enclosure.getSpace();
    }
    return space;
  }  

  public int getTotalCreatures(){
    int total = 0;
    for (Enclosure enclosure : enclosures){
      total += enclosure.getCount();
    }
    return total;
  }

  public Enclosure findMysticalCreature(MysticalCreature mysticalCreature){
    for (Enclosure enclosure : enclosures){
      if(enclosure.checkForOccupant(mysticalCreature) == true){
        return enclosure;
      }
    }
    return null;
  }

  public void moveMysticalCreature(MysticalCreature mysticalCreature, Enclosure enclosure){
    Enclosure currentEnclosure = findMysticalCreature(mysticalCreature);
    currentEnclosure.removeOccupant(mysticalCreature);
    enclosure.addOccupant(mysticalCreature);
  }




} 