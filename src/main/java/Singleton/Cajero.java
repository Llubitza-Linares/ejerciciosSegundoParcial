package Singleton;
public class Cajero implements IBanco {
    private IBanco
            next;

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
        double prestamoActual = Banco.getInstance().getPrestamo() - monto;
        if ((prestamoInicial - prestamoActual) < prestamoInicial / 4) {
            System.out.println("Los cajeros estan procesando su pago");
            Banco.getInstance().pagarDeuda(monto);
        } else {
            next.pagar(monto, prestamoInicial);
        }
    }
}
