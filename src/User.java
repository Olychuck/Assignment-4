
public class User {
	Waiter w;
	Bill b;
	public User(Waiter a){
		w=a;
		b=new Bill();
		a.bills.add(b);
	}
	
}
