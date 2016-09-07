package zoo_management;
import java.util.*;
import behaviours.*;

public class MarketingManager extends Staff{

  public MarketingManager(String name, CreatureUnit creatureUnit){
    super(name, creatureUnit);
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


  public String makeRampagerRampage(){
    ArrayList<Rampageable> rampagers = getRampageableCreatures();
    Rampageable creature = rampagers.remove(0);
    MysticalCreature creatureMystical = (MysticalCreature)creature;
    Enclosure enclosure = creatureUnit.findMysticalCreature(creatureMystical);
    enclosure.removeOccupant(creatureMystical);
    return creature.rampage();
  }


}  