import java.text.DecimalFormat;
import java.util.ArrayList;
public class Bill {
	final double HST = 1.12;
	ArrayList<Item> arr;
	double price;
	public Bill(){
		arr=new ArrayList<Item>();
		price =0;
	}
	
	public void addItem(Item a){
		arr.add(a);
		price+=a.price;
		}
	public void printBill(){
		DecimalFormat df = new DecimalFormat("#0.00");
		for(Item i : arr){
			System.out.println(i);
		}
		System.out.println("SubTotal: "+df.format(price));
		System.out.println("Total: " +df.format(price*HST));
	}
	
}
