package Strategy;

import java.util.List;

public class PocosPrecios implements IPrecio {

    @Override
    public void busquedaPrecio(List<Celular> list, int precio) {
        System.out.println("Buscando entre pocos celulares según el precio: " + precio);
        for (Celular celular : list) {
            if (celular.getPrecio() == precio) {
                celular.showInfo();
            }
        }

    }

}