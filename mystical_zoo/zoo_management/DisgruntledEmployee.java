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

// NEED TO TAKE THE RAMPAGER OUT OF IT'S ENCLOSURE SO THAT IT CAN RAMPAGE
  public String makeRampagerRampage(){
    ArrayList<Rampageable> rampagers = getRampageableCreatures();
    Rampageable creature = rampagers.remove(0);
    Enclosure enclosure = enclosureManager.findMysticalCreature((MysticalCreature)creature);
    enclosure.removeOccupant((MysticalCreature)creature);
    return creature.rampage();
  }


}  