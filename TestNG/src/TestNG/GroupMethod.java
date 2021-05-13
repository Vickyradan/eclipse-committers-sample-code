package TestNG;

import org.testng.annotations.Test;

public class GroupMethod {
	
	@Test(groups="Apple")
	public void IphoneX (){
		
		System.out.println("Iphone X");
	}
	
	@Test(groups="Apple")
	public void IphoneXpro (){
		System.out.println("IphoneXpro");
	}

	@Test(groups="Samsung")
	public void GalaxyF41 (){
		System.out.println("GalaxyF41");
	}
	
	@Test(groups="Samsung")
	public void GalaxyF62 (){
		System.out.println("GalaxyF62");
	}
	
	@Test(groups="Oppo")
	public void Reno3 (){
		System.out.println("Reno3");
	}
	
	@Test(groups="Oppo")
	public void Reno3Pro (){
		System.out.println("Reno3Pro");
	}
	
	@Test(groups="Vivo")
	public void V3 (){
		System.out.println("V3");
	}
	
	@Test(groups="Vivo")
	public void V3Pro (){
		System.out.println("V3Pro");
	}
	
	
}
