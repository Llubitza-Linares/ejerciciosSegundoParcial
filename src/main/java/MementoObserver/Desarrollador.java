package MementoObserver;

public class Desarrollador implements IDesarrollador {
    private String nombre;

    public Desarrollador(String nombre){
        this.nombre=nombre;
    }
    @Override
    public void update(String message) {
        System.out.println(nombre);
        System.out.println("Recibio la actualizacion del repositorio");
        System.out.println(message);
    }
}