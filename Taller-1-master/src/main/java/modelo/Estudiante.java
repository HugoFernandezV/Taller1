
package modelo;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    private String Nombre;
    private String Matricula;
    private String Carrera;
    private String Correo;

    public Estudiante(String Nombre, String Matricula, String Carrera, String Correo) {
        this.Nombre = Nombre;
        this.Matricula = Matricula;
        this.Carrera = Carrera;
        this.Correo = Correo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
}
