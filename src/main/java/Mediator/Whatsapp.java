package Mediator;

import java.util.LinkedList;
import java.util.List;

public class Whatsapp implements IWhatsapp {

    private List<Grupo> grupos = new LinkedList<Grupo>();

    public void addGrupo(Grupo grupo) {
        grupos.add(grupo);
    }

    @Override
    public void send(String message, Personas personas) {
        personas.messageReceived(message);
    }

    @Override
    public void sendGroup(String message, String nombreGrupo, Personas origen) {
        Grupo grupoActual = new Grupo("");
        for (Grupo grupo : grupos) {
            if (grupo.getNombre().equals(nombreGrupo)) {
                grupoActual = grupo;
                break;
            }
        }
        for (Personas personas : grupoActual.getGrupo()) {
            if (!personas.equals(origen)) {
                personas.messageReceived(message);
            }
        }
    }
}

