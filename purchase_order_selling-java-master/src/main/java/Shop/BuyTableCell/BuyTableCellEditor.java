/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.BuyTableCell;

import Shop.DataHandler.ItemShopModel;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import Shop.ShopScreen;

/**
 *
 * @author ASUS
 */
public class BuyTableCellEditor extends AbstractCellEditor implements TableCellEditor {

    ArrayList<ItemShopModel> itemsCell = new ArrayList<>();
    ShopScreen currentVisibleShopScreen;

    public BuyTableCellEditor(ArrayList<ItemShopModel> itemsCell, ShopScreen currentVisibleShopScreen
    ) {
        this.itemsCell = itemsCell;
        this.currentVisibleShopScreen = currentVisibleShopScreen;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        //To change body of generated methods, choose Tools | Templates.
        BuyTableCellComponent tableCellComponent = new BuyTableCellComponent();
        tableCellComponent.updateData(itemsCell.get(row), true, table, currentVisibleShopScreen);
        return tableCellComponent;
    }

    @Override
    public Object getCellEditorValue() {
        //To change body of generated methods, choose Tools | Templates.
        return null;
    }

}
