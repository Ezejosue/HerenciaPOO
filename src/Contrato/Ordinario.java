package Contrato;

import profesor.Profesor;

public class Ordinario extends Profesor {
    public int aniosDeServicio;

    public Ordinario() {
    }

    public Ordinario(String nombre, String apellido, String dedicacion, int aniosServicio) {
        super(nombre, apellido, dedicacion);
        this.aniosDeServicio = aniosServicio;
    }

    public int getAniosDeServicio() {
        return aniosDeServicio;
    }

    public void setAniosDeServicio(int aniosDeServicio) {
        if(aniosDeServicio > 0) {
            this.aniosDeServicio = aniosDeServicio;
        } else {
            System.out.println("Años de servicio no pueden ser negativos");
        }
    }

    @Override
    public void incluir() {
        System.out.println("Incluir profesor ordinario");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar profesor ordinario");
    }

    @Override
    public void modificar() {
        System.out.println("Modificar profesor ordinario");
    }

    @Override
    public void reporte1() {
        System.out.println("Reporte 1 de profesor ordinario");
    }

    @Override
    public void reporte2() {
        System.out.println("Reporte 2 de profesor ordinario");
    }


}
