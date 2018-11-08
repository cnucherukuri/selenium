package com.deem.test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class EdurekaTest {

	public static WebDriver driver;
	public static void main(String[] args) {
		
	}
@BeforeClass
public static void setUp() throws IOException{
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	System.out.println("Before Class Method");
}

@Test
public void testLogin() throws InterruptedException{
	driver.findElement(By.name("login")).clear();
	driver.findElement(By.name("login")).sendKeys("edurekaUser");
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("password")).sendKeys("testpassword");
	driver.findElement(By.name("click")).click();	
}

@AfterClass
public static void tearDown() throws IOException{
	driver.close();
	driver.quit();
}
}
