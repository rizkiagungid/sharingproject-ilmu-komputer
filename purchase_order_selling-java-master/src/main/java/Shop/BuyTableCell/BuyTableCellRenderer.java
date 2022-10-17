/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.BuyTableCell;


import Shop.DataHandler.ItemShopModel;
import Shop.ShopScreen;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author ASUS
 */
public class BuyTableCellRenderer implements TableCellRenderer {
    
    ArrayList<ItemShopModel> itemsCell = new ArrayList<>();
    ShopScreen currentVisibleShopScreen;
    public BuyTableCellRenderer(ArrayList<ItemShopModel> itemsCell, ShopScreen currentVisibleShopScreen){
        this.currentVisibleShopScreen = currentVisibleShopScreen;
        this.itemsCell = itemsCell;
    }
    
    @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            //To change body of generated methods, choose Tools | Templates.
            BuyTableCellComponent tableCellComponent = new BuyTableCellComponent();
            tableCellComponent.updateData(itemsCell.get(row), isSelected, table, currentVisibleShopScreen);
            return tableCellComponent;
        }

}
