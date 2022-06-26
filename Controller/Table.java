
package Controller;

import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.InvoiceHeader;
import Model.InvoiceLine;
import Model.LineTable;
import View.Frame;


public class Table implements ListSelectionListener{
   private Frame frame;

    public Table(Frame frame) {
        this.frame = frame;
    }
   

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int indexOfSelectedRow=frame.getjTable_Invoice().getSelectedRow();
        System.out.println("The Invoice you selected is : " + indexOfSelectedRow);

        if (indexOfSelectedRow != -1) {
            
        InvoiceHeader selectedRow =frame.getInvoicesArr().get(indexOfSelectedRow);
        ArrayList<InvoiceLine> lines=selectedRow.getNumberoflines();
        LineTable lineTable=new LineTable(lines);
        frame.setLinesArr(lines);
        frame.getjTable_Items().setModel(lineTable);
        frame.getjTextField_CustomerName().setText(selectedRow.getName());
        frame.getjLabel_InvoiceNumber().setText(selectedRow.getNumber()+"");
        frame.getjLabel_InvoiceTotal().setText(selectedRow.getTotalInvoice()+"");
        frame.getjTextField_InvoiceDate().setText(Frame.date.format(selectedRow.getDate()));
        
        }
       
    }

    
    
}
