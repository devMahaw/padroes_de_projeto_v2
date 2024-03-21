package br.com.mdantas.observer;

public class Tv implements IObserver {

    @Override
    public void update(ISubject subject) {
        System.out.println("Recebendo a notícia via TV" + subject.toString());
    }
}
