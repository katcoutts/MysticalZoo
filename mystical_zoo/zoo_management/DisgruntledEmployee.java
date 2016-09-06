package zoo_management;
import java.util.*;
import behaviours.*;

public class DisgruntledEmployee{

  String name;
  EnclosureManager enclosureManager;

  public DisgruntledEmployee(String name, EnclosureManager enclosureManager){
    this.name = name;
    this.enclosureManager = enclosureManager;
  }

  public EnclosureManager getEnclosureManager(){
    return this.enclosureManager;
  }

  public ArrayList<Enclosure> getEnclosures(){
    return enclosureManager.getEnclosures();
  }

  public ArrayList<Rampageable> getRampageableCreatures(){
    return enclosureManager.getRampageableCreatures();
  }

  public String makeRampagerRampage(){
    ArrayList<Rampageable> rampagers = getRampageableCreatures();
    Rampageable creature = rampagers.remove(0);
    MysticalCreature creatureMystical = (MysticalCreature)creature;
    Enclosure enclosure = enclosureManager.findMysticalCreature(creatureMystical);
    enclosure.removeOccupant(creatureMystical);
    return creature.rampage();
  }


}  