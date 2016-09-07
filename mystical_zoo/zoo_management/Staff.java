package zoo_management;
import behaviours.*;
import java.util.*;

public abstract class Staff{

  private String name;
  protected CreatureUnit creatureUnit;

  public Staff(String name, CreatureUnit creatureUnit){
    this.name = name;
    this.creatureUnit = creatureUnit;
  }

  public ArrayList<Enclosure> getEnclosures(){
    return creatureUnit.getEnclosures();
  }

  public Enclosure getEnclosure(int index){
    return creatureUnit.getEnclosures().get(index);
  }


}