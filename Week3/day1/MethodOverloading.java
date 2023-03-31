package Week3.day1;

public class MethodOverloading {
   public void add(int a ,int b) {
	   System.out.println(a+b);
   }
   public void add (int a ,int b,int c) {
   System.out.println(a+b+c);
}
   public void mul (int a ,int b) {
	   System.out.println(a*b);
   }
   public void mul (int a,int b,int c)
   {
	   System.out.println(a*b*c);
   }
   public static void main(String[] args) {
	   MethodOverloading add= new MethodOverloading();
	   add.add(2,9);
	   add.add(4, 5,8);
	   MethodOverloading mul = new MethodOverloading();
	   mul.mul(2,3);
	   mul.mul(2, 4,8);
   }

}