import java.util.Scanner;

public class Burger {
	
	static Scanner sc = new Scanner(System.in);
	
	private void order(){
		
		String[] r = {"Wheat","White Flour"} ;
		String[] p = {"bacon","beef","veggie"};
		System.out.println("Welcome to Bill's Burger! \n\nSelect typeof roll:\n1.Wheat\n2.White flour");
		int k= sc.nextInt();		
		
		System.out.println("Select patty:\n1.Bacon\n2.Beef\n3.Veggie");
		int t= sc.nextInt();
		
		Hamburger h = new Hamburger(r[k-1],p[t-1]);
		
		int n = h.getBase();
		System.out.println("Price till now is = "+n);
		int s = 0;
		while(s<4){
			System.out.println("\nSelect Additions for the burger:\n1.tomato\n2.lettuce\n3.cheese\n4.pickle\n5.carrot\n6.mayonaise\n7.chipotle\n8.Ketchup\n0.None");
			int a = sc.nextInt();
			
			if(a==0)break;
			
			System.out.println("Mention layers:");
			int z = sc.nextInt();
			
			switch(a){
				case 1:
					n+=h.getTp(z);
					break;
				case 2:
					n+=h.getLp(z);
					break;
				case 3:
					n+=h.getChp(z);
					break;
				case 4:
					n+=h.getPp(z);
					break;
				case 5:
					n+=h.getCp(z);
					break;
				case 6:
					n+=h.getMp(z);
					break;
				case 7:
					n+=h.getCip(z);
					break;
				case 8:
					n+=h.getKp(z);
					break;
				default:
					System.exit(0);
			}
			s++;
		}//while
		System.out.println("Total price is = "+n);
		
	}//order
	
	public void callorder(){
		order();
	}
	
}
//class