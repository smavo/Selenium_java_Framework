package org.waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicit_wait {

    public static void main(String[] args) {
        // Configurar el WebDriver de Chrome usando WebDriverManager
        WebDriverManager.chromedriver().driverVersion("117.0.5938.149").setup();

        // Crear una instancia de WebDriver para Chrome
        WebDriver driver = new ChromeDriver();

        // Realizar tus tareas de automatización de Selenium utilizando la instancia 'driver'
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        WebElement user = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement btn_login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

        user.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        btn_login.click();

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));

        // Recuerda cerrar la instancia de WebDriver cuando hayas terminado
        driver.quit();

    }

}
