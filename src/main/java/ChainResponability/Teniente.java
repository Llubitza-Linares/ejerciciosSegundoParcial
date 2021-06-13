package ChainResponability;

public class Teniente implements ICuerpoDeEjercito{
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
        if(accion.equals("Disciplina")){
            System.out.println("El teniente se encarga de la disciplina");
        }else{
            this.next.accion(accion);
        }
    }
}
