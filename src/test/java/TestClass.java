import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by tmaher on 5/30/2016.
 */
public class TestClass {

    private WebDriver driver;

    @Test
    public void testFirefoxDriver() {

        driver = new FirefoxDriver();
        driver.get("http://the-internet.herokuapp.com/login");
        assertThat(driver.getTitle(), is(equalTo("The Internet")));
    }

    @Test
    public void testChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/tmaher/code/java/selenium/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/login");
        assertThat(driver.getTitle(), is(equalTo("The Internet")));
    }

    @Test
    public void testIE11Driver() {

        driver = new InternetExplorerDriver();
        driver.get("http://the-internet.herokuapp.com/login");
        assertThat(driver.getTitle(), is(equalTo("The Internet")));
    }

    @After
    public void closeBrowsers() throws Exception {
        driver.quit();
    }
}
