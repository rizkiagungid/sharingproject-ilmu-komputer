/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.HistoryTableCell;

import Shop.BuyTableCell.*;
import Shop.BuyTableCell.BuyTableCellComponent;
import Shop.DataHandler.ItemShopModel;
import Shop.DataHandler.PurchaseHistoryModel;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author ASUS
 */
public class HistoryTableCellEditor extends AbstractCellEditor implements TableCellEditor  {
    
    ArrayList<PurchaseHistoryModel> historyData = new ArrayList<>();
    public HistoryTableCellEditor(ArrayList<PurchaseHistoryModel> itemsCell){
        this.historyData = itemsCell;
    }
    
    @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            //To change body of generated methods, choose Tools | Templates.
            HistoryTableCellComponent tableCellComponent = new HistoryTableCellComponent();

            tableCellComponent.updateData(historyData.get(historyData.size() - (row + 1)), true, table);
            return tableCellComponent;
        }

        @Override
        public Object getCellEditorValue() {
            //To change body of generated methods, choose Tools | Templates.
            return null;
        }

    
}
