package Strategy;

public class Celular {
    private String modelo;
    private String marca;
    private String gama;
    private int precio;

    public Celular(String modelo, String marca, String gama, int precio) {
        super();
        this.modelo = modelo;
        this.marca = marca;
        this.gama = gama;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void showInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Gama: " + gama);
        System.out.println("Precio: " + precio);
        System.out.println();
    }

}
