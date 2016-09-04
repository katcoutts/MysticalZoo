package zoo_management;
import java.util.*;

public class CreatureManagementUnit {

// want to add in so that you can check for spaces left and check by habitat type so we know if we can accept animals of particular types.
// maybe we should have some smaller units that look after particular types of animals??


  private ArrayList<Enclosure> enclosures;
  private Integer stockCount;

  public CreatureManagementUnit(){
    this.stockCount = 0;
    this.enclosures = new ArrayList<Enclosure>();
  }

  public Integer getStockCount(){
    return this.stockCount;
  }

  public int countEnclosures(){
    return enclosures.size();
  }

  public void addEnclosure(Enclosure enclosure){
    enclosures.add(enclosure);
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
      space += enclosure.getAvailableSpace();
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


} 