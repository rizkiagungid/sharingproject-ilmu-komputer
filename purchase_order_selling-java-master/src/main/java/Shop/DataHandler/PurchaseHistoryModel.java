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
public class PurchaseHistoryModel {
    public String itemName;
    public String price;
    public String quantity;
    public String date;
    public String type;
   
    public PurchaseHistoryModel(String itemName, String price, String quantity, String date, String type){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.date = date;
        // Selling or Buying
        this.type = type;
    }
}
