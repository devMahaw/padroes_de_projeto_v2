package br.com.mdantas.observer;

public interface ISubject {

    public void add(IObserver observer);

    public void remove(IObserver observer);

    public void notifyAll(String titulo);
}
