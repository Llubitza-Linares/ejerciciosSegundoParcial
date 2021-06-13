package MementoObserver;

    public interface IVersion {
        void attach(IDesarrollador observer);
        void deattach(IDesarrollador observer);
        void notifyObserver(int version);
    }
