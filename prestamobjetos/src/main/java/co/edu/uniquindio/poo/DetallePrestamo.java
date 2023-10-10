package co.edu.uniquindio.poo;

public class DetallePrestamo {
    private Integer unidadesPrestadas;
    private Double subTotal;
    private Objeto objeto;

    public DetallePrestamo(Integer unidadesPrestadas, Double subTotal, Objeto objeto) {
        this.unidadesPrestadas = unidadesPrestadas;
        this.subTotal = subTotal;
        this.objeto = objeto;
    }

    public Integer getUnidadesPrestadas() {
        return unidadesPrestadas;
    }
    public void setUnidadesPrestadas(Integer unidadesPrestadas) {
        this.unidadesPrestadas = unidadesPrestadas;
    }
    public Double getSubTotal() {
        return subTotal;
    }
    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }
    public Objeto getObjeto() {
        return objeto;
    }
    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }    
}