package View;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


	public class HeaderView extends JDialog{
	     private JTextField JTextFieldCustomerName;
	    private JTextField JTextFieldInvoiceDate;
	  
	    private JLabel JLabelCustomerName;
	    private JLabel JLabelInvoiceDate;
	    private JButton JButtonOk;
	    private JButton JButtonCancel;
	    
	    public HeaderView(Frame frame) {
	        JTextFieldCustomerName = new JTextField(25);
	        JLabelCustomerName = new JLabel("Customer Name");
	        
	        JTextFieldInvoiceDate = new JTextField(25);
	        JLabelInvoiceDate = new JLabel("Invoice Date");
	        
	     
	        
	        JButtonOk = new JButton("OK");
	        JButtonCancel = new JButton("Cancel");
	        JButtonOk.setActionCommand("OkCreatNewInvoice");
	        JButtonCancel.setActionCommand("CancelNewInvoice");
	        JButtonOk.addActionListener(frame.getListenerBtns());
	        JButtonCancel.addActionListener(frame.getListenerBtns());
	        setLayout(new GridLayout(8, 6));
	        
	        
	        add(JLabelCustomerName);
	        add(JTextFieldCustomerName);
	        add(JLabelInvoiceDate);
	        add(JTextFieldInvoiceDate);
	  
	        
	        add(JButtonOk);
	        add(JButtonCancel);
	        
	        pack();
	  
	    
	}

	    public JTextField getJTextFieldCustomerName() {
	        return JTextFieldCustomerName;
	    }

	    public JTextField getJTextFieldInvoiceDate() {
	        return JTextFieldInvoiceDate;
	    }

	    
	}


