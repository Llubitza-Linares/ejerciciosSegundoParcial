package Mediator;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Whatsapp whatsapp = new Whatsapp();

        Personas personas1 = new UsuarioWhatsapp(whatsapp, "Ale");
        Personas personas2 = new UsuarioWhatsapp(whatsapp, "Gabi");
        Personas personas3 = new UsuarioWhatsapp(whatsapp, "Mish");
        Personas personas4 = new UsuarioWhatsapp(whatsapp, "Chiri");
        Personas personas5 = new UsuarioWhatsapp(whatsapp, "Llubi");
        Personas personas6 = new UsuarioWhatsapp(whatsapp, "Natu");
        Personas personas7 = new UsuarioWhatsapp(whatsapp, "Nao");
        Personas personas8 = new UsuarioWhatsapp(whatsapp, "Valvas");
        Personas personas9 = new UsuarioWhatsapp(whatsapp, "Garguis");
        Personas personas10 = new UsuarioWhatsapp(whatsapp, "Ednita");

        List<Personas> list = new LinkedList<Personas>();

        list.add(personas1);
        list.add(personas2);
        list.add(personas3);
        list.add(personas4);
        list.add(personas5);
        list.add(personas6);
        list.add(personas7);
        list.add(personas8);
        list.add(personas9);
        list.add(personas10);

        Grupo grupo1 = new Grupo("Amix");

        grupo1.setGrupo(list);

        whatsapp.addGrupo(grupo1);

        personas1.sendPerson("Hola tuuuuuu", personas2);

        personas10.sendGroup("S.O.S", grupo1.getNombre());

    }
}