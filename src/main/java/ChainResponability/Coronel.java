package ChainResponability;

public class Coronel implements ICuerpoDeEjercito{
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
        if(accion.equals("Desbloqueos")){
            System.out.println("El coronel se encarga de los desbloqueos");
        }else if(accion.equals("Manifestaciones")) {
            System.out.println("Ademas el coronel se encarga de las manifestaciones");
        }else{
            this.next.accion(accion);
        }
    }
}
