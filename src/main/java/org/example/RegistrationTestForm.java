package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RegistrationTestForm {

    // Переменная для управления браузером
    protected static WebDriver driver;


    // Метод для установки WebDriver.
    public static void setDriver(WebDriver webDriver){
        driver = webDriver;
    }

    // Настройка и запуск браузера.
    @Before
    public void setUP(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        RegistrationTestForm.setDriver(driver);
    }
    // Настройка остановки
    @After
    public void tearDown(){
       driver.quit();
    }
}

