package encapsulation;

public class myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myclass myObj = new myclass ();//object creation
		 myObj.setName("vicky"); // Set the value of the name variable to "John"
		 System.out.println(myObj.getName());

	}

	private Object name;

	private void setName(String Jhon) {
		// TODO Auto-generated method stub
		this.name = Jhon;
	}

	public Object getName() {
		return name;
	}

	public void setName(Object name) {
		this.name = name;
	}

}
