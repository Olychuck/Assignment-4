import java.text.DecimalFormat;


public class Item {
	double price;
	String name;
	public Item(double price,String name){
		this.price=price;
		this.name=name;
	}
	public String toString(){
		DecimalFormat df = new DecimalFormat("#0.00");
		return name +": "+df.format(price);
	}
}
