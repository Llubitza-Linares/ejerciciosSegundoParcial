package MementoObserver;

public class Repositorio {
    private int version;
    private String codigo;

    public Repositorio(int version, String codigo){
        super();
        this.version=version;
        this.codigo=codigo;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void showInfo(){
        System.out.println("Version");
        System.out.println(version);
        System.out.println("Codigo");
        System.out.println(codigo);
    }
}