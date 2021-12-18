package runner;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MyStepContact {
    private AppiumDriver driver;
    @Given("i am in the contact manager")
    public void iAmInTheContactManager() throws MalformedURLException {
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

    @When("agrego un contacto con los datos")
    public void agregoUnContactoConLosDatos(ContactManager contact) {
        driver.findElement(By.id("com.android.contacts:id/hw_fab")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@text='Nombre']")).sendKeys(contact.getNameContact());
        driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'fono')]")).sendKeys(contact.getPhone());
        driver.findElement(By.id("android:id/icon2")).click();
    }

    @DataTableType
    public ContactManager convert(Map<String,String> entry){
        return new ContactManager(entry.get("contact name"),entry.get("phone number"));
    }


    @Then("the contact {string} should be created")
    public void theContactShouldBeCreated(String expectedResult) {
        String actualResult= driver.findElement(By.id("com.android.contacts:id/name")).getText();
        Assertions.assertEquals(expectedResult,actualResult,"ERROR> El contacto no fue creado");
    }
}
