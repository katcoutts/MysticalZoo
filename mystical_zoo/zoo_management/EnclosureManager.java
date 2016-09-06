package zoo_management;
import java.util.*;
import behaviours.*;

public class EnclosureManager {


  private ArrayList<Enclosure> enclosures;

  public EnclosureManager(){
    this.enclosures = new ArrayList<Enclosure>();
  }

// if creature instanceof Rampageable

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

  public Enclosure pickEnclosureForCreature(MysticalCreature creature){
    HabitatType habitat = creature.getHabitat();
    ArrayList<Enclosure> potentialEnclosures = getEnclosuresOfParticularHabitatType(habitat);
    for (Enclosure enclosure : potentialEnclosures){
      if (enclosure.getSpace() >= 1) 
        return enclosure;
      }
    return null;
  }

  public void getCreatureIntoRightEnclosure(MysticalCreature creature){
    Enclosure enclosure = pickEnclosureForCreature(creature);
    enclosure.addOccupant(creature);
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

  public ArrayList<Rampageable> getRampageableCreatures(){
    ArrayList<Rampageable> rampageableCreatures = new ArrayList<Rampageable>();
    for (Enclosure enclosure : enclosures){
      for (MysticalCreature occupant : enclosure.getOccupants()){
        if (occupant instanceof Rampageable) {
          Rampageable rampager = (Rampageable) occupant;
          rampageableCreatures.add(rampager);
        }
      }
    }
    return rampageableCreatures;
  }

  public void moveMysticalCreature(MysticalCreature mysticalCreature, Enclosure enclosure){
    Enclosure currentEnclosure = findMysticalCreature(mysticalCreature);
    currentEnclosure.removeOccupant(mysticalCreature);
    enclosure.addOccupant(mysticalCreature);
  }




} 