package runner;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.When;

import java.util.Map;

public class MyStepObject {

    @When("quiero llenar el formulario de registro con")
    public void quieroLlenarElFormularioDeRegistroCon(Registro registro) {
        System.out.println("registro name: "+registro.getName());
        System.out.println("registro direccion: "+registro.getDireccion());
        System.out.println("registro idioma: "+registro.getIdioma());
        System.out.println("registro phone: "+registro.getPhone());
        System.out.println("registro email: "+registro.getEmail());

    }

    @DataTableType
    public Registro convert(Map<String,String> entry){
        Registro registro = new Registro();
        registro.setDireccion(entry.get("direccion"))
                .setIdioma(entry.get("idioma"))
                .setPhone(entry.get("phone"))
                .setName(entry.get("name"))
                .setEmail(entry.get("email"));

        return registro;
    }
}
