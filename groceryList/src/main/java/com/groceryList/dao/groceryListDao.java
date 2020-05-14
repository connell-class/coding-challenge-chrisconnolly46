package com.groceryList.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.groceryList.model.GroceryList;

public interface groceryListDao extends JpaRepository<GroceryList, Integer>{

}
