package zoo_management;
import behaviours.*;

public abstract class MysticalCreature {

  String name;
  int value;
  GenderType gender;
  HabitatType habitat;
  int age;
  int life_expectancy;


  public MysticalCreature(String name, int value, GenderType gender, HabitatType habitat, int life_expectancy, int age){
    this.name = name;
    this.value = value;
    this.gender = gender;
    this.habitat = habitat;
    this.life_expectancy = life_expectancy;
    this.age = age;
  }

  public String getName(){
    return this.name;
  }

  public int getValue(){
    return this.value;
  }

  public int getLifeExpectancy(){
    return this.life_expectancy;
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

}