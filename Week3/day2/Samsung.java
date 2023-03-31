package Week3.day2;

public class Samsung extends AndroidTV{
	
	public void playvideo() {
		System.out.println("Can you Play the Vidoe please");
	}
 public void close () {
	 System.out.println("Close");
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Samsung TV =  new Samsung();

TV.playvideo();
TV.close();
TV.openapp();
	}

}
