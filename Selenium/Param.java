package Day17;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class Param {
    @Test
    @Parameters({"x"})
    public void display(@Optional("6")int a)
    {
    System.out.println(a);	
    }
    
    @DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
		return new Object[][] {{2, 3 , 5}, {5, 7, 9}};
	}
	
    @Test (dataProvider = "data-provider")
    public void myTest (int a, int b, int result) {
	     int sum = a + b;//actual result
	     Assert.assertEquals(result, sum);
    }
     
}