package Relaciones;

public class Persona {

    Auto auto;
    Curso curso = new Curso();
    //En el constructor se genera la relacion de composicion
    public Persona(Boolean tieneDomicilio) {
        Domicilio domicilio = new Domicilio(true);
    }


    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void getAuto(){
        auto = new Auto();

    }
}
