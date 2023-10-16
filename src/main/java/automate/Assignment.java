package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assignment{
    WebDriver driver;

    public Assignment(WebDriver driver){
        this.driver = driver;
    }
    By firstName = By.xpath("//input[@name=\"firstname\"]");
    By lastName = By.xpath("//input[@name=\"lastname\"]");
    By gender = By.xpath("//input[@id=\"sex-0\"]");
    By experience = By.xpath("//input[@id=\"exp-3\"]");
    By dateOfBirth = By.xpath("//input[@id=\"datepicker\"]");
    By profession = By.xpath("//input[@id=\"profession-1\"]");
    By automationTools = By.xpath("//input[@id=\"tool-2\"]");
    By continent = By.xpath("//option[.=\"Australia\"]");
    By seleniumCommands = By.xpath("//option[.=\"Navigation Commands\"]");
    By submitButton = By.xpath("//button[@name=\"submit\"]");

    public void firstName(String firstNameInput){
        driver.findElement(firstName).sendKeys(firstNameInput);
    }

    public void lastName(String lastNameInput){
        driver.findElement(lastName).sendKeys(lastNameInput);
    }

    public void gender(){
        driver.findElement(gender).click();
    }

    public void experience(){
        driver.findElement(experience).click();
    }

    public void dateOfBirth(String dateOfBirthInput){
        driver.findElement(dateOfBirth).sendKeys(dateOfBirthInput);
    }

    public void profession(String professionInput){
        driver.findElement(profession).sendKeys(professionInput);
    }

    public void automationTools(String automationToolsInput){
        driver.findElement(automationTools).sendKeys(automationToolsInput);
    }
}