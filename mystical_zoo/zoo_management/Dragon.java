package zoo_management;
import behaviours.*;

public class Dragon extends MysticalCreature implements Rampageable{

  public Dragon(String name, int value, GenderType gender, HabitatType habitat, int age){
    super(name, value, gender, habitat, age);
  }

  public String eat(){
    return "Breathe fire. Chomp, chomp.";
  }

  public String rampage(){
    return "Aaaargh. I'm rampaging. I'll burn you all.";
  }

}