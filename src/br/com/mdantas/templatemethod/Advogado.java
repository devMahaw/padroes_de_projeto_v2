package br.com.mdantas.templatemethod;

public class Advogado extends Trabalhador {

    @Override
    public void executarRotina() {
        System.out.println("Curtindo as férias!");
    }

    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como advogado.");
    }

    @Override
    protected void irAoTrabalho() {
        System.out.println("Indo ao trabalho de moto.");
    }

    @Override
    protected void voltarParaCasa() {
        System.out.println("Voltando pra casa de moto.");
    }

    @Override
    protected void levantar() {
        System.out.println("Levantando as 05h.");
    }

    @Override
    protected void iniciarRotina() {
        System.out.println("Iniciando Rotina as 05:30h.");
    }
}
