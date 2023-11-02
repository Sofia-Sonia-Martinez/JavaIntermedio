package Relaciones;

public class Domicilio {
    private String calle;
    private Boolean tieneDomicilio;
    public Domicilio(Boolean tieneDomicilio) {
        this.tieneDomicilio = tieneDomicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Boolean getTieneDomicilio() {
        return tieneDomicilio;
    }

    public void setTieneDomicilio(Boolean tieneDomicilio) {
        this.tieneDomicilio = tieneDomicilio;
    }
}
