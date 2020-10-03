package Proyecto2;
import java.util.*;

public class DataSistema {
    public static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    public static ArrayList<Cliente> Empresa = new ArrayList<Cliente>();
    public static ArrayList<Producto> Productos = new ArrayList<Producto>();
    public static ArrayList<Orden> listaOrden = new ArrayList<Orden>();

    public static void main(String[] args) {

        // crea 4 clientes de tipo individual

        listaClientes.add(new Individual("Juan","Molina","85642879","2 Av B calle 0-10 zona 2","5821389512389"));
        listaClientes.add(new Individual("Victor","Gonzales","77522189","3 Av A calle 2-11 zona 1","7785213881865"));
        listaClientes.add(new Individual("Kelly","Blanco","88213568","4 AV calle 1-35 zona 14","2156531788921"));
        listaClientes.add(new Individual("Julio","Moreno","72325842","6 AV B calle 2-11 zona 13","5686508732578"));

        //crear 4 clientes de tipo empresa

        Empresa.add(new Empresa("Pedro","Caliz","12345678","7 Av 0-15 zona 5 Pamplona","Telus",5));
        Empresa.add(new Empresa("Derek","Hernandez","98770236","2 Av B zona 10","Intelaf",10));
        Empresa.add(new Empresa("Cristopher","Viera","9874653","8 calle zona 21","Cemaco",7));
        Empresa.add(new Empresa("Pablo","Monchi","87263548","10 calle AV B zona 7","Max",3));


        // crea 8 productos y los agrega a la lista de productos

        Productos.add(new Producto("Retrovisor",75));
        Productos.add(new Producto("LLantas",250));
        Productos.add(new Producto("Ventanas",400));
        Productos.add(new Producto("Transmision",1300));
        Productos.add(new Producto("Suspencion",1500));
        Productos.add(new Producto("Luces",400));
        Productos.add(new Producto("Timon",500));
        Productos.add(new Producto("Aros",1000));


    }


    public static Producto listaProductos(int pIdProducto) {
        Producto producto = new Producto();
        for (Producto temp: Productos
        ) { if (temp.getId()==pIdProducto){
            producto = temp;
        }
        }
        return producto;
    }


}
