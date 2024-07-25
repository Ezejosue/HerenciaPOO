package Materia;

public class Materia {
    String codigo;
    String nombre;

    public Materia(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void incluir() {
        System.out.println("Incluir materia: " + nombre);
    }

    public void eliminar() {
        System.out.println("Eliminar materia: " + nombre);
    }

    public void modificar() {
        System.out.println("Modificar materia: " + nombre);
    }

    public void reporte1() {
        System.out.println("Reporte 1 de materia: " + nombre);
    }

    public void reporte2() {
        System.out.println("Reporte 2 de materia: " + nombre);
    }
}
