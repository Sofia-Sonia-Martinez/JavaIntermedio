import EjercicioClase2.Alumno;
import EjercicioClase2.Inscripcion;
import EjercicioClase2.Materia;
import Relaciones.Auto;
import Relaciones.Domicilio;
import Relaciones.Persona;
import Relaciones.Curso;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona(true);
        Auto auto = new Auto();
        Curso curso = new Curso();
        Domicilio domicilio = new Domicilio(true);

        System.out.println("¿Tiene domicilio?:" + domicilio.getTieneDomicilio());

        //Ejercicio clase 2
        Materia materia1 = new Materia();
        Materia materia2 = new Materia();
        List<Materia> materiasCorrelativas = new ArrayList<>();
        materiasCorrelativas.add(materia1);
        materiasCorrelativas.add(materia2);

        Materia materia = new Materia();
        materia.setCorrelativas(materiasCorrelativas);
        Alumno alumno = new Alumno();
        List<Materia> materiasAlumno = new ArrayList<>();
        materiasAlumno.add(materia);
        materiasAlumno.add(materia1);
        //Si saco la materia 2 por ejemplo me da false, si la agrego me da true.
        //materiasAlumno.add(materia2);
        alumno.setMaterias(materiasAlumno);
        Inscripcion inscripcion = new Inscripcion(materia,alumno);
        boolean bool = inscripcion.inscripcion();
        if(bool){
            System.out.println("true, se inscribio");
        }else{
            System.out.println("false, no se inscribio");
        }


    }


}