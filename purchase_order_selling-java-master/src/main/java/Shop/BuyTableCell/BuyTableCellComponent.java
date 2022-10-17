/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.BuyTableCell;

import Shop.ShopScreen;
import Shop.DataHandler.ItemShopModel;
import Shop.DataHandler.UserDataManager;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author ASUS
 */
public class BuyTableCellComponent extends JPanel {

    JButton buyButton;
    JLabel itemPriceLabel = new JLabel();
    JLabel itemName = new JLabel();
    JLabel itemQuantity = new JLabel();
    JPanel pricePanel = new JPanel();
    JPanel itemDescPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
    ShopScreen currentVisibleShopScreen;
    JPanel totalPriceAndQuantityPanel = new JPanel(new FlowLayout(FlowLayout.TRAILING));
    JSpinner quantityCounter = new JSpinner();
    String id;
    Color tableColor;
    int price;
    int quantity;
    int availableQuantity;

//        UserData userData = new UserData();
    private void buyButtonHandler() {

        if (UserDataManager.isLogin == false) {
            JOptionPane.showMessageDialog(this, "You need to login first");

        } else if (UserDataManager.isItemInsideCurrentUserCartById(id)) {
            //If the item has been added to cart.
            // Pop up the items is already in cart
            JOptionPane.showMessageDialog(this, itemName.getText() + " is already in cart!");
            
        } else {
            int totalBuyQuantity = (Integer) quantityCounter.getValue();
            JOptionPane.showMessageDialog(this, String.valueOf(totalBuyQuantity) + " " + itemName.getText() + " is added to cart!");
            //Take the item name and price into currently logged in user cart
            //Add unique id key for this item into current logged in user cart
            //Take quantity total to cart
            //sent total Available Quantity Item To Cart
            UserDataManager.addItemToCurrentUserCart(id, itemName.getText(), price, totalBuyQuantity, quantity);
            currentVisibleShopScreen.buildCartTable();
//            currentVisibleShopScreen.buildBuyTable();
        }
    }

    private void buildItemDescription() {
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        pricePanel.add(itemPriceLabel);
        pricePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        pricePanel.setMinimumSize(new Dimension(200, 20));
        pricePanel.setMaximumSize(new Dimension(200, 20));
        itemName.setFont(new Font("Tahoma", Font.BOLD, 18));
        itemDescPanel.add(pricePanel);
        itemDescPanel.add(itemName);
        itemDescPanel.add(itemQuantity);

    }
    
    private void quantityCounterHandler(){
       
        int newQuantityCounterState = (Integer)quantityCounter.getValue();
        for(int i = 0; i < ShopScreen.storedItems.size(); i++){
            if(ShopScreen.storedItems.get(i).id.equals(id)){
                ShopScreen.storedItems.get(i).quantityCounterState = newQuantityCounterState;
            }
        }
    }
    

    public final void buildtotalPriceAndQuantityPanel() {
        buyButton = new JButton("Add to Cart");
        buyButton.addActionListener((ActionEvent arg0) -> {
            buyButtonHandler();
        });
        quantityCounter.addChangeListener( (e) -> {
            quantityCounterHandler();
        });

        totalPriceAndQuantityPanel.add(quantityCounter);
        totalPriceAndQuantityPanel.add(buyButton);
        totalPriceAndQuantityPanel.setBackground(tableColor);

    }

    public BuyTableCellComponent() {

        buildtotalPriceAndQuantityPanel();
        buildItemDescription();

        add(itemDescPanel, BorderLayout.WEST);
        add(totalPriceAndQuantityPanel, BorderLayout.EAST);

    }

    public void updateData(ItemShopModel itemData, boolean isSelected, JTable table, ShopScreen currentVisibleShopScreen) {
        this.id = itemData.id;
        itemPriceLabel.setText("$ " + itemData.price);
        itemName.setText(itemData.name);
        itemQuantity.setText("available stock: " + itemData.quantity);
        this.currentVisibleShopScreen = currentVisibleShopScreen;
        this.price = Integer.parseInt(itemData.price);
        tableColor = table.getBackground();
        this.quantity = Integer.valueOf(itemData.quantity);
        quantityCounter.setModel(new SpinnerNumberModel(itemData.quantityCounterState, 1, quantity, 1));
        this.availableQuantity = Integer.parseInt(itemData.quantity);
        if (isSelected) {

            setBackground(table.getSelectionBackground());
            itemDescPanel.setBackground(table.getSelectionBackground());

        } else {

            setBackground(table.getBackground());
            itemDescPanel.setBackground(table.getBackground());
        }

    }

}
