import java.util.Scanner;

public class Order {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]){
		
		System.out.println("Select type of burger:\n1.Regular\n2.Healthy\n");
		int i = sc.nextInt();
		switch(i){
		case 1:
			Burger b = new Burger();
			b.callorder();
			break;
		case 2:
			Healthy h = new Healthy();
			h.callorder();
			break;
		default:
			System.out.println("Wrong!!");
		}//switch
		
		System.out.println("Thanl You!! :D");
		
	}//main
	
}//class
