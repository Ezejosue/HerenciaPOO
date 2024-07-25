import Contrato.Contratado;
import Contrato.Ordinario;
import profesor.Profesor;
import Materia.Materia;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Materia materia = new Materia("M01", "Matematicas");
        materia.incluir();
        materia.eliminar();
        materia.modificar();
        materia.reporte1();
        materia.reporte2();
        System.out.println("*--------------------------------------------------*");
        System.out.println("\n");

        Profesor profesor = new Profesor("Josue", "Avalos", "Tiempo completo");
        profesor.incluir();
        profesor.eliminar();
        profesor.modificar();
        profesor.reporte1();
        profesor.reporte2();
        System.out.println("*--------------------------------------------------*");
        System.out.println("\n");


        Ordinario ordinario = new Ordinario("Gabriela", "Alas", "Tiempo completo", 5);
        ordinario.incluir();
        ordinario.eliminar();
        ordinario.modificar();
        ordinario.reporte1();
        ordinario.reporte2();
        System.out.println("*--------------------------------------------------*");
        System.out.println("\n");

        Contratado contratado = new Contratado("Alison", "Becker", "Tiempo completo", "01/01/2021", "01/01/2022");
        contratado.incluir();
        contratado.eliminar();
        contratado.modificar();
        contratado.reporte1();
        contratado.reporte2();

    }
}