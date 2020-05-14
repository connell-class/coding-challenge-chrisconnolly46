package com.groceryList.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.groceryList.dao.groceryListDao;
import com.groceryList.model.GroceryList;

@Service
public class ListService {

  @Autowired
  groceryListDao gld;
  
  public GroceryList insert(GroceryList gl) {
    return gld.save(gl);
  }

  public List<GroceryList> findAll() {
    return gld.findAll();
    }
  
  public List<GroceryList> findById(Integer id){
    List<Integer> list = new ArrayList<Integer>();
    list.add(id);
    return gld.findAllById(list);
  }
  

  public String delete(Integer id) {
    gld.deleteById(id);
    return "This list has been deleted!";
  }

}
