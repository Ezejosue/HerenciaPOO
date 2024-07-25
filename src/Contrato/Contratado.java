package Contrato;

import profesor.Profesor;

public class Contratado extends Profesor {
    String fechaIngreso;
    String fechaFinContrato;


    public Contratado() {
    }

    public Contratado(String nombre, String apellido, String dedicacion, String fechaIngreso, String fechaFinContrato) {
        super(nombre, apellido, dedicacion);
        this.fechaIngreso = fechaIngreso;
        this.fechaFinContrato = fechaFinContrato;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(String fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    @Override
    public void incluir() {
        System.out.println("Incluir profesor contratado");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar profesor contratado");
    }

    @Override
    public void modificar() {
        System.out.println("Modificar profesor contratado");
    }

    @Override
    public void reporte1() {
        System.out.println("Reporte 1 de profesor contratado");
    }

    @Override
    public void reporte2() {
        System.out.println("Reporte 2 de profesor contratado");
    }
}
