package day16;

import java.sql.*;
import java.time.Duration;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 
public class data_from_database 
{
    public static void main(String arg[])
    {
    	Logger log = Logger.getLogger("devpinoyLogger");
        Connection connection = null;
        String URL= "jdbc:mysql://localhost:3306/db";
        String userName="root";
        String password ="Gopal";
        String Username;
        String Password;

        try {
        	
        	WebDriver driver=new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			driver.get("file:///C:/Users/HP/OneDrive/Desktop/HTML%20Pages/LoginPage.html");
			log.debug("opening webiste");
//          below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL,userName,password);
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("select * from login_data");
            
            while (resultSet.next()) 
            {
                Username = resultSet.getString("Username");
                Password = resultSet.getString("Password");
                System.out.println("Employee code : " + Username+ " Employee title : " + Password);
                WebElement name = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("userid")));
				WebElement pass = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("pswrd")));
				name.sendKeys(Username);
				log.debug("Entered Username"+name.getText());
				pass.sendKeys(Password);
				log.debug("Password Username");
				WebElement login = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/form/input[3]")));
				login.click();
				log.debug("Clicked On Login");
				driver.switchTo().alert().accept();
				log.debug("Accepted the Alert");
				name.clear();
				pass.clear();
				log.debug("Cleared username and password");
                
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) 
        {
            System.out.println(exception);
        }
    } // function ends
} // class ends