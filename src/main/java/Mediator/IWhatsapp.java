package Mediator;

public interface IWhatsapp {
    void send( String message, Personas personas);
    void sendGroup(String message, String nombreGrupo, Personas Origen);
}
