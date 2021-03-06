import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class Driver {

	/**
	 * @param args
	 */
	public static void userMenu(User r,Menu m){
		Scanner scan = new Scanner(System.in);
		int choice=0;
		while(true){
			System.out.println("Enter 1 to see menu 2 to choose an item 3 to view/pay Bill");
			choice=scan.nextInt();
			switch(choice){
			case 1: printMenu(m);
					break;
					
			case 2: System.out.println("Enter number of item:");
					r.b.addItem(m.arr.get(scan.nextInt()-1));
					break;
			case 3:
					DecimalFormat df = new DecimalFormat("#0.00");
				    r.b.printBill();
				    System.out.println("1 to pay for bill 2 to wait");
				    choice=scan.nextInt();
				    if(choice==1){
				    	System.out.println("Cost is "+df.format(r.b.price)+". Please enter the amount you will pay");
				    	r.w.tips+=scan.nextDouble()-r.b.price;
				    	break;
				    }
				    else
				    	break;
		
			}
		}
	}
	public static void printMenu(Menu m){
		System.out.println("The Menu");
		int a=0;
		for(Item i:m.arr){
			System.out.println("Item "+(++a)+":"+i);
		}
	}
	public static void main(String[] args) {
		Menu m = new Menu();
		m.prefill();
		LinkedList<Waiter> qu = new LinkedList<Waiter>();
		qu.add(new Waiter("Steve"));
		qu.add(new Waiter("George"));
		String menu = "1 to create new user 2 to select user 3 to quit";
		Scanner scan = new Scanner(System.in);
		ArrayList<User> arr = new ArrayList<User>();
		int choice=0;
		int user =0;
		while(choice!=3){
			System.out.println(menu);
			choice=scan.nextInt();
			switch(choice){
			case 1 :
				System.out.println("User "+ (++user)+" has been created and is being served by"+qu.getFirst().name);
				arr.add(new User(qu.removeFirst()));
				qu.add(arr.get(arr.size()-1).w);
				break;
			case 2 :
				if(arr.isEmpty())
					System.out.println("No users!");
				else{
					System.out.println("Enter number of user(1-"+arr.size()+")");
					userMenu(arr.get(scan.nextInt()-1),m);
				}
				break;
			case 3 :
				
				System.out.println("The waiters made the following:");
				DecimalFormat df = new DecimalFormat("#0.00");
				System.out.println(qu.getFirst().name+" made "+df.format(qu.getFirst().tips));
				System.out.println(qu.getLast().name+" made "+df.format(qu.getLast().tips));
			}
		}
		
		

	}

}
