package Mediator;

public abstract class Personas {
    protected IWhatsapp mediator;

    public Personas(IWhatsapp mediator){
        this.mediator=mediator;
    }

    public abstract void sendPerson(String message,Personas destino);

    public abstract void sendGroup(String message,String grupo);


    public abstract void messageReceived(String message);
}