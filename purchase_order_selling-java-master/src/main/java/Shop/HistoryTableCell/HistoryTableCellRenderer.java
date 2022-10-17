/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.HistoryTableCell;

import Shop.DataHandler.PurchaseHistoryModel;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author ASUS
 */
public class HistoryTableCellRenderer implements TableCellRenderer {
    
    ArrayList<PurchaseHistoryModel> historyData = new ArrayList<>();
    public HistoryTableCellRenderer(ArrayList<PurchaseHistoryModel> historyData){
        this.historyData = historyData;

    }
    
    @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            //To change body of generated methods, choose Tools | Templates.
            HistoryTableCellComponent tableCellComponent = new HistoryTableCellComponent();
            tableCellComponent.updateData(historyData.get(historyData.size() - (row + 1)), isSelected, table);
            return tableCellComponent;
        }

}
