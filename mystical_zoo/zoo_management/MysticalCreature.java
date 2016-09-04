package zoo_management;
import behaviours.*;

public abstract class MysticalCreature {

  private String name;
  private int value;
  private GenderType gender;
  private HabitatType habitat;
  private int age;

  // need to think about the food aspect and bellies. If what they eat varies maybe the belly shouldn't be defined here.

// deleted int life_expectancy from just before int age below
  public MysticalCreature(String name, int value, GenderType gender, HabitatType habitat, int age){
    this.name = name;
    this.value = value;
    this.gender = gender;
    this.habitat = habitat;
    this.age = age;
  }

  public String getName(){
    return this.name;
  }

  public int getValue(){
    return this.value;
  }


  public GenderType getGender(){
    return this.gender;
  }

  public HabitatType getHabitat(){
    return this.habitat;
  }

  public int getAge(){
    return this.age;
  }

  public abstract String eat();

  public void setAge(int age){
    this.age = age;
  }

  public void setValue(int value){
    this.value = value;
  }


}