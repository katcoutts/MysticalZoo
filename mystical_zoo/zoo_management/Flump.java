package zoo_management;
import behaviours.*;
import java.util.*;

public class Flump extends MysticalCreature{

  public Flump (String name, int value, GenderType gender, int age, int dailyFoodNeed){
    super(name, value, gender, age, dailyFoodNeed);
    this.habitat = HabitatType.SEA;
  }

}