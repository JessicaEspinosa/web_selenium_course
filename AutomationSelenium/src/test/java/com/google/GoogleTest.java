package com.google;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GoogleTest {
  
  @BeforeTest
  public void beforeTest() {
  }

  @Test
   public void f() {
	  // es con doble slash  y para el driver darle autoricion desde proveedores  .
	  System.setProperty("webdriver.chrome.driver", ".//src/test//resources//drivers//chrome//chromedriver");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
    }

    
  @AfterTest
  public void afterTest() {
  }

}
