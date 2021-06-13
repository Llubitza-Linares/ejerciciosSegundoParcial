package ChainResponability;

public class General implements ICuerpoDeEjercito{
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
        if(accion.equals("Entrevistas")){
            System.out.println("El general se encarga de las entrevistas");
        }else{
            this.next.accion(accion);
        }
    }
}
