package zoo_management;

public class Dragon extends MysticalCreature{

  public Dragon(String name, int value, GenderType gender, HabitatType habitat, int age){
    super(name, value, gender, habitat, age);
  }

  public String eat(){
    return "Breathe fire. Chomp, chomp.";
  }

}