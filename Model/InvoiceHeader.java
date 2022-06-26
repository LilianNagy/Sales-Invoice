package Model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {
 
	private int number; // number of invoice
	private Date date; // date of invoice
	private String name; // name of customer 
	 private DateFormat d=new SimpleDateFormat("dd-MM-yyyy");
	private ArrayList<InvoiceLine> numberoflines;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<InvoiceLine> getNumberoflines() {
		return numberoflines;
	}
	public void setNumberoflines(ArrayList<InvoiceLine> numberoflines) {
		this.numberoflines = numberoflines;
	}
	public double getTotalLines() {
		double totalLines=0.0; 
		for(int i=0; i< getNumberoflines().size(); i++)
		{
			totalLines+= numberoflines.get(i).totalLine();
		}
		
		return totalLines;
		
		
		
	}
	public DateFormat getD() {
		return d;
	}
	public void setD(DateFormat d) {
		this.d = d;
	}
	
	public void fireTableDataChanged() {
		// TODO Auto-generated method stub
		
	}
	
	public String getTotalInvoice() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
