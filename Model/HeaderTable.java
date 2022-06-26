package Model;

import java.util.ArrayList;

//Left side panel 
public class HeaderTable {

	private ArrayList<InvoiceHeader> arrs;

    public HeaderTable(ArrayList<InvoiceHeader> arr) {
        this.arrs = arr;
    }

   
    public int getRowCount() {
        return arrs.size();
    }

    
    public int getColumnCount() {
        return 4;
        
    }
}
