package MementoObserver;
public class Client {
    public static void main(String[] args) {

        Version version = new Version();
        Originator originator = new Originator();

        Repositorio repositorio;

        repositorio = new Repositorio(1, "commit inicial");
        originator.setState(repositorio);
        version.addMemento(originator.createVersion());

        repositorio = new Repositorio(2, "segundo commit");
        originator.setState(repositorio);
        version.addMemento(originator.createVersion());

        repositorio = new Repositorio(3, "tercer commit");
        originator.setState(repositorio);
        version.addMemento(originator.createVersion());

        repositorio = new Repositorio(4, "cuarto commit");
        originator.setState(repositorio);
        version.addMemento(originator.createVersion());

        repositorio = new Repositorio(5, "quinto commit");
        originator.setState(repositorio);
        version.addMemento(originator.createVersion());

        Desarrollador desarrollador1 = new Desarrollador("Diana");
        Desarrollador desarrollador2 = new Desarrollador("Cecilia");
        Desarrollador desarrollador3 = new Desarrollador("Rodrigo");

        originator.attach(desarrollador1);
        originator.attach(desarrollador2);
        originator.attach(desarrollador3);

        originator.restoreFromMemento(version.getVersion(0));

        originator.deattach(desarrollador1);
        originator.deattach(desarrollador2);
        originator.deattach(desarrollador3);

        Desarrollador desarrollador4 = new Desarrollador("Camila");
        Desarrollador desarrollador5 = new Desarrollador("Alejandro");
        Desarrollador desarrollador6 = new Desarrollador("Cecilia");

        originator.attach(desarrollador4);
        originator.attach(desarrollador5);
        originator.attach(desarrollador6);

        originator.restoreFromMemento(version.getVersion(4));

    }
}