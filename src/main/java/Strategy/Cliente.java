package Strategy;

import java.util.LinkedList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        TiendaCelulares tiendaCelulares = new TiendaCelulares(3);

        List<Celular> list = new LinkedList<Celular>();

        list.add(new Celular("A51","Samsung","Media-Alta",500));
        list.add(new Celular("P20","Huawei","Alta",1000));
        list.add(new Celular("S10","Samsung","Media",1200));

        tiendaCelulares.setList(list);

        tiendaCelulares.buscarSegunModelo("A51");
        tiendaCelulares.buscarSegunPrecio(500);

        tiendaCelulares.add(new Celular("A30S","Samsung","Media", 400));

        tiendaCelulares.buscarSegunModelo("A30S");
        tiendaCelulares.buscarSegunPrecio(400);
    }
}