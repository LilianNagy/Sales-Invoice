package Model;

import java.util.ArrayList;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

//Right Side panel 
public class LineTable implements TableModel {

	private ArrayList <InvoiceLine> linesArr; 

    public LineTable(ArrayList<InvoiceLine> linesArr) {
        this.linesArr = linesArr;
    }
    
    
    public int getRowCount() {
        if (linesArr==null) {
            return 0;     
        }
        return linesArr.size() ;
    }

    public int getColumnCount() {
         return 5;
    }


	@Override
	public String getColumnName(int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}


	public void fireTableDataChanged() {
		// TODO Auto-generated method stub
		
	}
	
}
