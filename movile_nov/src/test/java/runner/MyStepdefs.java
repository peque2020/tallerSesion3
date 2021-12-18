package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MyStepdefs {

    /**
     * expresiones cucumber
     * {int} ---> reemplaza a cualquier valor numerico
     * {string} ---> reemplaza a una cada string en comillas ---> "palabra"
     * {} ---> reemplaza a cualquier valor
     * {float} --> reemplaza a un valor numerico flotante ---> 6.25
     * {word} ---> remplaza a una palabra
     */

    @Given("tengo acceso a {}")
    public void tengoAccesoAFacebook(String application) {

    }

    @When("seteo mi email: {string}")
    public void seteoMiEmailJbJbCom(String email) {
    }

    @And("seteo mi password: pwd{int}")
    public void seteoMiPasswordPwd(int arg0) {

    }

    @And("hago click en el boton {word}")
    public void hagoClickEnElBotonLogin(String nombreBoton) {
    }

    @Then("yo deberia iniciar sesion")
    public void yoDeberiaIniciarSesion() {
    }


    @Then("yo no deberia iniciar sesion")
    public void yoNoDeberiaIniciarSesion() {
    }

    @And("los labels deberian ser mostrados")
    public void losLabelsDeberianSerMostrados(List<String> myLabels) {
        for ( String label:myLabels
        ) {
            System.out.println("labels: "+label);
        }
    }
}

