package com.groceryList.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.groceryList.model.GroceryList;

@Entity
@Table(name = "items")
public class Item {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String itemName;
  private String type;
  
  @ManyToOne
  @JoinColumn(name="list_id")
  private GroceryList groceryList;
  
  public Item() {
    super();
    // TODO Auto-generated constructor stub
  }

  public Item(int id, String itemName, String type, GroceryList groceryList) {
    super();
    this.id = id;
    this.itemName = itemName;
    this.type = type;
    this.groceryList = groceryList;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GroceryList getGroceryList() {
    return groceryList;
  }

  public void setGroceryList(GroceryList groceryList) {
    this.groceryList = groceryList;
  }
  
  
}