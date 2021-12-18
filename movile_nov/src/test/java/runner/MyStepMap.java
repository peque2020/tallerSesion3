package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class MyStepMap {
    @When("quiero llenar el formulario de registro con los datos")
    public void quieroLlenarElFormularioDeRegistroConLosDatos(Map<String,String> datosForm) {
        for (String nameControl: datosForm.keySet()
        ) {
            System.out.println("control: " + nameControl + " valor a llenar: " + datosForm.get(nameControl));
        }
    }

    @And("click en el boton registrar")
    public void clickEnElBotonRegistrar() {
        
    }

    @Then("mi cuenta deberia ser creada")
    public void miCuentaDeberiaSerCreada() {
    }
}
