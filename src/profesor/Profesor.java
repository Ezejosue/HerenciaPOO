package profesor;

public class Profesor {
    private String nombre;
    private String apellido;
    private String dedicacion;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, String dedicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dedicacion = dedicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }

    public void incluir() {
        System.out.println("Incluir profesor: " + nombre + " " + apellido);
    }

    public void eliminar() {
        System.out.println("Eliminar profesor: " + nombre + " " + apellido);
    }

    public void modificar() {
        System.out.println("Modificar profesor: " + nombre + " " + apellido);
    }

    public void reporte1() {
        System.out.println("Reporte 1 de profesor: " + nombre + " " + apellido);
    }

    public void reporte2() {
        System.out.println("Reporte 2 de profesor: " + nombre + " " + apellido);
    }
}
