package Tasks;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2_TTA_Bank_SeleniumProject2 {
    @Owner("chaitany")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Sign Up is working")
    @Test
    public void test_TTA_Bank_SignUp_Page() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");
        Thread.sleep(2000);

      WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Sign Up']"));
      button.click();

      WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
              name.sendKeys("Chaitany Chavan");

              WebElement email = driver.findElement(By.xpath("//input[@placeholder='you@example.com']"));
              email.sendKeys("Chaitany@gmail.com");

              WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
              password.sendKeys("galigalisimsim");

              WebElement Create= driver.findElement(By.xpath("//button[@type='submit']"));
              Create.click();

              Thread.sleep(2000);

              WebElement Transfer= driver.findElement(By.xpath("//button[contains(text(),'Transfer Funds')]"));
              Transfer.click();

              WebElement Amount=driver.findElement(By.xpath("//input[@type='number']"));
              Amount.sendKeys("5000");

              WebElement note=driver.findElement(By.xpath("//input[@type='text']"));
              note.sendKeys("for party");

              WebElement Butt=driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
              Butt.click();

              WebElement confirm= driver.findElement(By.xpath("//button[contains(text(),'Confirm Transfer')]"));
              confirm.click();

              WebElement dashboard= driver.findElement(By.xpath("//button[contains(text(),'Dashboard')]"));
              dashboard.click();

              Thread.sleep(5000);

              driver.quit();

    }
}
