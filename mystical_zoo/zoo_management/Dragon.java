package zoo_management;
import behaviours.*;
import java.util.*;

public class Dragon extends MysticalCreature implements Rampageable{

  public Dragon(String name, int value, GenderType gender, int age, int dailyFoodNeed){
    super(name, value, gender, age, dailyFoodNeed);
    this.habitat = HabitatType.AIR;
  }

  public void setUpPreyList(){
    addMysticalPrey(MysticalPreyType.FLUMP);
  }

  // public String eat(Edible food){
  //   belly.add(food);
  //   return "Breathe fire. Chomp, chomp.";
  // }

  public String rampage(){
    return "Aaaargh. I'm rampaging. I'll burn you all.";
  }

}