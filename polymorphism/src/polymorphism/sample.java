package polymorphism;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Adder.add(2345,1211));  
		System.out.println(Adder.add(1521,5211,-1861));  
		System.out.println(Adder.add(-12.3,12.6));

	}

}
class Adder
{  
static int add(int a, int b)
     {
return a+b;
     }  
static int add(int a, int b, int c)
     {
return a+b+c;
}  
            	static double add(double a, double b)
 	     {
return a+b;
     }  
	}
