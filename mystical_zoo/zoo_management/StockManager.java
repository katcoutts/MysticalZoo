package zoo_management;
import behaviours.*;
import java.util.*;

public class StockManager extends Staff {

  public StockManager(String name, CreatureUnit creatureUnit){
    super(name, creatureUnit);
  }

  public void addEnclosure(Enclosure enclosure){
    creatureUnit.addEnclosure(enclosure);
  }

  public void sortEnclosuresByAvailableSpace(){
    Collections.sort(getEnclosures(), (e1, e2) -> e1.getSpace() - e2.getSpace());
  }

  public int countEnclosures(){
    return creatureUnit.countEnclosures();
  }

  public void moveMysticalCreature(MysticalCreature mysticalCreature, Enclosure enclosure){
    Enclosure currentEnclosure = findMysticalCreature(mysticalCreature);
    currentEnclosure.removeOccupant(mysticalCreature);
    enclosure.addOccupant(mysticalCreature);
  }

  public ArrayList<Enclosure> getEnclosuresOfParticularHabitatType(HabitatType habitat){
    creatureUnit.sortEnclosuresByAvailableSpace();
    ArrayList<Enclosure> rightEnclosures = new ArrayList<Enclosure>();
    for (Enclosure enclosure : getEnclosures()){
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
      if ((enclosure.getSpace() >= 1) && (enclosure.checkForPredatorInEnclosure(creature) == false) && (enclosure.checkIfANewCreatureWillAttackAnOccupant(creature) == false)){ 
        return enclosure;
      }
    }
    return null;
  }

  public void getCreatureIntoRightEnclosure(MysticalCreature creature){
    Enclosure bestEnclosure = pickEnclosureForCreature(creature);
    bestEnclosure.addOccupant(creature);
  }


  public int getTotalCapacity(){
    int capacity = 0;
    for(Enclosure enclosure : getEnclosures()){
      capacity += enclosure.getCapacity();
    }
    return capacity;
  }

  public int getTotalAvailableSpace(){
    int space = 0;
    for (Enclosure enclosure : getEnclosures()){
      space += enclosure.getSpace();
    }
    return space;
  }  

  public int getTotalCreatures(){
    int total = 0;
    for (Enclosure enclosure : getEnclosures()){
      total += enclosure.getCount();
    }
    return total;
  }

  public Enclosure findMysticalCreature(MysticalCreature mysticalCreature){
    for (Enclosure enclosure : getEnclosures()){
      if(enclosure.checkForOccupant(mysticalCreature) == true){
        return enclosure;
      }
    }
    return null;
  }

  public ArrayList<Rampageable> getRampageableCreatures(){
    ArrayList<Rampageable> rampageableCreatures = new ArrayList<Rampageable>();
    for (Enclosure enclosure : getEnclosures()){
      for (MysticalCreature occupant : enclosure.getOccupants()){
        if (occupant instanceof Rampageable) {
          Rampageable rampager = (Rampageable) occupant;
          rampageableCreatures.add(rampager);
        }
      }
    }
    return rampageableCreatures;
  }

 


}