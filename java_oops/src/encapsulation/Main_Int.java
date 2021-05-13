package encapsulation;

public class Main_Int {
	private int number;
	
	public int getnumber(){
		return number;
	}
	
	public void setnumber(int newnumber){
		number=newnumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main_Int obj =new Main_Int();
		obj.number=12345;
		System.out.println(obj.number);

	}

}
