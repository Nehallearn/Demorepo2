package org.gwit.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends TestBase{


    @Test
    public void loginPageTitleTest(){

        String text = driver.getTitle();
        Assert.assertEquals(text,"OrangeHRM");

    }

    @Test
    public void logineTest(){

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        boolean flag = driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).isDisplayed();
        Assert.assertEquals(flag,true);
    }

    @Test()
    public void homePageMenuTest(){
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).isDisplayed();
        driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li/a/span[text()='My Info']")).click();
        boolean flag = driver.findElement(By.xpath("//img[@class='employee-image']")).isDisplayed();
        Assert.assertEquals(flag,true);
    }

    @Test(enabled = false)
    public void logoutTest(){

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).isDisplayed();
        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        boolean flag = driver.findElement(By.xpath("//div[@class='orangehrm-login-form']")).isDisplayed();
        Assert.assertEquals(flag,true);


    }
}
