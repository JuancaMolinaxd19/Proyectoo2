package Proyecto2;

import java.util.*;

public class Orden {
    int id;
    Cliente cliente;
    ItemOrden item1;
    ItemOrden item2;
    Date fechaOrden;
    double precioEnvio;
    double total;
    String tipoEnvio;
    String estado;
    static int sigIdOrden;
    int diasEnvio;

    private Orden(){
        sigIdOrden = id;
        total = 0.0;
        Date fecha = new Date();
    }

    private Orden(Date pFecha){
        this();
    }

    double getTotalOrden(){
        total = precioEnvio*item1.getTotalItem();
        return total;
    }



    public Orden(int pCliente, Date pFecha){
        this.cliente.id = pCliente;
        this.fechaOrden = pFecha;
    }
}