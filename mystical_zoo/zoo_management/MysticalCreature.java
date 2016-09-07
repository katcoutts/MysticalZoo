package zoo_management;
import behaviours.*;
import java.util.*;

public abstract class MysticalCreature {

  private String name;
  private int value;
  private GenderType gender;
  private HabitatType habitat;
  private int age;
  private ArrayList<Edible> belly;
  private int dailyFoodNeed;
  private ArrayList<MysticalPreyType> mysticalPrey;

  // need to think about the food aspect and bellies. If what they eat varies, maybe the belly shouldn't be defined here possibly - but means there's loads of different bellies?

  public MysticalCreature(String name, int value, GenderType gender, HabitatType habitat, int age, int dailyFoodNeed){
    this.name = name;
    this.value = value;
    this.gender = gender;
    this.habitat = habitat;
    this.age = age;
    this.belly = new ArrayList<Edible>();
    this.dailyFoodNeed = dailyFoodNeed;
    this.mysticalPrey = new ArrayList<MysticalPreyType>();
    // setUpPreyList();
  }

  // protected abstract void setUpPreyList();

  public String getName(){
    return this.name;
  }

  public ArrayList<MysticalPreyType> getMysticalPrey(){
    ArrayList<MysticalPreyType> clone = new ArrayList<MysticalPreyType>(this.mysticalPrey);
    return clone;
  }

  public MysticalPreyType getMysticalPrey1(){
    return getMysticalPrey().remove(0);
  }

  public int getDailyFoodNeed(){
    return this.dailyFoodNeed;
  }

  public void addMysticalPrey(MysticalPreyType name){
    mysticalPrey.add(name);
  }

  public int getValue(){
    return this.value;
  }

  public ArrayList<Edible> getBelly(){
    return this.belly;
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

  public void eat(Edible food){
    belly.add(food);
  }

  public void sleep(){
    belly.clear();
  }

  public void setAge(int age){
    this.age = age;
  }

  public void setValue(int value){
    this.value = value;
  }


}