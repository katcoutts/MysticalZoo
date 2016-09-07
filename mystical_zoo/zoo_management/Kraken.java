package zoo_management;
import java.util.*;


public class Kraken extends MysticalCreature{

  public Kraken(String name, int value, GenderType gender, int age, int dailyFoodNeed){
    super(name, value, gender, age, dailyFoodNeed);
    this.habitat = HabitatType.SEA;
    setUpPreyList();
  }

  public void setUpPreyList(){
    addMysticalPrey(MysticalPreyType.DRAGON);
    addMysticalPrey(MysticalPreyType.FLUMP);
    addMysticalPrey(MysticalPreyType.UNICORN);
  }


  // public String eat(){
  //   belly.add(Edible food);
  //   return "Rrrraagh. I'll drag you down to the depths of the sea.";
  // }

}