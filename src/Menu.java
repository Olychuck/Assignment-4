import java.util.ArrayList;

public class Menu {
	public ArrayList<Item> arr;
	public Menu(){
		arr = new ArrayList<Item>();
	}
	public void prefill(){
		arr.add(new Item(17.99,"Chicken Parmesan"));
		arr.add(new Item(15.99,"Fettucini Alfredo"));
		arr.add(new Item(10.99,"Ceasar Salad"));
		arr.add(new Item(12.99,"Hamburger"));
		arr.add(new Item(14.99,"Personal Pizza"));
		arr.add(new Item(17.99,"Cheesecake"));
	}
}
