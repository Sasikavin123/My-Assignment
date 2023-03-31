package Week3.day1;

public class Wordcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str = "Testleaf";
    char expChar ='e';
    int count=0;
    char [] ch= str.toCharArray();
    for (int i= 0; i<ch.length; i++) {
    	if (ch[i]==expChar) {
    		count++;
    	}
    
    	if (count>1) {
    		System.out.println("The Letter" +expChar+" is occuring" +count+ "times" );
    	}
	}

}
}