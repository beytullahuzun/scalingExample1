package session;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class jenkins {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\drivers\\geckodriver.exe";
    public WebDriver driver ;

    @Test
    public void verifyHomepageTitle() {

        System.out.println("launching firefox browser");
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new FirefoxDriver();
        /*driver.get(baseUrl);
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.close();*/

        //it will open the goggle page
        driver.get("http://google.in");
    //we expect the title “Google “ should be present
        String Expectedtitle = "Google";
    //it will fetch the actual title
        String Actualtitle = driver.getTitle();
        System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
    //it will compare actual title and expected title
        Assert.assertEquals(Actualtitle, Expectedtitle);
    //print out the result
        System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
    }
}