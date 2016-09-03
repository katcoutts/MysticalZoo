package zoo_management;

public class Ogre extends MysticalCreature{

  public Ogre(String name, int value, GenderType gender, HabitatType habitat, int life_expectancy, int age){
    super(name, value, gender, habitat, life_expectancy, age);
  }

  public String eat(){
    return "Bonecrunching, bloodcurdling, munch, munch, munch.";
  }

}