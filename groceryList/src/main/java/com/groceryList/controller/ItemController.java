package com.groceryList.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.groceryList.model.GroceryList;
import com.groceryList.model.Item;
import com.groceryList.service.ItemService;
import com.groceryList.service.ListService;


@RestController
@RequestMapping("/grocerylist")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ItemController {
  
  @Autowired
  private ItemService itemService;
  
  @Autowired
  private ListService listService;
  
  @GetMapping
  public List<GroceryList> List(){
    return listService.findAll();
  }
  
  @PostMapping
  public GroceryList insert(@RequestBody GroceryList gl) {
    return listService.insert(gl);
  }
  
  @PostMapping("/item")
  public Item insert(@RequestBody Item i) {
    return itemService.insert(i);
  }
  
  @GetMapping("/{id}")
  public List<Item> listItem(@PathVariable("id") int id){
    return itemService.findById(id);
  }
  
  @DeleteMapping("item/{id}")
  public String deleteItem(@PathVariable("id") int id) {
    return itemService.delete(id);
  }
  
  @DeleteMapping("/{id}")
  public String deleteList(@PathVariable("id") int id) {
    return listService.delete(id);
  }

  
  
  
}
