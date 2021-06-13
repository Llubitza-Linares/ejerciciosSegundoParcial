package Strategy;

import java.util.List;

public class PocosModelos implements IModelo {

    @Override
    public void busquedaModelo(List<Celular> list, String modelo) {
        System.out.println("Buscando entre pocos celulares según el modelo: " + modelo);
        for (Celular celular : list) {
            if (celular.getModelo().equals(modelo)) {
                celular.showInfo();
            }
        }

    }

}