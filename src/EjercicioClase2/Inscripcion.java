package EjercicioClase2;
import java.util.List;
public class Inscripcion {
    private Alumno alumno;

    private Materia materia;

    public Inscripcion(Materia materia, Alumno alumno) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public boolean inscripcion(){
        int boolMateriaCorrelativa = getBoolMateriaCorrelativa();
        if(materia.getCorrelativas().size() == boolMateriaCorrelativa){
            return true;
        }
        return false;
    }

    private int getBoolMateriaCorrelativa() {
        int boolMateriaCorrelativa = 0;
        for (Materia materia:
             materia.getCorrelativas()) {
            boolMateriaCorrelativa = getBoolMateriaCorrelativa(boolMateriaCorrelativa, materia);
        }
        return boolMateriaCorrelativa;
    }

    private int getBoolMateriaCorrelativa(int boolMateriaCorrelativa, Materia materia) {
        for (Materia materiaAlumno:
             alumno.getMaterias()) {
            if(materia == materiaAlumno){
                boolMateriaCorrelativa++;
            }
        }
        return boolMateriaCorrelativa;
    }

}
