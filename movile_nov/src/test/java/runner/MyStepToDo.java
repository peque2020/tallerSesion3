package runner;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MyStepToDo {

    private AppiumDriver driver;

    @Given("la aplicacion toDo esta abierta")
    public void laAplicacionToDoEstaAbierta() throws MalformedURLException {
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

    @When("agrego un titulo {string}")
    public void agregoUnTitulo(String nameNote) {
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/fab")).click();
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")).sendKeys(nameNote);
    }

    @And("presiono boton {string}")
    public void presionoBoton(String arg0) {
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Guardar']")).click();
    }

    @Then("se ha creado la tarea {string}")
    public void seHaCreadoLaTarea(String expectedResult) {

        String actualResult= driver.findElement(By.id("com.vrproductiveapps.whendo:id/home_list_item_text")).getText();
        Assertions.assertEquals(expectedResult,actualResult,"ERROR> La nota no fue creada");

    }
}
