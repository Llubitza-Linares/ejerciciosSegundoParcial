package Memento;

public class Client {
    public static void main(String[] args) {
        Versiones versiones= new Versiones();
        Originator originator= new Originator();

        Tesis tesis;
        tesis=new Tesis("13/1/2021","Primera Version");
        originator.setState(tesis);
        versiones.addMemento(originator.createVersion());

        tesis=new Tesis("13/2/2021","Segunda Version");
        originator.setState(tesis);
        versiones.addMemento(originator.createVersion());

        tesis=new Tesis("13/3/2021","Tercera Version");
        originator.setState(tesis);
        versiones.addMemento(originator.createVersion());

        tesis=new Tesis("13/4/2021","Cuarta Version");
        originator.setState(tesis);
        versiones.addMemento(originator.createVersion());

        tesis=new Tesis("13/5/2021","Quinta Version");
        originator.setState(tesis);
        versiones.addMemento(originator.createVersion());

        originator.restoreMemento(versiones.getVersion(2));
    }
}
