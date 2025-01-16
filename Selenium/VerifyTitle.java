package day16;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
 
public class VerifyTitle {
    public static void main(String[] args) {
        try {
            // URL of the Selenium Grid Hub
            URL hubURL = new URL("http://localhost:4444/wd/hub");
 
            // Desired capabilities for the browser
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName("chrome");
 
            // Initialize RemoteWebDriver
            WebDriver driver = new RemoteWebDriver(hubURL, capabilities);
            System.out.println("RemoteWebDriver initialized.");
 
            // Navigate to demo.opencart.com
            driver.get("https://demo.opencart.com");
            System.out.println("Navigated to demo.opencart.com");
 
            // Verify the title
            String expectedTitle = "Your Store";
            String actualTitle = driver.getTitle();
            System.out.println("Page title: " + actualTitle);
 
            if (actualTitle.equals(expectedTitle)) {
                System.out.println("Title verification passed.");
            } else {
                System.out.println("Title verification failed.");
            }
 
            // Close the browser
            driver.quit();
            System.out.println("Browser closed.");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
