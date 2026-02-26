package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Task1_Selenium_project1 {

    @Test
    public void test_app_cura_app() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Thread.sleep(5000);

        Assert.assertTrue(driver.getCurrentUrl().contains("https://katalon-demo-cura.herokuapp.com/"));

        WebElement MakeAppointment = driver.findElement(By.id("btn-make-appointment"));
        MakeAppointment.click();

        Thread.sleep(2000);

        WebElement Email_Id = driver.findElement(By.id("txt-username"));
        Email_Id.sendKeys("John Doe");

        WebElement Password = driver.findElement(By.id("txt-password"));
        Password.sendKeys("ThisIsNotAPassword");

        WebElement Login_Button = driver.findElement(By.id("btn-login"));
        Login_Button.click();

        Thread.sleep(2000);

//        https://katalon-demo-cura.herokuapp.com/

        driver.quit();

    }
}
