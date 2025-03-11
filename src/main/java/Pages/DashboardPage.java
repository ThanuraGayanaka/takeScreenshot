package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

   protected WebDriver driver;
   protected WebDriverWait wait;



   By product1= By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]");
   By product2= By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
   By product3= By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
   By product4= By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']");







    public DashboardPage(WebDriver driver){

       this.driver= driver;
       this.wait= new WebDriverWait(driver, Duration.ofSeconds(8));

   }


   public void selectProduct(){

        driver.findElement(product1).click();
       driver.findElement(product2).click();
       driver.findElement(product3).click();
       driver.findElement(product4).click();



   }


    public void RemoveProduct(){


        Actions actions= new Actions(driver);

    actions.doubleClick(driver.findElement(product1)).perform();
        //driver.findElement(product1).
        driver.findElement(product2).click();
        driver.findElement(product3).click();
        driver.findElement(product4).click();



    }



}
