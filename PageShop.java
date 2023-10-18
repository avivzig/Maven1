package DemoblazeShop;

import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertEquals;

public class PageShop {

    WebDriver driver;


    public PageShop(WebDriver driver) {
        this.driver = driver;
    }
//first order*****
    @Step("#1 first item order")
    public void Order1ProductScenario() {
        //add to cart
        driver.findElement(By.linkText("Phones")).click();
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();


    }
//assert order pop up
       @Step("#1 first item 'pop up' assertion")
       public void Popup1()
    {
        Alert popup = driver.switchTo().alert();
        String alertText = popup.getText();
        assertEquals("Product added", alertText);

        popup.accept();

//back to home page
        driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();


    }

    //second order*******
    @Step("#2 second item order")
    public void Order2ProductScenario() {


        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a")).click();


        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();



    }
    //assert order pop up
    @Step("#2 second item 'pop up' assertion")
    public void Popup2() {
        Alert popup = driver.switchTo().alert();
        String alertText = popup.getText();
        assertEquals("Product added", alertText);

        popup.accept();


    }




    //cart page assertion
    @Step("order validation details")
    public void Order () {
        //go to cart
        driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
        //verify items1
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[2]")).isDisplayed();
        //verify items2
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[2]/td[2]")).isDisplayed();


        //click on "place order" tab
        driver.findElement(By.className("btn-success")).click();


        //insert details
        driver.findElement(By.id("name")).sendKeys("aviv");
        driver.findElement(By.id("country")).sendKeys("israel");
        driver.findElement(By.id("city")).sendKeys("petah-tikva");
        driver.findElement(By.id("card")).sendKeys("4444-5555-6666-7777");
        driver.findElement(By.id("month")).sendKeys("april");
        driver.findElement(By.id("year")).sendKeys("2026");

        // click verify order confirmation
        driver.findElement(By.cssSelector("button[type='button'][class='btn btn-primary'][onclick='purchaseOrder()']")).click();

        //vrify details before purchase


        WebElement element = driver.findElement(By.cssSelector("p.lead.text-muted"));
        String text = element.getText();
        Assert.assertTrue(text.contains("Amount: 1180 USD"));
        Assert.assertTrue(text.contains("Card Number: 4444-5555-6666-7777"));
        Assert.assertTrue(text.contains("Name: aviv"));
        driver.findElement(By.className("confirm")).click();


        driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[1]")).click();


    }
    @Step("calculate the order average price")
    public void averagecalc() {

        WebElement Calc1 = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[3]"));
        WebElement Calc2 = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[2]/td[3]"));

        double calc1Value = Double.parseDouble(Calc1.getText());
        double calc2Value = Double.parseDouble(Calc2.getText());


        double average = (calc1Value + calc2Value) / 2;

        System.out.println("The average is: " + average);

    }



}


