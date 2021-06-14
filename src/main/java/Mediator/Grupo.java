package Mediator;

import java.util.LinkedList;
import java.util.List;

public class Grupo  {

    List<Personas> grupo = new LinkedList<>();
    String nombre;

    public Grupo(String nombre) {
        this.nombre = nombre;
    }

    public List<Personas> getGrupo() {
        return grupo;
    }

    public void setGrupo(List<Personas> grupo) {
        this.grupo = grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}