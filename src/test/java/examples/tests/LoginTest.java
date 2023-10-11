package examples.tests;

import examples.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    private static WebDriver driver;
    static LoginPage loginPage;

    @BeforeAll
    public static void setUpClass(){

        // Configurar el WebDriver de Chrome usando WebDriverManager
        WebDriverManager.chromedriver().driverVersion("117.0.5938.149").setup();

        // Crear una instancia de WebDriver para Chrome
        driver = new ChromeDriver();

        // Realizar tus tareas de automatización de Selenium utilizando la instancia 'driver'
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @AfterAll
    public static void tearDownClass(){
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void loginTest() {
        loginPage.makeLogin("standard_user", "secret_sauce");
    }

}
