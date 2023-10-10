package co.edu.uniquindio.poo;

public enum TipoDocumento {

    CEDULA(0), PASAPORTE(1), CEDULA_EXTRANJERA(2);

    private Integer tipo;

    private TipoDocumento(Integer tipo) {
        this.tipo = tipo;
    }
    
}
