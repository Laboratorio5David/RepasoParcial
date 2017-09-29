/**
 * Created by android on 28/09/17.
 */



public class Pojo {
    private String nombre;
    private String apellido;
    private int telefono;
    private String mail;

    public Pojo(String nombre, String apellido, Integer telefono, String mail){
        nombre = "";
        apellido= "";
        telefono= 0;
        mail="";

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
