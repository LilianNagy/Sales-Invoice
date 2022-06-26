package Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;

import javax.swing.JOptionPane;

import Model.InvoiceHeader;
import Model.InvoiceLine;
import Model.LineTable;
import View.Frame;
import View.HeaderView;
import View.LineView;


public class Buttons implements ActionListener{
    private Frame frame;
    private HeaderView dialogForHeader ;
    private LineView dialogForLine;

    public Buttons(Frame frame) {
        this.frame = frame;
    } 
    

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "Create New Invoice":
                CreateNewInvoice();
                break;
            case "Delete Invoice":
                DeleteInvoice();
                break;
            case "Save":
                Save();           
                break;
            case "Cancel":
                Cancel();
                break;
            case "OkCreatNewInvoice":
                OkCreatNewInvoice();
                break;
            case "CancelNewInvoice":
                CancelNewInvoice();
                break;
            case "OkCreatNewLine":
                OkCreatNewLine();
                break;
            case "CancelNewLine":
                CancelNewLine();
                  break;
           
        }
       
    }

    private void CreateNewInvoice() {
        dialogForHeader=new HeaderView(frame);
        dialogForHeader.setVisible(true);
    }

    private void DeleteInvoice() {       
        int indexOfSelectedRow=frame.getjTable_Invoice().getSelectedRow();
        if (indexOfSelectedRow != -1) {
            frame.getInvoicesArr().remove(indexOfSelectedRow);
            frame.getHeaderTable().fireTableDataChanged();
            frame.getjTable_Items().setModel(new LineTable(null)) ;
            frame.setLinesArr(null);
            frame.getjTextField_CustomerName().setText("");
            frame.getjLabel_InvoiceNumber().setText("");
            frame.getjLabel_InvoiceTotal().setText("");
            frame.getjTextField_InvoiceDate().setText("");
            printInvoices();
            
        }
    }

    private void Save() {
        dialogForLine=new LineView(frame);
        dialogForLine.setVisible(true);
    }

    private void Cancel() {
        int indexOfSelectedRow=frame.getjTable_Items().getSelectedRow();
        int indexOfSelectedRowHeader=frame.getjTable_Invoice().getSelectedRow();
        if (indexOfSelectedRow != -1) {
            frame.getLinesArr().remove(indexOfSelectedRow);
            //frame.getLineTable().fireTableDataChanged();
            LineTable lineTable = (LineTable) frame.getjTable_Items().getModel();
            lineTable.fireTableDataChanged();
            frame.getHeaderTable().fireTableDataChanged();
            InvoiceHeader h =frame.getInvoicesArr().get(indexOfSelectedRow);
            frame.getjLabel_InvoiceTotal().setText(h.getTotalInvoice()+"");  
        }
            frame.getjTable_Invoice().setRowSelectionInterval(indexOfSelectedRowHeader, indexOfSelectedRowHeader);
            printInvoices();
        
    }

    private void OkCreatNewInvoice() {
        dialogForHeader.setVisible(false);
        String S1 = dialogForHeader.getJTextFieldCustomerName().getText() ;
        String S2=dialogForHeader.getJTextFieldInvoiceDate().getText();
        Date date=new Date();
        try {
            date =Frame.date.parse(S2);
        } catch (ParseException e ) {
            JOptionPane.showMessageDialog(frame, "Cann't parse date", "Wrong Date Format", JOptionPane.ERROR_MESSAGE);
        }
        int num=0;
        for(InvoiceHeader header : frame.getInvoicesArr() ){
            if (header.getNumber()>num) {
                num=header.getNumber();
            }
        }
             num++;
        InvoiceHeader newheader=new InvoiceHeader();
        frame.getInvoicesArr().add(newheader);
        frame.getHeaderTable().fireTableDataChanged();
       dialogForHeader.dispose();
       dialogForHeader=null;
       printInvoices();
    }

    private void CancelNewInvoice() {
       dialogForHeader.setVisible(false);
       dialogForHeader.dispose();
       dialogForHeader=null;
       
    }

    private void OkCreatNewLine() {
        dialogForLine.setVisible(false);
        String s1=dialogForLine.getJTextFielditemName().getText();
        String s2=dialogForLine.getJTextFielditemCount().getText();
        String s3 =dialogForLine.getItemPriceField().getText();
        int count=1;
        double price=1.0;
        try {
            count = Integer.parseInt(s2);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please Enter valid Count ", "Invalid number format", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            price = Double.parseDouble(s3);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please Enter valid price", "Invalid number format", JOptionPane.ERROR_MESSAGE);
        }
        
        int indexOfSelectedRow=frame.getjTable_Invoice().getSelectedRow();
        if (indexOfSelectedRow != -1) {
            InvoiceHeader h =frame.getInvoicesArr().get(indexOfSelectedRow);
            InvoiceLine newline =new InvoiceLine(h, s1, price, count);
          
            frame.getLinesArr().add(newline);
            // frame.getLineTable().fireTableDataChanged();
            LineTable lineTable = (LineTable) frame.getjTable_Items().getModel();
            lineTable.fireTableDataChanged();
           
            frame.getHeaderTable().fireTableDataChanged();
            frame.getjLabel_InvoiceTotal().setText(h.getTotalInvoice()+"");        
        }
            frame.getjTable_Invoice().setRowSelectionInterval(indexOfSelectedRow, indexOfSelectedRow);

        dialogForLine.dispose();
        dialogForLine=null;
        printInvoices();
    }


    private void CancelNewLine() {
       InvoiceLine.setVisible(false);
        dialogForLine.dispose();
        dialogForLine=null;
       
}
    private void printInvoices() {
        System.out.println("***************************");
        for (InvoiceHeader header : frame.getInvoicesArr()) {
            System.out.println(header);
        }
        System.out.println("***************************");
    }
}
