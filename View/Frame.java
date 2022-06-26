package View;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

import Controller.Buttons;
import Controller.Menu;
import Model.HeaderTable;
import Model.LineTable;




public class Frame extends javax.swing.JFrame {

	private javax.swing.JButton jButton_Cancle;
    private javax.swing.JButton jButton_Create;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_CustomerName;
    private javax.swing.JLabel jLabel_InDate;
    private javax.swing.JLabel jLabel_InNumber;
    private javax.swing.JLabel jLabel_InTotal;
    private javax.swing.JLabel jLabel_InvoiceNumber;
    private javax.swing.JLabel jLabel_InvoiceTotal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuIteamLoadFile;
    private javax.swing.JMenuItem jMenuItemSavveFile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable_Invoice;
    private javax.swing.JTable jTable_Items;
    private javax.swing.JTextField jTextField_CustomerName;
    private javax.swing.JTextField jTextField_InvoiceDate;
public Frame() {
   
}

public ActionListener getListenerBtns() {
	// TODO Auto-generated method stub
	return null;
}


private void initComponents() {

    jScrollPane2 = new javax.swing.JScrollPane();
    jTable2 = new javax.swing.JTable();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable_Invoice = new javax.swing.JTable();
    jScrollPane3 = new javax.swing.JScrollPane();
    jTable_Items = new javax.swing.JTable();
    jButton_Create = new javax.swing.JButton();
    jButton_Create.addActionListener(listenerBtns);
    jButton_Delete = new javax.swing.JButton();
    jButton_Delete.addActionListener(listenerBtns);
    jButton_Save = new javax.swing.JButton();
    jButton_Save.addActionListener(listenerBtns);
    jButton_Cancle = new javax.swing.JButton();
    jButton_Cancle.addActionListener(listenerBtns);
    jLabel_InNumber = new javax.swing.JLabel();
    jLabel_InDate = new javax.swing.JLabel();
    jLabel_CustomerName = new javax.swing.JLabel();
    jLabel_InTotal = new javax.swing.JLabel();
    jTextField_InvoiceDate = new javax.swing.JTextField();
    jTextField_CustomerName = new javax.swing.JTextField();
    jLabel_InvoiceNumber = new javax.swing.JLabel();
    jLabel_InvoiceTotal = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenuIteamLoadFile = new javax.swing.JMenuItem();
    jMenuItemSavveFile = new javax.swing.JMenuItem();

    jTable2.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    jScrollPane2.setViewportView(jTable2);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(800, 550));
    setSize(new java.awt.Dimension(800, 550));
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

 

private   Buttons listenerBtns= new Buttons(this);
private Menu listenerMenuItems=new Menu(this);
private ArrayList<Model.InvoiceHeader> invoicesArr;
private  Model.InvoiceHeader headerTable;
public static SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
//private SelectListenerForTable selectListenerForTable=new SelectListenerForTable(this);
private ArrayList<Model.InvoiceLine> linesArr;
private LineTable lineTable;

public LineTable getLineTable() {
    return lineTable;
}

public void setLineTable(LineTable lineTable) {
    this.lineTable = lineTable;
}

public ArrayList<Model.InvoiceLine> getLinesArr() {
    return linesArr;
}

public void setLinesArr(ArrayList<Model.InvoiceLine> linesArr) {
    this.linesArr = linesArr;
}

public void setInvoicesArr(ArrayList<Model.InvoiceHeader> invoicesArr) {
    this.invoicesArr = invoicesArr;
}

public ArrayList<Model.InvoiceHeader> getInvoicesArr() {
    return invoicesArr;
}

public Model.InvoiceHeader getInvoiceHeaderObject(int code){
    for(Model.InvoiceHeader InvoiceHeaderObject : invoicesArr){
        if(InvoiceHeaderObject.getNumber()==code){
            return InvoiceHeaderObject;
        }
    }
    return null;  
}


public Model.InvoiceHeader getHeaderTable() {
    return headerTable;
}

public void setHeaderTable(Model.InvoiceHeader headerTable) {
    this.headerTable = headerTable;
}

public JTable getjTable_Invoice() {
    return jTable_Invoice;
    
}

public JTable getjTable_Items() {
    return jTable_Items;
}

public JTextField getjTextField_CustomerName() {
    return jTextField_CustomerName;
}

public JTextField getjTextField_InvoiceDate() {
    return jTextField_InvoiceDate;
}

public JLabel getjLabel_InvoiceNumber() {
    return jLabel_InvoiceNumber;
}

public JLabel getjLabel_InvoiceTotal() {
    return jLabel_InvoiceTotal;
}

public Buttons getListenerBtns1() {
    return listenerBtns;
}


	  
	     

	
}
