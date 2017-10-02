/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.ewojt.ui.model;

import eu.ewjot.model.Contact;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author iwonaw
 */
public class ContactTableModel extends AbstractTableModel {

    public String[] colNames = {"Row", "First name", "Last name", "Phone Number", "City"};
    public Class[] colTypes = {Integer.class, String.class, String.class, String.class, String.class};
    List<Contact> data;

    public ContactTableModel() {
        data = new ArrayList<Contact>();
    }

    public ContactTableModel(List<Contact> data) {
        this.data = data;
    }

    public void addRow(Contact jlist) {
        data.add(jlist);
        fireTableDataChanged();
    }

    public void addRow(Contact jlist, int index) {
        if (index < getRowCount()) {
            data.add(index, jlist);
            fireTableDataChanged();
        }
    }

    public Contact getRowData( int row ) {
        return (Contact) (data.get(row));
    }
    
    public int getRowCount() {
        return data.size();
    }

    public int getColumnCount() {
        return colNames.length;
    }

    public String getColumnName(int col) {
        return colNames[col];
    }

    public Class getColumnClass(int col) {
        return colTypes[col];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Contact list = (Contact) (data.get(rowIndex));

        switch (columnIndex) {
            case 0:
                return (rowIndex + 1);
            case 1:
                return list.getFirstName();
            case 2:
                return list.getLastName();
            case 3:
                return list.getPhoneNumer();
            case 4:
                return list.getCity();
        }

        return new String();
    }

    public boolean isCellEditable(int rowIndex, int colIndex) {

        if (colIndex < 3) {
            return false;
        } else {
            return true;
        }
    }

    public void removeRow(int row) {
        if (row < getRowCount() && row != -1) {
            data.remove(row);
            fireTableDataChanged();
        }
    }

    public void setRow(Contact jlist, int index) {
        if (index < getRowCount()) {
            data.set(index, jlist);
            fireTableDataChanged();
        }
    }

    //-----------------------------------------------------------
    //
    //-----------------------------------------------------------
    public void setValueAt( Object object, int row, int column )
    {
        Contact list = (Contact) (data.get(row));
       // list.setPathname((String) object);
        data.set(row, list);
        fireTableCellUpdated( row, column );
    }
}
