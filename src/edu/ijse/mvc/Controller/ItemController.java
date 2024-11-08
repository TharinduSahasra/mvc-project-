/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.Controller;
import edu.ijse.mvc.dto.Itemdto;
import edu.ijse.mvc.model.ItemModel;
import java.util.ArrayList;

/**
 *
 * @author Clone
 */
public class ItemController {
       private final ItemModel itemModel;

    public ItemController() throws Exception{
        this.itemModel = new ItemModel();
    }

    public String saveItem(Itemdto itemDto) throws Exception{
        String resp = itemModel.saveItem(itemDto);
        return resp;
    }
  public ArrayList<Itemdto> getAllItem() throws Exception{
        ArrayList<Itemdto> itemDtos = itemModel.getAllItem();
        return itemDtos;
    }

   public Itemdto searchItem(String itemId) throws Exception{
        Itemdto itemDto = itemModel.getItem(itemId);
        return itemDto;
    }

   

    public String deleteItem(String itemCode) throws Exception{
        String resp = itemModel.deleteItem(itemCode);
        return resp;
    }
 public String updateItem(Itemdto itemDto) throws Exception {
        String resp = itemModel.updateItem(itemDto);
        return resp;
    }



}

