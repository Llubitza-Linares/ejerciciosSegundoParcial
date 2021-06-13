package ChainResponability;

public class Cliente {
    public static void main(String[] args) {
        CadenaDeMando cadenaDeMando=new CadenaDeMando();

        cadenaDeMando.accion("Entrevistas");
        cadenaDeMando.accion("Disciplina");
        cadenaDeMando.accion("Desbloqueos");
        cadenaDeMando.accion("Manifestaciones");
        cadenaDeMando.accion("Limpieza");
    }
}
