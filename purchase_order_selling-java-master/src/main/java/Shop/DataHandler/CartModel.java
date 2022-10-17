/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.DataHandler;

/**
 *
 * @author ASUS
 */
public class CartModel {
    public String itemName;
    public int price;
    public String id;
    public int buyQuantity;
    public int totalAvailableQuantityItem;
    // int price needed for total price
    
    public CartModel(String id,String itemName, int price, int buyQuantity, int totalAvailableQuantityItem){
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.buyQuantity = buyQuantity;
        this.totalAvailableQuantityItem = totalAvailableQuantityItem;
    }
    
}
