package page_For_test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class registration_page {

	public static void main(String[] args) {
		
		ChromeDriver driver;
		WebDriver browserObject;
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","c:\\program Files\\chromedriver.exe");
      
         browserObject = new ChromeDriver();
         
         browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
          
         //findElement
         
         browserObject.findElement(By.name("name")).sendKeys("Mohaimen");
         browserObject.findElement(By.id("eml")).sendKeys("fnumohaimen@gmail.com");
         browserObject.findElement(By.name("website")).sendKeys("www.google.com");
         browserObject.findElement(By.name("comment")).sendKeys("He playing games");
         
         WebElement radioButtonMale = browserObject.findElement(By.xpath("//input[@value='male']"));
         radioButtonMale.click();
         
         WebElement checkboxBoat = browserObject.findElement(By.xpath("//input[@value='boat']"));
         checkboxBoat.click();
         
         Select countrySelect = new Select(browserObject.findElement(By.name("country")));
         countrySelect.selectByVisibleText("France");
         
         Select skillSelect = new Select(browserObject.findElement(By.name("skill")));
         skillSelect.selectByVisibleText("Database");
        
         
         browserObject.findElement(By.name("submit")).click();
         
         browserObject.findElement(By.id("alert")).click();
 		// 5. Intialize Alert object using sitchTo and alert method
 	        Alert alert = browserObject.switchTo().alert();
 	        
 	       alert.accept();
	}

}
