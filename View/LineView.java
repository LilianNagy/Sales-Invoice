package View;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class LineView extends JDialog {

	 private JTextField JTextFielditemName;
	    private JTextField JTextFielditemCount;
	    private JTextField itemPriceField;
	    private JLabel JLabelitemName;
	    private JLabel JLabelitemCount;
	    private JLabel JLabelitemPrice;
	    private JButton JButtonOk;
	    private JButton JButtonCancel;

	    public LineView(Frame frame) {
	        JTextFielditemName = new JTextField(25);
	        JLabelitemName = new JLabel("Item Name");
	        
	        JTextFielditemCount = new JTextField(25);
	        JLabelitemCount = new JLabel("Item Count");
	        
	        itemPriceField = new JTextField(25);
	        JLabelitemPrice = new JLabel("Item Price");
	        
	        JButtonOk = new JButton("OK");
	        JButtonCancel = new JButton("Cancel");
	        JButtonOk.setActionCommand("OkCreatNewLine");
	        JButtonCancel.setActionCommand("CancelNewLine");
	        JButtonOk.addActionListener(frame.getListenerBtns());
	        JButtonCancel.addActionListener(frame.getListenerBtns());
	        
	        setLayout(new GridLayout(9, 6));
	        
	        add(JLabelitemName);
	        add(JTextFielditemName);
	        add(JLabelitemCount);
	        add(JTextFielditemCount);
	        add(JLabelitemPrice);
	        add(itemPriceField);
	        add(JButtonOk);
	        add(JButtonCancel);
	        pack();
	   
	    }

	    public JTextField getJTextFielditemName() {
	        return JTextFielditemName;
	    }

	    public JTextField getJTextFielditemCount() {
	        return JTextFielditemCount;
	    }

	    public JTextField getItemPriceField() {
	        return itemPriceField;
	    }
	    
	       
	}
