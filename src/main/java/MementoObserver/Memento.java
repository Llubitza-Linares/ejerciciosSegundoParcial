package MementoObserver;

public class Memento {
    private Repositorio repositorio;

    public Memento(Repositorio repositorio) {
        this.repositorio=repositorio;
    }

    public Repositorio getState() {
        return repositorio;
    }
}
