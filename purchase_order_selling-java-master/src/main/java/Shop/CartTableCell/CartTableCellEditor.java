/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.CartTableCell;

import Shop.DataHandler.CartModel;
import Shop.ShopScreen;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author ASUS
 */
public class CartTableCellEditor extends AbstractCellEditor implements TableCellEditor {

    ShopScreen currentVisibleShopScreen;
    ArrayList<CartModel> itemsCell = new ArrayList<>();

    public CartTableCellEditor(ArrayList<CartModel> itemsCell, ShopScreen currentVisibleShopScreen) {
        this.itemsCell = itemsCell;
        this.currentVisibleShopScreen = currentVisibleShopScreen;

    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        //To change body of generated methods, choose Tools | Templates.
        CartTableCellComponent tableCellComponent = new CartTableCellComponent();
        tableCellComponent.updateData(itemsCell.get(row), isSelected, table, currentVisibleShopScreen);
        return tableCellComponent;
    }

    @Override
    public Object getCellEditorValue() {
        //To change body of generated methods, choose Tools | Templates.
        return null;
    }

}
