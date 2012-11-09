
public class Item {
	double price;
	String name;
	public Item(double price,String name){
		this.price=price;
		this.name=name;
	}
	public String toString(){
		return name +": "+price;
	}
}
