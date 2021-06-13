package Memento;

public class Originator {
    private Tesis tesis;

    public void setState(Tesis tesis){
        System.out.println("Establecer Estado: ");
        tesis.showInfo();
        this.tesis=tesis;

    }

    public Estado createVersion(){
        System.out.println("Crear Version: ");
        tesis.showInfo();
        return new Estado(this.tesis);

    }

    public void restoreMemento(Estado estado){
        this.tesis=estado.getTesis();
        System.out.println("Estado Restablecido: ");
        this.tesis.showInfo();
    }
}
