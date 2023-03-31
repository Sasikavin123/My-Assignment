package Week3.day1;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str = "Amazon";
   str = str.toLowerCase();
   char [] ch = str.toCharArray();
   for(int i = ch.length-1;i>=0;i--)
   {
	   System.out.println(ch [i]);
   }
   
	}

} 	