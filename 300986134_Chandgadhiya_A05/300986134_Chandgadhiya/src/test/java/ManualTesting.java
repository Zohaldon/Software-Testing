import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ManualTesting {
    //Parth Chandgadhiya
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void verifyManualTestingMenuTitle(){
        driver.get("http://letzdotesting.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//li[@id='menu-item-119']")).click();
        String TestResult =  driver.findElement(By.xpath("//header[@class='entry-header']")).getText();
        Assert.assertEquals(TestResult, "Software Testing Tutorial for Beginners");
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
