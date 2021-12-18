package basicAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasicAppiumXpath {


        private AppiumDriver driver;

        @BeforeEach
        public void before() throws MalformedURLException {
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("appium:deviceName","Eli");
                capabilities.setCapability("appium:platformVersion","9");
                capabilities.setCapability("appium:appPackage","com.android.calculator2");
                capabilities.setCapability("appium:appActivity",".Calculator");
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

                // click button 2
                driver.findElement(By.xpath("//android.widget.Button[@text='2']")).click();

                // click button +
                driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='más']")).click();

                // click button 7
                driver.findElement(By.xpath("//android.widget.Button[@text='7']")).click();

                // click button =
                driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='igual a']")).click();

                // verification result
                String actualResult=driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.android.calculator2:id/formula']")).getText();
                String expectedResult="9";
                Assertions.assertEquals(expectedResult,actualResult,"ERROR! la suma fue incorrecta");
        }

}