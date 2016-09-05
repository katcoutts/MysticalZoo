package zoo_management;
import behaviours.*;
import java.util.*;

public class Chicken implements Edible {

    public String cluck(){
      return "Kweh!";
    }

    public int nutritionValue(){
      return 1;
    }

}

