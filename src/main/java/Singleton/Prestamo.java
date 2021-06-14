package Singleton;

public class Prestamo implements IBanco {
    private IBanco next;

    @Override
    public void setNext(IBanco banco) {
        this.next = banco;
    }

    @Override
    public IBanco next() {
        return next;
    }

    @Override
    public void pagar(double monto, double prestamoInicial) {

        Cajero cajero = new Cajero();
        this.setNext(cajero);

        AgenteDeCredito agenteDeCredito = new AgenteDeCredito();
        cajero.setNext(agenteDeCredito);

        Supervisor supervisor = new Supervisor();
        agenteDeCredito.setNext(supervisor);

        EncargadoDePrestamo encargadoDePrestamo= new EncargadoDePrestamo();
        supervisor.setNext(encargadoDePrestamo);

        this.next.pagar(monto, Banco.getInstance().getPrestamoInicial());
    }

}