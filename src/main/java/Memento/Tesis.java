package Memento;

public class Tesis {
    private String fecha;
    private String contenido;

    public Tesis(String fecha, String contenido){
        super();
        this.fecha=fecha;
        this.contenido=contenido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void showInfo(){
        System.out.println("Fecha: "+fecha);
        System.out.println("Contenido: "+contenido);
    }
}
