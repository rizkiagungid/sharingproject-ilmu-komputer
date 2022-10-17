/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.HistoryTableCell;

import Shop.DataHandler.PurchaseHistoryModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author ASUS
 */
public class HistoryTableCellComponent extends JPanel {

    JLabel itemPriceLabel = new JLabel();
    JLabel itemName = new JLabel();
    JLabel itemQuantity = new JLabel();
    JLabel date = new JLabel();
    JPanel pricePanel = new JPanel();
    JPanel itemDescriptionPanel = new JPanel(new FlowLayout());
    JPanel eastPanel = new JPanel();
    JLabel Type = new JLabel();
    JLabel totalPriceLabel = new JLabel();

    int price;


    public HistoryTableCellComponent() {

        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        pricePanel.add(itemPriceLabel);
        pricePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        itemName.setFont(new Font("Tahoma", Font.BOLD, 18));
        itemDescriptionPanel.add(pricePanel);
        itemDescriptionPanel.add(itemName);
        itemDescriptionPanel.add(itemQuantity);
        itemDescriptionPanel.add(date);
        JLabel typeWord = new JLabel("Type: ");
        Type.setFont(new Font("Tahoma", Font.BOLD, 14));
        totalPriceLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        eastPanel.add(totalPriceLabel);
        eastPanel.add(typeWord);
        eastPanel.add(Type);

        add(itemDescriptionPanel, BorderLayout.WEST);
        add(eastPanel, BorderLayout.EAST);

    }

    public void updateData(PurchaseHistoryModel itemData, boolean isSelected, JTable table) {
        itemName.setText(itemData.itemName);
        itemPriceLabel.setText("$ " + itemData.price);
        date.setText("Date: " + itemData.date);
        itemQuantity.setText("Quantity: " + itemData.quantity);
        Type.setText(itemData.type);
        totalPriceLabel.setText("$ " + String.valueOf( Integer.parseInt(itemData.price) * Integer.parseInt(itemData.quantity)));

        if (isSelected) {
            eastPanel.setBackground(table.getSelectionBackground());
            setBackground(table.getSelectionBackground());
            itemDescriptionPanel.setBackground(table.getSelectionBackground());
        } else {
            setBackground(table.getBackground());
            itemDescriptionPanel.setBackground(table.getBackground());
            eastPanel.setBackground(table.getBackground());

        }
    }

}
