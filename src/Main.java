import Relaciones.Auto;
import Relaciones.Domicilio;
import Relaciones.Persona;
import Relaciones.Curso;
public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona(true);
        Auto auto = new Auto();
        Curso curso = new Curso();
        Domicilio domicilio = new Domicilio(true);

        System.out.println("¿Tiene domicilio?:" + domicilio.getTieneDomicilio());

    }
}