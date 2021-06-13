package MementoObserver;

import java.util.ArrayList;
import java.util.List;

public class Originator implements IVersion {
    private Repositorio repositorio;
    private List<IDesarrollador> observerList = new ArrayList<>();

    public void setState(Repositorio repositorio) {
        System.out.println("Establecer Estado");
        repositorio.showInfo();
        this.repositorio = repositorio;
    }

    public Memento createVersion() {
        System.out.println("Crear Version");
        repositorio.showInfo();
        return new Memento(this.repositorio);
    }

    public void restoreFromMemento(Memento version) {
        this.repositorio = version.getState();
        System.out.println("Estado Restaurado");
        this.repositorio.showInfo();
        this.notifyObserver(repositorio.getVersion());
    }

    @Override
    public void notifyObserver(int version) {
        System.out.println("**** Notificando usuarios ****");
        for (IDesarrollador observer : observerList) {
            observer.update("Se ha restaurado la version: " + version);
        }
    }

    @Override
    public void attach(IDesarrollador observer) {
        observerList.add(observer);

    }

    @Override
    public void deattach(IDesarrollador observer) {
        observerList.remove(observer);

    }
}