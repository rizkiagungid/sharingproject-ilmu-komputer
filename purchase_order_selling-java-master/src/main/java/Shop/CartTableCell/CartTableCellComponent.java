/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.CartTableCell;

import Shop.ShopScreen;
import Shop.DataHandler.CartModel;
import Shop.DataHandler.UserDataManager;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author ASUS
 */
public class CartTableCellComponent extends JPanel {

    JButton deleteButton;
    JLabel itemPriceLabel = new JLabel();
    JLabel itemName = new JLabel();
    JLabel availableQuantityLabel = new JLabel();
//        JLabel itemQuantity = new JLabel();
    JPanel priceLabelPanel = new JPanel();
    JPanel itemDescPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
    ShopScreen currentVisibleShopScreen;
    String id;
    JPanel quantityPanel = new JPanel(new FlowLayout(FlowLayout.TRAILING));
    JSpinner quantityCounter = new JSpinner();
    JLabel totalPriceLabel = new JLabel();
    JLabel totalAvailableQuantity = new JLabel();

    int totalPrice;
    int quantity;
    int availableQuantity;
    int Price;
//        UserData userData = new UserData();

    public void buttonHandler() {
        //delete item from current User Cart ArrayList
//        JOptionPane.showMessageDialog(this, itemName.getText() + " is deleted from cart!");
        UserDataManager.deleteItemFromCurrentUserCartById(id);
        currentVisibleShopScreen.buildCartTable();
    }
    
    private void buildItemDescPanel(){
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        priceLabelPanel.add(itemPriceLabel);
        priceLabelPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        itemName.setFont(new Font("Tahoma", Font.BOLD, 18));
        itemDescPanel.add(priceLabelPanel);
        itemDescPanel.add(itemName);
        itemDescPanel.add(totalAvailableQuantity);
    
    }
    
    private void quantityCounterHandler(){
        //change buyQuantity
        int newQuantity = (Integer)quantityCounter.getValue();
        //rebuilt cartTable
        UserDataManager.setBuyQuantityItemCurrentUserCartById(id, newQuantity);
        currentVisibleShopScreen.buildCartTable();
    }
    
    private void buildQuantityPanel(){
        totalPriceLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        deleteButton = new JButton("Delete");
        deleteButton.addActionListener((ActionEvent arg0) -> {
            buttonHandler();
        });
        quantityCounter.addChangeListener( (e) -> {
            quantityCounterHandler();
        });
        quantityPanel.add(totalPriceLabel);
        quantityPanel.add(quantityCounter);
        quantityPanel.add(deleteButton);
        
    }

    public CartTableCellComponent() {
        
        
        buildQuantityPanel();
        buildItemDescPanel();
//            itemDescPanel.add(itemQuantity);
        add(itemDescPanel, BorderLayout.WEST);
        add(quantityPanel, BorderLayout.EAST);

    }

    public void updateData(CartModel itemData, boolean isSelected, JTable table, ShopScreen currentVisibleShopScreen) {
        // add data to table cell
        this.currentVisibleShopScreen = currentVisibleShopScreen;
        itemName.setText(itemData.itemName);
        itemPriceLabel.setText("$ " + String.valueOf(itemData.price));
        this.id = itemData.id;
        quantityCounter.setModel(new SpinnerNumberModel(itemData.buyQuantity, 1, itemData.totalAvailableQuantityItem, 1));
        this.quantity = itemData.buyQuantity;
        this.availableQuantity = itemData.totalAvailableQuantityItem;
        this.totalPrice = itemData.price * quantity;
        totalAvailableQuantity.setText("available stock: " + String.valueOf(itemData.totalAvailableQuantityItem));
        totalPriceLabel.setText("$ " + String.valueOf(totalPrice));

        
        if (isSelected) {
            quantityPanel.setBackground(table.getSelectionBackground());
            setBackground(table.getSelectionBackground());
            itemDescPanel.setBackground(table.getSelectionBackground());
        } else {
            quantityPanel.setBackground(table.getBackground());
            setBackground(table.getBackground());
            itemDescPanel.setBackground(table.getBackground());
        }
    }

}
