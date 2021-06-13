package ChainResponability;

public interface ICuerpoDeEjercito {
    void setNext(ICuerpoDeEjercito iCuerpoDeEjercito);
    ICuerpoDeEjercito next();

    void accion(String accion);
}
