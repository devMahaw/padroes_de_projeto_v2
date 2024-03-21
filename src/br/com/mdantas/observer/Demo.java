package br.com.mdantas.observer;

public class Demo {

    public static void main(String[] args) {
        Jornalista jornalista = new Jornalista();
        jornalista.add(new Tv());
        jornalista.add(new Newsletter());
        jornalista.notifyAll("Loja é assaltada em São Paulo.");
    }
}
