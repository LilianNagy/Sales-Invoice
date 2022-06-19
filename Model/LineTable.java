package Model;

import java.util.ArrayList;

//Right Side panel 
public class LineTable {

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
	
}
