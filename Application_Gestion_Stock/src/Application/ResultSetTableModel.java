/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.sql.ResultSet;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ferdio
 */
public class ResultSetTableModel extends AbstractTableModel{

    private ResultSet res;
    
    public ResultSetTableModel(ResultSet res){
        this.res = res;
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        try {
            if(res == null){
                return 0;
            }else{
               // return res.next().findColumn(string)
            }
        } catch (Exception e) {
        }
    }

    @Override
    public Object getValueAt(int arg0, int arg1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
