package com.groceryList.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.groceryList.model.Item;

public interface ItemDao extends JpaRepository<Item, Integer>{

  List<Item> findItemByGroceryListId(int id);
  
}
