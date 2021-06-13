package ChainResponability;

public class Cabo implements ICuerpoDeEjercito{
    private ICuerpoDeEjercito next;


    @Override
    public void setNext(ICuerpoDeEjercito iCuerpoDeEjercito) {

        this.next=iCuerpoDeEjercito;
    }

    @Override
    public ICuerpoDeEjercito next() {
        return next;
    }

    @Override
    public void accion(String accion) {
        if(accion.equals("Limpieza")){
            System.out.println("El cabo se esta encargando de la limpieza");
        }else{
            this.next.accion(accion);
        }
    }
}
