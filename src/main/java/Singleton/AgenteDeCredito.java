package Singleton;

public class AgenteDeCredito implements IBanco{
    private IBanco next;

    @Override
    public void setNext(IBanco banco) {
        next=banco;

    }

    @Override
    public IBanco next() {
        return next;
    }

    @Override
    public void pagar(double monto, double prestamoInicial) {
        double prestamoActual = Banco.getInstance().getPrestamo() - monto;
        if ((prestamoInicial - prestamoActual) < prestamoInicial / 2) {
            System.out.println("El agente de credito recibe pago y ofrece refinanciar el préstamo");
            Banco.getInstance().pagarDeuda(monto);
        } else {
            next.pagar(monto, prestamoInicial);
        }
    }

}