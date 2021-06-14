package Singleton;

public class Cliente {
    public static void main(String[] args) {
        Prestamo prestamo= new Prestamo();
        Banco.getInstance().setPrestamoInicial(1000);
        prestamo.pagar(50, 1000);
        prestamo.pagar(100, 1000);
        prestamo.pagar(100, 1000);
        prestamo.pagar(200, 1000);
        prestamo.pagar(100, 1000);
        prestamo.pagar(100, 1000);
        prestamo.pagar(50, 1000);
        prestamo.pagar(30, 1000);
        prestamo.pagar(10, 1000);
        prestamo.pagar(50, 1000);
        prestamo.pagar(100, 1000);
        prestamo.pagar(100, 1000);
        prestamo.pagar(10, 1000);
        prestamo.pagar(1, 1000);

    }
}
