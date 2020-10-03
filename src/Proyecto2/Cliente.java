package Proyecto2;

public class Cliente {
    int id = 0;
    String nombre;
    String apellido;
    String nit;
    String direccion;
    static int sigIdCliente = 1;

    private Cliente() {
        id = id + sigIdCliente;
    }

    public Cliente(String nombre, String apellido, String nit, String direccion) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.nit = nit;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNit() {
        return nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    //creacion del metodo toString
    public String toString() {
        return "[" + Utilerias.getNombreClase(Cliente.class) + "]" +
                "{id=" + id +
                ", nombre=" + nombre +
                ", apellido=" + apellido +
                ", nit=" + nit +
                ", direccion=" + direccion + "}";

    }
}