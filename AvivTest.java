package Demoblaze;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AvivTest {

    WebDriver driver;



    @Test(priority = 1)
    public void test_01() {
        System.setProperty("webdriver.chrome.driver", "C:\\automation\\Maven1\\Appium\\folderchrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.demoblaze.com");

        //sign up
        driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"sign-username\"]")).sendKeys("SEK123578");
        driver.findElement(By.xpath("//*[@id=\"sign-password\"]")).sendKeys("123456");


        driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();


        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert popup = driver.switchTo().alert();
        //String alertText = popup.getText();
        //assertEquals("Sign up successful.", alertText);

        popup.accept();


        driver.close();



    }

    @Test(priority = 2)
    public void test_02() {

        System.setProperty("webdriver.chrome.driver", "C:\\automation\\Maven1\\Appium\\folderchrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.demoblaze.com");

        //login




        driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("SEK123578");
        driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("123456");

        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
    }

    //@Test(priority = 3)
   // public void test_03() {

        //about us

       // back home
        //driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));


        //driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a")).click();
       // driver.findElement(By.cssSelector("div.vjs-poster")).isDisplayed();

        //driver.findElement(By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button")).click();


       // }


        //driver.findElement(By.linkText("Phones")).click();
        //driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));
        //<a href="prod.html?idp_=1" class="hrefch">Samsung galaxy s6</a>


    }










