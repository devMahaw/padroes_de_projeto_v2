package br.com.mdantas.observer;

public class Newsletter implements IObserver {

    @Override
    public void update(ISubject subject) {
        System.out.println("Recebendo a notícia via Newsletter" + subject.toString());
    }
}
