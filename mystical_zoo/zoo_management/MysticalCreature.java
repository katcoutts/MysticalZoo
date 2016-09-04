package zoo_management;
import behaviours.*;

public abstract class MysticalCreature {

  String name;
  int value;
  GenderType gender;
  HabitatType habitat;
  int age;

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