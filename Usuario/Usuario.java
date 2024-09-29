public class Usuario {
    private String nombreCompleto;
    private int edad;
    private String correo;
    private String celular;
    private String nombreUsuario;
    private String contrasena;

    // Constructor con todos los parámetros
    public Usuario(String nombreCompleto, int edad, String correo, String celular, String nombreUsuario, String contrasena) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.correo = correo;
        this.celular = celular;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    // Getters y Setters para acceder a las propiedades
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
