package zoo_management;
import behaviours.*;
import java.util.*;

public class Zoo {

  CreatureUnit creatureUnit;
  TicketOffice ticketOffice;
  String name;
  int takings;
  ZooKeeper zooKeeper;
  StockManager stockManager;
  MarketingManager marketingManager;

  public Zoo (String name, CreatureUnit creatureUnit, TicketOffice ticketOffice, ZooKeeper zooKeeper, StockManager stockManager, MarketingManager marketingManager){
    this.name = name;
    this.creatureUnit = creatureUnit;
    this.ticketOffice = ticketOffice;
    this.takings = 0;
    this.zooKeeper = zooKeeper;
    this.stockManager = stockManager;
    this.marketingManager = marketingManager;
  }

  public String getName(){
    return this.name;
  }

  public int getTakings(){
    return this.takings;
  }

  public ZooKeeper getZooKeeper(){
    return this.zooKeeper;
  }

  public TicketOffice getTicketOffice(){
    return this.ticketOffice;
  }

  public void addTicketOfficeTakingsToOverallTakings(){
    takings += ticketOffice.getTakings();
  }

  public CreatureUnit getCreatureUnit(){
    return this.creatureUnit;
  }

  public StockManager getStockManager(){
    return this.stockManager;
  }

  public MarketingManager getMarketingManager(){
    return this.marketingManager;
  }




}



