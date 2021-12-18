package basicAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasicAppiumToDo {


        private AppiumDriver driver;

        @BeforeEach
        public void before() throws MalformedURLException {
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("appium:deviceName","Eli");
                capabilities.setCapability("appium:platformVersion","9.0");
                capabilities.setCapability("appium:appPackage","com.vrproductiveapps.whendo");
                capabilities.setCapability("appium:appActivity",".ui.HomeActivity");
                capabilities.setCapability("platformName","Android");

                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
                // implicit wait
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        @AfterEach
        public void after() throws InterruptedException {
                Thread.sleep(4000);
                driver.quit();
        }

        @Test
        public void basicTest(){

                String nameNote= "Salir con amigas";
                // click add contact
                driver.findElement(By.id("com.vrproductiveapps.whendo:id/fab")).click();
                // set name
                driver.findElement(By.xpath("//android.widget.EditText[@text='Título']")).sendKeys(nameNote);

                driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Guardar']")).click();

        }

}