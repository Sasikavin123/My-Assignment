package Week3.day1;

public class Bajaj extends Auto {
	
	public void selfstart() {
		System.out.println("Self Start the Auto");
	}
	
	public static void main(String [] args) {
		Bajaj bajaj = new Bajaj();
		bajaj.applymeter();
		bajaj.selfstart();
		bajaj.applybrake();
	
	}
	

}
