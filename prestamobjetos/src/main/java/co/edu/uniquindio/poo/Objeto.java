package co.edu.uniquindio.poo;

public class Objeto {
    public String nombre;
    private String codigo;
    public Integer unidadesDisponibles;
    private String estado;
    public Double precioAlquiler;
    public Objeto(String nombre, String codigo, Integer unidadesDisponibles, String estado, Double precioAlquiler) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.unidadesDisponibles = unidadesDisponibles;
        this.estado = estado;
        this.precioAlquiler = precioAlquiler;

        assert nombre != null && !nombre.isBlank() : "El nombre es requerido";
        assert codigo != null && !codigo.isBlank() : "El codigo es requerido";
        assert estado != null && !estado.isBlank() : "El estado del objeto es requerido";
        assert unidadesDisponibles != null && unidadesDisponibles > 0 : "Las unidades disponibles son requeridas";
        assert precioAlquiler != null && precioAlquiler > 0 : "El precio del alquiler es requerido";
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Integer getUnidadesDisponibles() {
        return unidadesDisponibles;
    }
    public void setUnidadesDisponibles(Integer unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Double getPrecioAlquiler() {
        return precioAlquiler;
    }
    public void setPrecioAlquiler(Double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
}
