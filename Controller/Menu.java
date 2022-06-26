
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.InvoiceHeader;
import View.Frame;

public class Menu implements ActionListener{
    private Frame frame;
    

    public Menu(Frame frame) {
        this.frame = frame;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "Load File":
                LoadFile();
                break;
            case "Save File":
                SaveFile();
                break;
        }
    }
    private void LoadFile() {
        
       printInvoices();
    }
    private void SaveFile() {
      
       
    }
    private void printInvoices() {
        System.out.println("***************************");
        for (InvoiceHeader header : frame.getInvoicesArr()) {
            System.out.println(header);
        }
        System.out.println("***************************");
    }


	
}

