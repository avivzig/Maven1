package Demoblaze;

import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;

public class PageHome {

    WebDriver driver;



       By phones = By.linkText("Phones");
       By Laptops = By.linkText("Laptops");
       By monitors = By.linkText("Monitors");

       //phones
       By samsong =By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");


       By nokia = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a");
       By nexus = By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a");
       By galaxy7 = By.xpath("//*[@id=\"tbodyid\"]/div[4]/div/div/h4/a");
       By iphone = By.xpath("//*[@id=\"tbodyid\"]/div[5]/div/div/h4/a");
       By sony = By.xpath("//*[@id=\"tbodyid\"]/div[6]/div/div/h4/a");

       By htc = By.xpath("//*[@id=\"tbodyid\"]/div[7]/div/div/h4/a");

       //laptops

       By sony_i5 = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
       By sony_i7 = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a");
       By macbookair = By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a");
       By dell_i7 = By.xpath("//*[@id=\"tbodyid\"]/div[4]/div/div/h4/a");
       By dell_15 = By.xpath("//*[@id=\"tbodyid\"]/div[5]/div/div/h4/a");
       By mac_book_pro = By.xpath("//*[@id=\"tbodyid\"]/div[6]/div/div/h4/a");

       //monitors

       By Apple_Monitors = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
       By ASUS_Full_HD = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a");




    public PageHome(WebDriver driver) {

        this.driver = driver;
    }



    @Step ("#1 show  cell phones")
    public  void phone () {

        driver.findElement(phones).click();

        //phones
        driver.findElement(samsong).isDisplayed();
        driver.findElement(nokia).isDisplayed();
        driver.findElement(nexus).isDisplayed();
        driver.findElement(galaxy7).isDisplayed();
        driver.findElement(iphone).isDisplayed();
        driver.findElement(sony).isDisplayed();
        driver.findElement(htc).isDisplayed();

    }

    @Step ("#2 show laptops ")
    public void laptop() {
        //laptops

        driver.findElement(Laptops).click();

        driver.findElement(sony_i5).isDisplayed();
        driver.findElement(sony_i7).isDisplayed();
        driver.findElement(macbookair).isDisplayed();
        driver.findElement(dell_i7).isDisplayed();
        driver.findElement(dell_15).isDisplayed();
        driver.findElement(mac_book_pro).isDisplayed();
    }

    @Step ("#3 show monitors")
    public  void monitor(){

        driver.findElement(monitors).click();

        driver.findElement(Apple_Monitors).isDisplayed();
        driver.findElement(ASUS_Full_HD).isDisplayed();

    }

    @Step ("#4 assert banners ")
    public void asssert(){

        driver.findElement(By.id("signin2")).isDisplayed();
        driver.findElement(By.id("login2")).isDisplayed();
        driver.findElement(By.id("cartur")).isDisplayed();
        driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a")).isDisplayed();
        driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).isDisplayed();
        driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).isDisplayed();


    }


    @Step ("#1 checking the 'contact us' banner and pop up text")
    public void Contactus(){

        driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"exampleModalLabel\"]")).isDisplayed();

        driver.findElement(By.id("recipient-email")).sendKeys("eee@gmail.com");
        driver.findElement(By.id("recipient-name")).sendKeys("aviv");
        driver.findElement(By.id("message-text")).sendKeys("i would like to make an order");
        driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();



            Alert popup = driver.switchTo().alert();
            String alertText = popup.getText();
            assertEquals("Thanks for the message!!", alertText);

            popup.accept();


        }



//checking the 'next' 'previus' tabs at home page( i find a BUG at "Samsung galaxy s6" at 'previus')בדיקת קצה
    @Step ("# checking that the items are display with same order when pressing on 'next'and 'previous'  Tab ")
    public void Previous_Next_Tab(){
        driver.findElement(By.linkText("Samsung galaxy s6"));
        driver.findElement(By.linkText("Nokia lumia 1520"));
        driver.findElement(By.linkText("Nexus 6"));
        driver.findElement(By.linkText("Samsung galaxy s7"));
        driver.findElement(By.linkText("Iphone 6 32gb"));
        driver.findElement(By.linkText("Sony xperia z5"));
        driver.findElement(By.linkText("HTC One M9"));
        driver.findElement(By.linkText("Sony vaio i5"));
        driver.findElement(By.linkText("Sony vaio i7"));

        driver.findElement(By.xpath("//*[@id=\"next2\"]")).click();


        driver.findElement(By.linkText("Apple monitor 24"));
        driver.findElement(By.linkText("MacBook air"));
        driver.findElement(By.linkText("Dell i7 8gb"));
        driver.findElement(By.linkText("2017 Dell 15.6 Inch"));
        driver.findElement(By.linkText("ASUS Full HD"));
        driver.findElement(By.linkText("MacBook Pro"));



        //press on previus tab

        driver.findElement(By.xpath("//*[@id=\"prev2\"]")).click();
        // checking again that all items are apear at first page

        driver.findElement(By.linkText("Samsung galaxy s6"));
        driver.findElement(By.linkText("Nokia lumia 1520"));
        driver.findElement(By.linkText("Nexus 6"));
        driver.findElement(By.linkText("Samsung galaxy s7"));
        driver.findElement(By.linkText("Iphone 6 32gb"));
        driver.findElement(By.linkText("Sony xperia z5"));
        driver.findElement(By.linkText("HTC One M9"));
        driver.findElement(By.linkText("Sony vaio i5"));
        driver.findElement(By.linkText("Sony vaio i7"));




    }


}











