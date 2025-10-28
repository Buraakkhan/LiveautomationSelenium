package firstsel;


import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class firsttest {
	
	public static void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            }
        }
	
	
	
	
	

	public static void main(String[] args) {
    ChromeDriver driver= new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    driver.get("https://simsdev.e-connectsolutions.com/#/login");
    driver.manage().window().maximize();
    
	/*
	 * WebElement username =
	 * driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/input[1]"));
	 * username.sendKeys("edebd4");
	 * 
	 * // Find password field and enter password WebElement password =
	 * driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/input[2]"));
	 * password.sendKeys("admin123");
	 * 
	 * // Find and click Login button WebElement loginButton =
	 * driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/button"));
	 * loginButton.click(); WebElement svg =
	 * driver.findElement(By.xpath("//div[7]//a[1]//*[name()='svg']")); svg.click();
	 * WebElement admin_module =
	 * driver.findElement(By.xpath("//div[@class='module-drawer-content']//div[1]"))
	 * ; admin_module.click(); WebElement config = driver.findElement(By.xpath(
	 * "//*[@id=\"app\"]/div/div[4]/div[2]/div[2]/div[1]/div/div/p"));
	 * config.click(); WebElement org_user = driver.findElement(By.xpath(
	 * "//*[@id=\"app\"]/div/div[4]/div[2]/div[2]/div[1]/div[2]/div[15]/div/div/p"))
	 * ; org_user.click();
	 * //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); String
	 * copiedText = driver.findElement(By.xpath(
	 * "//*[@id=\"app\"]/div/div[6]/div/div/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[7]"
	 * )).getText(); String extracted = copiedText.split("-")[1].split(",")[0];
	 * System.out.println(extracted); WebElement admin2 =
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"app\"]/div/div[2]/div[2]/div[6]/button/div/div[2]/div[1]"));
	 * admin2.click(); WebElement logout =
	 * driver.findElement(By.xpath("//button[normalize-space()='Logout']"));
	 * logout.click();
	 */
   WebElement username1 = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/input[1]")); 
   username1.sendKeys("EDEBENReq17503341");
   
   // Find password field and enter password
   WebElement password1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/input[2]"));
   password1.sendKeys("admin123");
   
   // Find and click Login button
   WebElement loginButton1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/button"));
   loginButton1.click();
   WebElement svg1 = driver.findElement(By.xpath("//div[7]//a[1]//*[name()='svg']"));
   svg1.click(); 
   WebElement IM_module = driver.findElement(By.xpath("//div[contains(@class,'module-drawer')]//div[2]//i[1]"));
   IM_module.click();
   WebElement Inventory = driver.findElement(By.xpath("//p[contains(@title,'Inventory Declaration')]"));
   Inventory.click();
  

   WebElement add_Opening = driver.findElement(By.xpath("//p[@title='Add Opening Balance']"));
   add_Opening.click();
   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
   wait.until(ExpectedConditions.elementToBeClickable(By.id("selectedProduct"))).click();
   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'react-select__option') and text()='Rice']"))).click();
   wait.until(ExpectedConditions.elementToBeClickable(By.id("packingQty1"))).sendKeys(".2356");
   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div[7]/div/div[1]/div[2]/div[2]/div[2]/div[2]/button"))).click();
   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok']"))).click();
   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Cancel']"))).click();
   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@title=\"Send Request\"]"))).click();
//   waitForSeconds(10);
//   try {
//	    WebElement openingDateField = driver.findElement(By.xpath("//input[@name='openingBalanceDate']"));
//	    System.out.println("Opening Balance Date displayed: " + openingDateField.isDisplayed());
//	} catch (NoSuchElementException e) {
//	    System.out.println("Opening Balance Date field not found in DOM");
//	}
   waitForSeconds(2);
   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Send Request')]"))).click();
   waitForSeconds(2);
   WebElement modifiedQtyField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='newPackingQty']")));

   modifiedQtyField.click();
   modifiedQtyField.sendKeys(Keys.CONTROL + "a");
   modifiedQtyField.sendKeys(Keys.DELETE);
   

   waitForSeconds(1);
   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='newPackingQty']"))).sendKeys("5");
//   WebElement add_Opening_Wheat = driver.findElement(By.xpath("//p[@title='Add Opening Balance']"));
//   add_Opening_Wheat.click();
//   WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
//   WebElement y = wait1.until(ExpectedConditions.elementToBeClickable(By.id("selectedProduct")));
//   y.click();
//   wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'react-select__option') and text()='Wheat']"))).click();
//   wait1.until(ExpectedConditions.elementToBeClickable(By.id("packingQty1"))).sendKeys(".2356");
//   wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div[7]/div/div[1]/div[2]/div[2]/div[2]/div[2]/button"))).click();
//   wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok']"))).click();
//   wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Cancel']"))).click();
//   waitForSeconds(2);
//   wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@title='Send Request']\r\n"
//   		+ ""))).click();
//   
   
    
	}

}
