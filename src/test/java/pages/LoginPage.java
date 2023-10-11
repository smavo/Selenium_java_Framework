package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    WebDriver driver;
    WebElement user;
    WebElement password;
    WebElement btn_login;

    public LoginPage(WebDriver driver) {
        this.user = driver.findElement(By.id("user-name"));
        this.password = driver.findElement(By.name("password"));
        this.btn_login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
    }


    public void makeLogin(String usr, String pwd) {
        user.sendKeys(usr);
        password.sendKeys(pwd);
        btn_login.click();
    }

}
