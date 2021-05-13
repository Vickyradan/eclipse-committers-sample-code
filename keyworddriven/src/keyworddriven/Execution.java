package keyworddriven;
public class Execution {
	public static void main(String[] args){
		String path = "E:\\Book2.xlsx";
		ExcelUtility.SetExcel(path,0);
		for (int i=0;i<=7;i++)
		{ 	
		String keyword =  ExcelUtility.getdata(i, 3);
		if(keyword.equals("openbrowser"))
		{
			  ActionKeyword.openbrowser();
			  System.out.println("Browser opened");
		}
		else if(keyword.equals("navigate"))
		{
			 ActionKeyword.navigate();
			 System.out.println("Browser navigate to orangehrm page");
		}
		else if(keyword.equals("enterusername"))
		{
			 ActionKeyword.enterusername();
			 System.out.println("Username entered");
		}
		else if(keyword.equals("enterpassword"))
		{
		 ActionKeyword.enterpassword();
			 System.out.println("Password entered");
		}	
		else if(keyword.equals("clicklogin"))
		{
		 ActionKeyword.clicklogin();
			 System.out.println("Login clicked");
		}		 
		else if(keyword.equals("closebrowser"))
		{
		 ActionKeyword.closebrowser();
			 System.out.println("Browser closed");
        }

	  }
		
    }


}
