package Testpages;

import Basepage.Basetest;
import Pages.DashboardPage;
import Pages.Loginpage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends Basetest {

//WebDriver driver;

    @BeforeMethod
    @Override
    public void chromesetup() {
        super.chromesetup();
    }



    @AfterMethod
    @Override
    public void teardwon() {
        super.teardwon();
    }


@Test
    public void validlogin() throws InterruptedException {

        Loginpage lg = new Loginpage(driver);
        lg.loginprocess("standard_user","secret_sauce");
        
        



    }

    @Test
    public void invalidUsername() throws InterruptedException {

        Loginpage lg = new Loginpage(driver);
        lg.loginprocess("standard_user1","secret_sauce");

        String actualResult= lg.getErrorMessage();
        String expectedResult="Epic sadface: Username and password do not match any user in this service";

        System.out.println(lg.getErrorMessage());


        Assert.assertEquals(actualResult,expectedResult,"test case passed: invalid login");



    }


    @Test
    public void invalidPassword() throws InterruptedException {

        Loginpage lg = new Loginpage(driver);
        lg.loginprocess("standard_user","secret_sauce1");

        String actualResult= lg.getErrorMessage();
        String expectedResult="Epic sadface: Username and password do not match any user in this service";

        System.out.println(lg.getErrorMessage());


        Assert.assertEquals(actualResult,expectedResult,"test case passed: invalid login");



    }


    @Test
    public void invalidPassword_Username() throws InterruptedException {

        Loginpage lg = new Loginpage(driver);
        lg.loginprocess("standard_user0","secret_sauce");


        String actualResult= lg.getErrorMessage();
        String expectedResult="Epic sadface: Username and password do not match any user in this service";

        System.out.println(lg.getErrorMessage());


        Assert.assertEquals(actualResult,expectedResult,"test case passed: invalid login");



    }



    @Test
    public void userName_empty() throws InterruptedException {

        Loginpage lg = new Loginpage(driver);
        lg.loginprocess("","secret_sauce");
        String actualResult= lg.getErrorRequiedMessage();
        String expctedResult="Epic sadface: Username is required";

        System.out.println(lg.getErrorRequiedMessage());


        Assert.assertEquals(actualResult,expctedResult,"test case passed :usernamefield is requied ");


    }


    @Test
    public void Password_empty() throws InterruptedException {

        Loginpage lg = new Loginpage(driver);
        lg.loginprocess("standard_user","");
        String actualResult= lg.getErrorRequiedMessage();
        String expctedResult="Epic sadface: Password is required";

        System.out.println(lg.getErrorRequiedMessage());


        Assert.assertEquals(actualResult,expctedResult,"test case passed :usernamefield is requied ");


    }







}
