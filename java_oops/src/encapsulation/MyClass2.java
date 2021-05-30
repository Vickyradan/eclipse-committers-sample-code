package encapsulation;

public class MyClass2 {
	
	private String name;
	
	private void setName(String Jhon){
		this.name = Jhon;
	}
	
	public String getName(){
		
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass2 obj =new MyClass2();
		
		obj.setName("Jhon");
		System.out.println(obj.getName());
		
		

	}

}
