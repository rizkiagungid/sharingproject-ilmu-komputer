/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.DataHandler;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class UserModel {
    String username, emailAddress;
    String password;
    ArrayList<CartModel> userCart = new ArrayList<>();
    ArrayList<PurchaseHistoryModel> userHistories = new ArrayList<>();
    
    public UserModel(String username, String emailAddress, String password){
        this.username = username;
        this.emailAddress = emailAddress;
        this.password = password;
    }
    
}
