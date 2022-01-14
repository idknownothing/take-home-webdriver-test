package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContextMenuPage extends PageGeneral {

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement contextMenuComponent() {
        return this.driver.findElement(By.id("hot-spot"));
    }


}
