import automate.Assignment;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class Techlistprac2 {

    WebDriver driver;

    @BeforeTest
    public void beforetest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
    }

    @Test
    public void firstName() throws InterruptedException {
        Assignment firstName = new Assignment(driver);
        firstName.firstName("Binay");

    }

    @Test
    public void lastName(){
        Assignment lastName = new Assignment(driver);
        lastName.lastName("Shrestha");
    }

    @Test
    public void gender(){
        Assignment gender = new Assignment(driver);
        gender.gender();
    }

    @Test
    public void dateOfBirth(){
        Assignment dateOfBirth = new Assignment(driver);
        dateOfBirth.dateOfBirth("12/13/1998");
    }

//    @AfterTest
//    public void aftertest(){
//        driver.quit();
//    }
}
