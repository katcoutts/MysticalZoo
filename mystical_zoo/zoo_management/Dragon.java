package zoo_management;
import behaviours.*;
import java.util.*;

public class Dragon extends MysticalCreature implements Rampageable{

  public Dragon(String name, int value, GenderType gender, HabitatType habitat, int age, int dailyFoodNeed){
    super(name, value, gender, habitat, age, dailyFoodNeed);
  }

  // public String eat(Edible food){
  //   belly.add(food);
  //   return "Breathe fire. Chomp, chomp.";
  // }

  public String rampage(){
    return "Aaaargh. I'm rampaging. I'll burn you all.";
  }

}