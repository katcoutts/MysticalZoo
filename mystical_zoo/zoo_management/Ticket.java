package zoo_management;

public class Ticket{

  private int price;

  public Ticket(int price){
    this.price = price;
  } 

  public int getPrice(){
    return this.price;
  }

  public void setPrice(int newPrice){
    this.price = newPrice;
  }

}