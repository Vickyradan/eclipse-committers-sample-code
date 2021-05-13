package abstractions;

public class Abstraction {
	
	public static void main(String[] arg){

		Son obj =new Son();
		System.out.println("father name: "+obj.name);
		System.out.println("father age: "+ obj.Age);

	}
}

	abstract class Father{

		String name = "Sathish";
		int Age = 56;

		public abstract void Details();

	}


	class Son extends Father{

		@Override
		public void Details() {
			// TODO Auto-generated method stub

		}

	}


