package org.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SampleTestNGTest {
	
  public String baseURL = "http://newtouts.demoaut.com/";
  public WebDriver driver;
  
  @BeforeTest
  public void setBaseURL() {
	  driver = new FirefoxDriver();
	  driver.get(baseURL);
  }
  
  @Test
  public void verifyHomepageTitle() {
	  String expectedTitle = "Welcome: Mercury Tours";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
  }

  @AfterTest
  public void endSession() {
	  driver.quit();
  }

}
