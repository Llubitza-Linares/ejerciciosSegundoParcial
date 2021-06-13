package ChainResponability;

public class CadenaDeMando implements ICuerpoDeEjercito{
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

        General general=new General();
        this.setNext(general);

        Teniente teniente =new Teniente();
        general.setNext(teniente);

        Coronel coronel=new Coronel();
        teniente.setNext(coronel);

        Cabo cabo =new Cabo();
        coronel.setNext(cabo);

        this.next.accion(accion);
    }
}
