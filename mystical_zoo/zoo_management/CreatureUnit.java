package zoo_management;
import behaviours.*;
import java.util.*;

public class CreatureUnit{

  private ArrayList<Enclosure> enclosures;

  public CreatureUnit(){
    this.enclosures = new ArrayList<Enclosure>();
  }

  public int countEnclosures(){
    return enclosures.size();
  }

  public ArrayList<Enclosure> getEnclosures(){
    ArrayList<Enclosure> clone = new ArrayList<Enclosure>(this.enclosures);
    return clone;
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


  public ArrayList<Enclosure> getEnclosuresOfParticularHabitatType(HabitatType habitat){
    sortEnclosuresByAvailableSpace();
    ArrayList<Enclosure> rightEnclosures = new ArrayList<Enclosure>();
    for (Enclosure enclosure : enclosures){
      if (enclosure.getHabitatType() == habitat){
        rightEnclosures.add(enclosure);
      }
    } 
    return rightEnclosures;
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


}