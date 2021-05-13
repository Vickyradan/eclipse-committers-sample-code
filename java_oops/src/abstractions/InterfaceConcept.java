package abstractions;

public class InterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bio obj =new Bio();
		obj.Father();
		obj.Son();
		

	}
}

interface Details{
public void Father();
public void Son();
}


class Bio implements Details{
	
	public void Father(){
		String name ="sathish";
		int age =56;
		
		System.out.println("father name: "+ name);
		System.out.println("father age: "+ age);
	}
	
	public void Son(){
		String name ="vicky";
		int age =26;
		System.out.println("son name: "+ name);
		System.out.println("son age: "+ age);
	}

	
}