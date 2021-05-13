package encapsulation;

//The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.

      //declare class variables/attributes as private
      //provide public get and set methods to access and update the value of a private variable

public class Main_string {
	private String name; //  private = restricted access
	
	// get name
	public String getname(){
		return name;
	}
	
	public void setname(String newname){
		name= newname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main_string obj= new Main_string();
		obj.name="vicky";
		System.out.println(obj.name);
		

	}

}
