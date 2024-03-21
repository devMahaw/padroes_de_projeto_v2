package br.com.mdantas.templatemethod;

public class Policial extends Trabalhador {

    protected void trabalhar() {
        System.out.println("Trabalhando como policial.");
    }

    @Override
    protected void levantar() {
        System.out.println("Levantando da cama as 08h.");
    }
}
