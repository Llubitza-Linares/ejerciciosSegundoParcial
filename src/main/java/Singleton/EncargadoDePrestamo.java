package Singleton;

public class EncargadoDePrestamo implements IBanco {
    private IBanco next;

    @Override
    public void setNext(IBanco banco) {
        next = banco;

    }

    @Override
    public IBanco next() {
        return next;
    }

    @Override
    public void pagar(double monto, double prestamoInicial) {
        System.out.println("El encargado devuelve los documentos");

    }
}
