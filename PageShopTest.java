package DemoblazeShop;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PageShopTest {


    @Description("adding devices to 'cart' table , and purchase .")
    @Test( description = "devices buying flow")
    public void Orders() {


        System.setProperty("webdriver.chrome.driver", "C:\\automation\\Maven1\\Appium\\folderchrome\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        PageShop ProductOrders = new PageShop(driver);

        //first item
        ProductOrders.Order1ProductScenario();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());

        ProductOrders.Popup1();



        //second item

        ProductOrders.Order2ProductScenario();

        wait.until(ExpectedConditions.alertIsPresent());

        ProductOrders.Popup2();



        // order details validation
        ProductOrders.Order();


        //find the average price of the items
        ProductOrders.averagecalc();



    }

}
