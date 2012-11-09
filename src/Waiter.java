import java.util.ArrayList;

public class Waiter {
	double tips;
	ArrayList<Bill> bills;
	String name;
	public Waiter(String t) {
		name = t;
		tips = 0;
		bills = new ArrayList<Bill>();
	}
}
