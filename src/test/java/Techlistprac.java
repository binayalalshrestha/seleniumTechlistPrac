import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Techlistprac {
    static WebDriver driver;

    @Test
    public static void main(String[] args) {
        homepage();
        firstName("Binay");
        lastName("Shrestha");
        gender();
        experience();
        dateOfBirth("12/13/1998");
        profession();
        automationTools();
        continent();
        seleniumCommands();
    }

    @Test
    public static void homepage(){
        driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
    }


    public static void firstName(String fName){
        driver.findElement(By.name("firstname")).sendKeys(fName);
    }


    public static void lastName(String lName){
        driver.findElement(By.name("lastname")).sendKeys(lName);
    }


    public static void gender(){
        driver.findElement(By.id("sex-0")).click();
    }


    public static void experience(){
        driver.findElement(By.id("exp-0")).click();
    }


    public static void dateOfBirth(String DOB){
        driver.findElement(By.id("datepicker")).sendKeys(DOB);
    }

    @Test
    public static void profession(){
        driver.findElement(By.id("profession-0")).click();
        driver.findElement(By.id("profession-1")).click();
    }


    public static void automationTools(){
        driver.findElement(By.id("tool-2")).click();
    }


    public static void continent(){
        driver.findElement(By.id("continents")).click();
        driver.findElement(By.xpath("//option[.=\"Australia\"]")).click();
    }

    @Test
    public static void seleniumCommands(){
        driver.findElement(By.xpath("//option[.=\"Navigation Commands\"]")).click();
        driver.findElement(By.xpath("//option[.=\"Wait Commands\"]")).click();
    }

    @Test
    public static void submitButton(){
        driver.findElement(By.id("submit")).click();
    }



//    public static void quit(){
//        driver.quit();
//    }
}
