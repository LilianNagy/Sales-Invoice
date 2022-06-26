package Model;

public class InvoiceLine {

	private InvoiceHeader header; 
	private String name; // item name
	private double price;  //item price
	private int count;   //item count
	public InvoiceLine(InvoiceHeader h, String s1, double price2, int count2) {
		// TODO Auto-generated constructor stub
	}
	public InvoiceHeader getHeader() {
		return header;
	}
	public void setHeader(InvoiceHeader header) {
		this.header = header;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double totalLine() {
		
		return count*price;
	}
	public static void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
