package runner;

public class Registro {
    private String name;
    private String email;
    private String direccion;
    private String phone;
    private String idioma;

    public Registro(){}

    public String getName() {
        return name;
    }

    public Registro setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Registro setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Registro setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Registro setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getIdioma() {
        return idioma;
    }

    public Registro setIdioma(String idioma) {
        this.idioma = idioma;
        return this;
    }
}