package Demoblaze;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class PageTest {

    @Description("checking the apearens of all devices at their section")
    @Test(priority = 2 , description = "devices validations")
    public void Devices() {


        System.setProperty("webdriver.chrome.driver", "C:\\automation\\Maven1\\Appium\\folderchrome\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageHome categories = new PageHome(driver);



        //items verify
        //categories.PhonesVerifyItems();
        //methods of categories

        //Uninterruptibles.sleepUninterruptibly(20,TimeUnit.SECONDS);
        categories.phone();


        categories.laptop();


        categories.monitor();

        //driver.close();

        //PageHome NextPrevius = new PageHome(driver);
       // NextPrevius.Previous_Next_Tab();


    }
    @Description("validate all else banners at page")
    @Test(priority = 1 , description = "banners validations")
            public void BannerAsert() {


        System.setProperty("webdriver.chrome.driver", "C:\\automation\\Maven1\\Appium\\folderchrome\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageHome banners = new PageHome(driver);
        banners.asssert();
        banners.Contactus();
        //banners.Tax_text();

        //checking the items at next and previous tabs (found a bug at galaxy 6 device)
        PageHome NextPrevius = new PageHome(driver);
        NextPrevius.Previous_Next_Tab();


        driver.quit();



    }




}





