package mystical_zoo;

public abstract class Enclosure {

  int capacity;
  HabitatType habitat;


  public Enclosure (int capacity, HabitatType habitat){
    this.capacity = capacity;
    this.habitat = habitat;
  }

}