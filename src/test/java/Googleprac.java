import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Googleprac {
    static WebDriver driver;

    public static void main(String[] args) throws Exception{
        homepage();
        addText();
        quit();

    }

    public static void homepage() throws InterruptedException {
        driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

    }

    public static void addText() throws InterruptedException {
        driver.findElement(By.id("APjFqb")).sendKeys("sport bikes");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
        Thread.sleep(10000);
    }
    public static void quit(){
        driver.quit();
    }
}
