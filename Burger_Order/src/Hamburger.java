
public class Hamburger {
	
	private String roll = new String("Wheat");
	private String patty = new String("White Flour");
	private int base=0;
	private int tp=25;
	private int pp=35;
	private int lp=15;
	private int cp=25;
	private int chp=15;
	private int mp=15;
	private int kp=10;
	private int cip=10;
	
	public Hamburger(){
		this.base=45;
	}
	
	public Hamburger(String roll, String patty) {
		this.roll = roll;
		this.patty = patty;
		if(roll.equals("Wheat")){
			base+=25;
		}
		else if(roll.equals("White Flour")){
			base+=20;
		}
		if(patty.equals("bacon")){
			base+=40;
		}
		else if(patty.equals("beef")){
			base+=35;
		}
		if(patty.equals("veggie")){
			base+=30;
		}
	}


	public int getBase() {
		return base;
	}

	public int getTp(int z) {
		tp*=z;
		return tp;
	}

	public int getPp(int z) {
		pp*=z;
		return pp;
	}

	public int getLp(int z) {
		lp*=z;
		return lp;
	}

	public int getCp(int z) {
		cp*=z;
		return cp;
	}

	public int getChp(int z) {
		chp*=z;
		return chp;
	}

	public int getMp(int z) {
		mp*=z;
		return mp;
	}

	public int getKp(int z) {
		kp*=z;
		return kp;
	}

	public int getCip(int z) {
		cip*=z;
		return cip;
	}

	public String getRoll() {
		return roll;
	}

	public String getPatty() {
		return patty;
	}
	
}
