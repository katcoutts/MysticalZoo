package zoo_management;

public class Kraken extends MysticalCreature{

  public Kraken(String name, int value, GenderType gender, HabitatType habitat, int age){
    super(name, value, gender, habitat, age);
  }

  public String eat(){
    return "Rrrraagh. I'll drag you down to the depths of the sea.";
  }

}