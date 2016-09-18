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

  public String rampage(){
    return "Aaaargh. I'm rampaging. I'll burn you all.";
  }

}