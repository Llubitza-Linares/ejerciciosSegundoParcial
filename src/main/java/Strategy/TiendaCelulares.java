package Strategy;

import java.util.LinkedList;
import java.util.List;

public class TiendaCelulares {
    private IModelo iModelo;
    private IPrecio iPrecio;
    private int value;
    private List<Celular> list = new LinkedList<Celular>();


    public TiendaCelulares(int value) {
        this.value = value;
    }

    public void add(Celular celular) {
        list.add(celular);
    }
    public IModelo getiModelo() {
        return iModelo;
    }

    public void setiModelo(IModelo iModelo) {
        this.iModelo = iModelo;
    }

    public IPrecio getiPrecio() {
        return iPrecio;
    }

    public void setiPrecio(IPrecio iPrecio) {
        this.iPrecio = iPrecio;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public List<Celular> getList() {
        return list;
    }

    public void setList(List<Celular> list) {
        this.list = list;
    }

    public void buscarSegunPrecio(int precio) {
        if(list.size()>value) {
            iPrecio = new MuchosPrecios();
        }else {
            iPrecio = new PocosPrecios();
        }
        iPrecio.busquedaPrecio(list, precio);
    }

    public void buscarSegunModelo(String modelo) {
        if(list.size()>value) {
            iModelo = new MuchosModelos();
        }else {
            iModelo = new PocosModelos();
        }
        iModelo.busquedaModelo(list, modelo);
    }
}