package firstsel;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_test {

    public static void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='My Account']"))).click();
       
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='input-email']"))).sendKeys("testuser20251030210158@example.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='input-password']"))).sendKeys("123456");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Login']"))).click();
       
              boolean isDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//*[@id=\"column-right\"]/div/a[13]"))).isDisplayed();

        if (isDisplayed) {
            System.out.println("logined Successfully: " );
        } else {
            System.out.println(" login failed");
        }
        
        waitForSeconds(5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"column-right\"]/div/a[13]"))).click();

        System.out.println(" logout successgully");
        driver.quit();
    }
}
