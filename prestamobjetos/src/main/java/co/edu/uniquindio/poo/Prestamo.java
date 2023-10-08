package co.edu.uniquindio.poo;

import java.util.Collection;

public class Prestamo {
    private String codigo;
    private Integer diasSolicitados;
    private Integer diasTranscurridos;
    private Double valor;
    private final Collection<DetallePrestamo> listaDetallePrestamos;

    public Prestamo(String codigo, Integer diasSolicitados, Integer diasTranscurridos, Double valor,
            Collection<DetallePrestamo> listaDetallePrestamos) {
        this.codigo = codigo;
        this.diasSolicitados = diasSolicitados;
        this.diasTranscurridos = diasTranscurridos;
        this.valor = valor;
        this.listaDetallePrestamos = listaDetallePrestamos;

        assert codigo != null && !codigo.isBlank() : "El codigo es requerido";
        assert diasSolicitados != null && diasSolicitados > 0 : "Los dias solicitados son requeridos";
        assert diasTranscurridos != null && diasTranscurridos > 0 : "Los dias transcurridos son requeridos";
        assert valor != null && valor > 0 : "El valor es requerido";
        assert listaDetallePrestamos != null;
    }
    
}

