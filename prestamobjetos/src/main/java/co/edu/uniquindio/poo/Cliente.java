package co.edu.uniquindio.poo;

public record Cliente(TipoDocumento tipoDocumento, String documento, String nombre, String genero, String ciudadResidencia){
    public Cliente{
        assert documento != null && !documento.isBlank() : "El documento es requerido";
        assert nombre != null && !nombre.isBlank() : "El nombre es requerido";
        assert genero != null && !genero.isBlank() : "El genero es requerido";
        assert ciudadResidencia != null && !ciudadResidencia.isBlank() : "La ciudad de residencia es requerido";
        assert tipoDocumento != null : "El tipo de documento es requerido";
    }
}
