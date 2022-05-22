package cts.observer;

public interface Subject {
    public void aboneazaObserver(cts.observer.Observer observer);
    public void dezaboneazaObserver(cts.observer.Observer observer);
    public void notify(String mesaj);
}
