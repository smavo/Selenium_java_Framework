package org.locators;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_LinkText {

    public static void main(String[] args) {
        // Configurar el WebDriver de Chrome usando WebDriverManager
        WebDriverManager.chromedriver().driverVersion("117.0.5938.149").setup();

        // Crear una instancia de WebDriver para Chrome
        WebDriver driver = new ChromeDriver();

        // Realizar tus tareas de automatización de Selenium utilizando la instancia 'driver'
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/actions.html");

        driver.findElement(By.linkText("ACTIONS")).click();

        // Recuerda cerrar la instancia de WebDriver cuando hayas terminado
        driver.quit();

    }

}
