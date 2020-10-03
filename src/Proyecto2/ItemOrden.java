package Proyecto2;

public class ItemOrden {
    int noLinea;
    int cantidad;
    double total;

    Producto producto;


    public ItemOrden(int pNoLinea, int pCantidad, int pldProducto){
        this.noLinea = pNoLinea;
        this.cantidad = pCantidad;

        producto = DataSistema.listaProductos(pldProducto);
    }

    double getTotalItem(){
        total = producto.getPrecioUnitario()*cantidad;
        return total;
    }

    public String toString(){
        return "["+Utilerias.getNombreClase(ItemOrden.class)+"]"+
                " {No. de Lineas= "+noLinea+
                ", cantidad = "+cantidad+
                ", Precio Unitario = "+producto.getPrecioUnitario()+"}";
    }
}