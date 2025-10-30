package firstsel;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tutorial1 {

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
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Register']"))).click();

        // ✅ Generate dynamic email using Email class
        String email = Email.generateTimestampEmail();
        System.out.println("Generated Email: " + email);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='input-firstname']"))).sendKeys("admin");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='input-lastname']"))).sendKeys("Khan");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='input-email']"))).sendKeys(email);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='input-telephone']"))).sendKeys("144-2746895");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='input-password']"))).sendKeys("123456");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='input-confirm']"))).sendKeys("123456");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='newsletter'][@value='0']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='agree'][@value='1']"))).click();

        waitForSeconds(2);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Continue']"))).click();

        boolean isDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//h1[normalize-space()='Your Account Has Been Created!']"))).isDisplayed();

        if (isDisplayed) {
            System.out.println("Account created successfully with email: " + email);
        } else {
            System.out.println(" Account creation failed");
        }

        driver.quit();
    }
}
