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
public class ItemShopModel {

    public String id;
    public String name;
    public String price;
    public String quantity;
    public int quantityCounterState;

    public ItemShopModel(String id, String name, String price, String quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.quantityCounterState = 1;
    }
}
