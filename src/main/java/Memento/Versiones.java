package Memento;

import java.util.ArrayList;
import java.util.List;

public class Versiones {
    private List<Estado> list = new ArrayList<>();

    public void addMemento(Estado estado){
        list.add(estado);
    }

    public Estado getVersion(int position){
        return list.get(position);
    }
}
