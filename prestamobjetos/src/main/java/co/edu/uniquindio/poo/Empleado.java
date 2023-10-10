package co.edu.uniquindio.poo;

public record Empleado(String nombre, String codigo, String correo, String aniosExperiencia) {
    public Empleado{
        assert nombre != null && !nombre.isBlank() : "El nombre es requerido";
        assert codigo != null && !codigo.isBlank() : "El codigo es requerido";
        assert correo != null && !correo.isBlank() : "El correo es requerido";
        assert aniosExperiencia != null && !aniosExperiencia.isBlank() : "Los años de experiencia son requerido";
    }
}
