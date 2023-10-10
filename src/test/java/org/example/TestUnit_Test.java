package org.example;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUnit_Test {

    private static WebDriver driver;

    @BeforeAll
    public static void setUpClass(){

        // Configurar el WebDriver de Chrome usando WebDriverManager
        WebDriverManager.chromedriver().driverVersion("117.0.5938.149").setup();

        // Crear una instancia de WebDriver para Chrome
         driver = new ChromeDriver();
    }

    @AfterAll
    public static void tearDownClass(){
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void test(){
        driver.get("https://www.saucedemo.com/");

        WebElement user = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement btn_login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

        user.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        btn_login.click();
    }


}
