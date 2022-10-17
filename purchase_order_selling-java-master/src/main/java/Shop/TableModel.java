/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ASUS
 */
public class TableModel extends AbstractTableModel {
    final int sizeOfRow;
    final String columnName;
    final Class<?> columnClass;
    public TableModel(int sizeOfRow, String columnName, Class<?> columnClass){
        this.sizeOfRow = sizeOfRow;
        this.columnName = columnName;
        this.columnClass = columnClass;
    }
    
     @Override
        public Class<?> getColumnClass(int columnIndex) {
            return columnClass;
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return true; //To change body of generated methods, choose Tools | Templates.
        }

////        }
        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            //To change body of generated methods, choose Tools | Templates.
            return String.valueOf(columnIndex);
        }

        @Override
        public int getColumnCount() {
            //To change body of generated methods, choose Tools | Templates.
            return 1;
        }

        @Override
        public int getRowCount() {
            //To change body of generated methods, choose Tools | Templates.
            //size of row == ArrayList sizes
            return sizeOfRow;
        }

        @Override
        public String getColumnName(int column) {
            return columnName; //To change body of generated methods, choose Tools | Templates.
        }
}
