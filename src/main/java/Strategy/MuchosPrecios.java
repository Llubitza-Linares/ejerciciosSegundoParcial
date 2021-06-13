package Strategy;

import java.util.List;

public class MuchosPrecios implements IPrecio {

    @Override
    public void busquedaPrecio(List<Celular> list, int precio) {
        System.out.println("Buscando entre varios celulares según el precio: "+precio);
        for (Celular celular : list) {
            if (celular.getPrecio() == precio) {
                celular.showInfo();
            }
        }

    }

}