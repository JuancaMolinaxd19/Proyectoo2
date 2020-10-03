package Proyecto2;

public class Producto {
    private static int sigIdProducto = 2000;
    private int id;
    private String nombreProducto;
    private int precioUnitario;


    //agregar un constructor sin parametros
    public Producto() {
        sigIdProducto++;
        id = sigIdProducto;//asignar valor a la propiedad id
    }//cerrar constructor 1


    //agregar un constructor con los parametros necesarios
    public Producto(String nombreProducto, int precioUnitario) {
        this();//asignar id utilizando constructor 1
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
    }//cerrar constructor 2

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    String getNombreProducto() {
        return nombreProducto;
    }

    int getId() {
        return id;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public String getNombreClase() {
       //obtiene el nombre de la clase actual
        return this.getClass().getSimpleName();
    }

    public String toString() {
        String cadena = "[" + Utilerias.getNombreClase(Producto.class) + "]" + "id = " + id + ", nombre = " + nombreProducto + ", Precio Unitario = " + precioUnitario;
        return cadena;
    }
}