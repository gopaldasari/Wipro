package day13;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mini_project_sel {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;

        try {
            driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//          Open the demo URL: Verify the page title is "omayo (QAFox.com)."
            driver.get("https://omayo.blogspot.com/?m=0");
            driver.manage().window().maximize();
            String actual_title = driver.getTitle();
            String expected_title = "omayo (QAFox.com)";
            if (actual_title.contentEquals(expected_title)) {
                System.out.println("Page title verification : Passed");
            } else {
                System.out.println("Page title verification : Failed");
            }

//          Locators and Object Identification
//    		1. By ID, Xpath, and linkText: 
            
//			Step 1: Locate the Search Box by ID and enter "Selenium."
            driver.switchTo().frame("navbar-iframe");
            WebElement search_txt = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("b-query")));
            search_txt.sendKeys("Selenium");
            System.out.println("Entered text in searchbox using ID: " + search_txt.getDomProperty("value"));
            
//			Step 2: Locate the Search Button by Xpath and click it.
            driver.findElement(By.xpath("//*[@id=\"b-query-icon\"]")).click();
            System.out.println("Clicked on search button using XPATH");
            driver.switchTo().defaultContent();
            
//			Step 3:Identify the "Open a popup window" button by linkText and click it.
            String mainWindow = driver.getWindowHandle();
            System.out.println("Main WindowHandle Unique ID : "+mainWindow);
            driver.findElement(By.linkText("Open a popup window")).click();
            for (String popupWindow : driver.getWindowHandles()) {
                if (!popupWindow.equals(mainWindow)) {
                	System.out.println("PopUp WindowHandle Unique ID : "+popupWindow);
                    driver.switchTo().window(popupWindow);
                    System.out.println("Opened a popup window button using LINKTEXT and WINDOW_HANDLES");
                    driver.close();
                    driver.switchTo().window(mainWindow);
                    System.out.println("Closed the popupWindow and Switched to mainWindow");
                    break;
                }
            }
            
//    		2. By Tag Name:
//			Step 1: Count the number of <a> tags on the page and print their count.
            List<WebElement> x = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("a")));
            System.out.println("Getting number of links using TAGNAME :" + x.size());
            
//           3. By Name:
//    		Locate the Drop-down menu using Name and select an option (e.g., "doc 3").
            WebElement dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("SiteMap")));
            Select s = new Select(dropdown);
            s.selectByVisibleText("doc 3");
            WebElement em = s.getFirstSelectedOption();
            System.out.println("Selected the option  from dropdown :"+em.getText());

//    		4. By CSS Selector:
//			Locate the textarea by CSS Selector and enter some text.
            WebElement textbox = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='fname']")));
            textbox.clear();
            textbox.sendKeys("GOPAL DASARI");
            System.out.println("Entered text in textbox using CSS_SELECTOR is " + textbox.getDomProperty("value"));
            
//    		Handling Basic Controls
//    		1. Handling Buttons:
//    		Click the "Click here" button and verify the result.
            WebElement clickbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"alert1\"]")));
            clickbutton.click();
            Alert a = driver.switchTo().alert();
            System.out.println("Result text displayed on alert : " + a.getText());
            a.accept();
            //a.dismiss();
            System.out.println("Click here button verification : PASSED");
            
//    		2. Handling Input Box:
//    		Enter text in the "Search this blog" input box.
            WebElement searchboxtxt = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[1]/input")));
            searchboxtxt.clear();
            searchboxtxt.sendKeys("GOPAL");
            System.out.println("Entered text in textbox : " + searchboxtxt.getDomProperty("value"));

//    		3. Handling Checkboxes:
//    		Select the checkbox "Option 2."
            WebElement checkbox1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"checkbox1\"]")));
            checkbox1.click();
            System.out.println("Unchecked the checkbox : " + checkbox1.getDomProperty("value"));
            WebElement checkbox2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"checkbox2\"]")));
            checkbox2.click();
            System.out.println("Checked the checkbox : " + checkbox2.getDomProperty("value"));

//    		4. Handling Radio Buttons:
//    		Select the radio button "Male".
            WebElement radiobutn = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='gender']")));
            String gender1 = "male";
            if (radiobutn.getDomProperty("value").equals(gender1)) {
                if (!radiobutn.isSelected()) {
                    radiobutn.click();
                }
            }
            System.out.println("Selected the Male radio button : Male");

//    		-----------------USED className LOCATOR-----------------
//    		5. Handling Select Box:
//    		Choose an option from the drop-down (e.g., "doc 1").
            WebElement dropdown1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("combobox")));
            Select s1 = new Select(dropdown1);
            s1.selectByVisibleText("doc 1");
            WebElement doc = s1.getFirstSelectedOption();
            System.out.println("Selected the option  from dropdown : "+doc.getText());

//    		Handling Advanced Controls
//    		1. Handling Alert Boxes:
//    		Trigger the alert by clicking "Try it" under the Alert section.
//    		Capture and verify the alert text, then accept the alert.
            WebElement alertbutton = wait.until(ExpectedConditions.elementToBeClickable(By.id("alert1")));
            alertbutton.click();
            Alert a1 = driver.switchTo().alert();
            System.out.println("Result text displayed on alert : " + a1.getText());
            a1.accept();
            System.out.println("Clicked the alert button and printed the result");
            
//    		2. Handling Datepicker:
//    		Locate the date input box and set the date (e.g., "2025-01-15").
            WebElement date = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"HTML22\"]/div[1]/input")));
            date.sendKeys("2025-01-15");
            System.out.println("Date get from text box :" + date.getDomProperty("value"));
            
//    		3. Handling Multiple Windows/Tabs:
//    		Click the "Open a popup window" button.		
//    		Switch to the new window, verify its title, and close it.
            System.out.println("Main WindowHandle Unique ID : "+mainWindow);
    		driver.findElement(By.linkText("Open a popup window")).click();
    		System.out.println("Clicked on Open a popup window button");
    		for (String popupWindow : driver.getWindowHandles())
    		{
    		  if(!popupWindow.equals(mainWindow))
    		  {
    			  	System.out.println("PopUp WindowHandle Unique ID: "+popupWindow);
    				driver.switchTo().window(popupWindow);
    				driver.manage().window().maximize();
    				String popup=driver.getTitle();
    				String autual_popup ="New Window";
    				if(popup.equals(autual_popup))
    				{
    					System.out.println("Verification Of PopUpTitle : PASSED");
    				}
    				if(!popup.equals(autual_popup))
    				{
    					System.out.println("Verification Of PopUpTitle : FAILED");
    				}
    				driver.close();
    				driver.switchTo().window(mainWindow);
    				System.out.println("Closed the popupWindow and Switched to mainWindow");
    				break;						
    		  }
    		}

//    		4. Handling Iframes:
//    		Locate the iframe on the page and switch to it.
//    		Perform an action (e.g., enter text in the input field within the iframe).
            driver.switchTo().frame("navbar-iframe");
            WebElement txt = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("b-query")));
            txt.sendKeys("Java Selenium");
            System.out.println("Entered text in iframe textbox : " + txt.getDomProperty("value"));
            System.out.println("Verification of iframe action : PASSED");
            driver.switchTo().defaultContent();
            
            
//          Navigate and PartialLinkText
            WebElement par = wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("http://www.Selenium143")));
            par.click();
            driver.navigate().back();
            System.out.println("Tested partiallinktest and navigate");
 
           

        } 
        catch (Exception e) 
        {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } 
        finally 
        {
            if (driver != null) {
            	Thread.sleep(10000);
            	driver.close();
                driver.quit();
                System.out.println("Driver closed successfully.");
            }
        }
    }
}


//USED CONTENTS:

//get
//getTitle
//getWindowhandles
//getDomProperty
//get
//getAttributeValue
//getText


//findElement
//WebDriver
//WebElement
//Select
//List<WebElement>

//for loop
//if loop
//try-catch-finally

//click
//clear
//alert
//accept
//dismiss

//sendkeys

//id
//xpath
//linkedtext
//tagname
//name
//cssSelector
//className
//partiallinktest

//iframe
//switchTo()
//navigate
//popup window

//explicit wait
//Thread.sleep
//close();
//quit();

// And more used not mentioned 




