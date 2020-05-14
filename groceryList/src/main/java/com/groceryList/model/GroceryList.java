package com.groceryList.model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.groceryList.model.Item;

@Entity
@Table(name = "grocery_list")
public class GroceryList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "grocery_list", cascade = CascadeType.ALL)
    private Set<Item> groceryItems;
    
    @Column
    private String title;

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public GroceryList() {
      super();
      // TODO Auto-generated constructor stub
    }

    public GroceryList(int id, String title) {
      super();
      this.id = id;
      this.title = title;
    }
  


}
