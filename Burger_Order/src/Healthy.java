import java.util.*;

public class Healthy extends Hamburger{
	
	static Scanner sc = new Scanner(System.in);
	
	public Healthy(){
		
		super();
		
		
	}
	
	private void order(){
		int n = super.getBase();
		System.out.println("Price till now is = "+n);
		int s = 0;
		while(s<6){
			System.out.println("\nSelect Additions for the burger:\n1.tomato\n2.lettuce\n3.cheese\n4.pickle\n5.carrot\n6.mayonaise\n7.chipotle\n8.Ketchup\n0.None");
			int a = sc.nextInt();
			
			if(a==0)break;
			
			System.out.println("Mention layers:");
			int z = sc.nextInt();
			
			switch(a){
				case 1:
					n+=super.getTp(z);
					break;
				case 2:
					n+=super.getLp(z);
					break;
				case 3:
					n+=super.getChp(z);
					break;
				case 4:
					n+=super.getPp(z);
					break;
				case 5:
					n+=super.getCp(z);
					break;
				case 6:
					n+=super.getMp(z);
					break;
				case 7:
					n+=super.getCip(z);
					break;
				case 8:
					n+=super.getKp(z);
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
