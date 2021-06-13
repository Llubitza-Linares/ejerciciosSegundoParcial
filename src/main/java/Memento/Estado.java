package Memento;

public class Estado {
    private Tesis tesis;

    public Estado(Tesis tesis){
        this.tesis=tesis;

    }

    public Tesis getTesis(){
        return tesis;

    }
}
