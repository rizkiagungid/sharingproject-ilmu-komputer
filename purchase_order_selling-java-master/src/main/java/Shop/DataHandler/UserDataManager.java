/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.DataHandler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ASUS
 */
final public class UserDataManager {

    static ArrayList<UserModel> users = new ArrayList<UserModel>();
    static UserModel currentUser = null;
    static public boolean isLogin = false;
//    ShopScreen currentVisibleShopScreen;

    static public void register(String username, String email, String password) {
//        System.out.println(password);
        users.add(new UserModel(username, email, password));
    }

    static public String getCurrentUserName() {
        return currentUser.username;
    }
    
    
   static public boolean isItemInsideCurrentUserCartById(String id){
    
       for (int i = 0; i < currentUser.userCart.size(); i++) {
         if (currentUser.userCart.get(i).id.equals(id)) {
             return true;
         }
       }
       
       return false;
       
   }


    static public int getCurrentUserCartSize() {
        if (currentUser != null) {
            return currentUser.userCart.size();
        } else {
            return 0;
        }

    }

    static public void addItemToCurrentUserCart(String id, String itemName, int itemPrice, int buyQuantity, int totalAvailableQuanitity) {
        currentUser.userCart.add(new CartModel(id, itemName, itemPrice, buyQuantity, totalAvailableQuanitity));

    }

    static public int getTotalPriceItemsInCurrentUserCart() {
        int total = 0;

        if (currentUser != null) {
            for (int i = 0; i < currentUser.userCart.size(); i++) {
                total += currentUser.userCart.get(i).price * currentUser.userCart.get(i).buyQuantity;
            }
            return total;
        } else {
            return total;
        }
    }

    static public int getCurrentUserHistorySize() {

        if (currentUser == null) {
            return 0;
        } else {
            return currentUser.userHistories.size();
        }

    }

    static public ArrayList<PurchaseHistoryModel> getCurrentUserHistoryData() {

        if (currentUser == null) {
            return new ArrayList<>();
        } else {
            ArrayList<PurchaseHistoryModel> data = currentUser.userHistories;
            Collections.reverse(data);
            return data;
        }
    }

    static public void addHistoryToCurrentUserHistoryData(String itemName, String price, String quantity, String date, String type) {
        
        currentUser.userHistories.add(new PurchaseHistoryModel(itemName, price, quantity, date, type));
    }

    static public void deleteItemFromCurrentUserCartById(String id) {
//        currentUser.userCart
        for (int i = 0; i < currentUser.userCart.size(); i++) {
            if (currentUser.userCart.get(i).id.equals(id)) {
                currentUser.userCart.remove(i);
            }
        }
    }

    static public void setBuyQuantityItemCurrentUserCartById(String id, int newQuantity) {

        for (int i = 0; i < currentUser.userCart.size(); i++) {
            if (currentUser.userCart.get(i).id.equals(id)) {
                currentUser.userCart.get(i).buyQuantity = newQuantity;
            }
        }
    }

    static public ArrayList<CartModel> getCurrentUserCartData() {
        return currentUser == null ? new ArrayList<>() : currentUser.userCart;
    }

    static public boolean check(String username, String password) {
        boolean isValid = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).username.equals(username) && users.get(i).password.equals(password)) {
                isValid = true;
                break;
            }
        }

        return isValid;
    }

    static public void setCurrentUser(String username, String password) {
        //used when the user login
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).username.equals(username) && users.get(i).password.equals(password)) {
                currentUser = users.get(i);
                break;
            }
        }
    }

    static public String getCurrentDateAndTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}
