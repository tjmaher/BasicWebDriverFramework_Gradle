# BasicWebDriverFramework_Gradle
Selenium / Java: Describes setup of an initial development environment using Gradle, JUnit4, ChromeDriver<br>
<br>
 Part of a blog post, walking a new automation developer through downloading an Integrated Development Environment (IDE), setting up the Java environment, configuring Gradle, installing ChromeDriver, and creating quick-and-dirty WebDriver JUnit Tests, making assertions in the tests using Hamcrest, and refactoring those tests when we come across duplicate code.<br><br>
 We can use either:
 <ul>
 <li>IntelliJ: http://www.tjmaher.com/2016/05/webdriver-development-environment-setup.html</li>
 <li>Eclipse: http://www.tjmaher.com/2016/06/webdriver-development-environment-setup.html</li>
 </ul>
 <br>
 Initial Unit Tests are located at:
 <ul>
 <li><a href="https://github.com/tjmaher//BasicWebDriverFramework_Gradle/blob/master/src/test/java/TestClass.java">TestClass.java</a></li>
 </ul>
 <br>
 The Unit tests go to Dave Haeffner's The-Internet Login Page, and uses Hamcrest to assert the title is correct. 
 <br>
 Later iterations will be added to the Test_The-Internet_2.0 project to handle:
 <ul>
 <li>Page Objects using Page Factories</li>
 <li>Selenium Grid connectivity with Docker</li>
 <li>RemoteWebDriver and DesiredCapabilities functionality</li>
 <li>Test Logging using Log4J</li>
 </ul>
 <br>
 This project is kept as is, in keeping with the correspoding blog entries. 

 
