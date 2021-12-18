package basicAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ContactManager {


        private AppiumDriver driver;

        @BeforeEach
        public void before() throws MalformedURLException {
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("appium:deviceName","Eli");
                capabilities.setCapability("appium:platformVersion","9");
                capabilities.setCapability("appium:appPackage","com.android.contacts");
                capabilities.setCapability("appium:appActivity",".activities.PeopleActivity");
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
        public void createContact(){

                String nameContact="AAAAAAARemove";
                // click add contact
                driver.findElement(By.id("com.android.contacts:id/hw_fab")).click();
                // set name
                driver.findElement(By.xpath("//android.widget.EditText[@text='Nombre']")).sendKeys(nameContact);
                //set phone
                driver.findElement(By.xpath("//android.widget.EditText[@text=\"Número de teléfono\"]")).sendKeys("2222222");
                // click save
                driver.findElement(By.id("android:id/icon2")).click();

                String actualResult= driver.findElement(By.id("com.android.contacts:id/name")).getText();
                String expectedResult=nameContact;

                Assertions.assertEquals(expectedResult,actualResult,"ERROR> El contacto no fue creado");

                //Actions actions = new Actions(driver);
        }

}