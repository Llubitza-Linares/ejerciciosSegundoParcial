package Singleton;

public interface IBanco {
    void setNext(IBanco banco);
    IBanco next();
    void pagar(double monto,double prestamoInicial);
}
