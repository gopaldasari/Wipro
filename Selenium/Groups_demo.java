package Day17;


import org.testng.annotations.Test;

public class Groups_demo {
	 
	 @Test(groups= {"SmokeTest"})  
	 public void WebLoginPersonalLoan()  
	 {  
	     System.out.println("Web Login Personal Loan");  
	 }  
	 @Test(groups= {"SmokeTest"})
	 public void hi() {
		 System.out.println("inside group");
	 }
	 @Test
	 public void test() {
		 System.out.println("outside group");
	 }
	 @Test  
	 public void MobileLoginPersonalLoan()  
	 {  
	     System.out.println("Mobile Login Personal Loan");  
	 }  
	 @Test  
	 public void APILoginPersonalLoan()  
	 {  
	     System.out.println("API Login Personal Loan");  
	 }  
	}

