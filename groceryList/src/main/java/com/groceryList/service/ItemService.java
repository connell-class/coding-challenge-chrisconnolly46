package com.groceryList.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.groceryList.dao.ItemDao;
import com.groceryList.model.Item;

@Service
public class ItemService {
  
  @Autowired
  ItemDao gid;
  
  public Item insert(Item i) {
    return gid.save(i);
  }
  
  public List<Item> findById(Integer id) {
     return gid.findItemByGroceryListId(id);
  }
  
  public String delete (Integer id) {
    gid.deleteById(id);
    return "This item has been removed!";
  }

}