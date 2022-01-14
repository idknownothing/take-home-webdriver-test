package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenNewTabPage extends PageGeneral{

    public OpenNewTabPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement clickComponent() {
        return this.driver.findElement(By.cssSelector(".example a"));
    }
}