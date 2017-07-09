package ExcelSelenium;
/**
 * Created by janish on 7/7/2017.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestArrayDDT {
    // this will take data from dataprovider which we created
    @Test(dataProvider="testdata")
    public void TestFireFox(String uname,String password){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(uname);
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);
    }
    // this is DataProvider which actually feed data to our test cases here I have taken 2 D
    // array with 2 rows and 2 column it means. It will run our test case two times because we
    // have taken 2 rows. While first iteration this will pass username and password to test
    // case and in second iteration perform the same for second rows
    @DataProvider(name="testdata")
    public Object[][] TestDataFeed(){
        // Create object array with 2 rows and 2 column- first parameter is row and second is //column
        Object [][] facebookdata=new Object[2][2];
        facebookdata[0][0]="Selenium1@gmail.com";
        facebookdata[0][1]="Password1";
        facebookdata[1][0]="Selenium2@gmail.com";
        facebookdata[1][1]="Password2";
        // return arrayobject to testscript
        return facebookdata;
    }
}