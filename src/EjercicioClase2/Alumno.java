package EjercicioClase2;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String nombre;
    private List<Materia> materias = new ArrayList<>();
    private int legajo;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
}
