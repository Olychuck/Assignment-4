import java.util.ArrayList;


public class Bill {
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
	
	
}
