package br.com.mdantas.templatemethod;

public abstract class Trabalhador {

    public void executarRotina() {
        levantar();
        iniciarRotina();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();
    }

    protected abstract void trabalhar();

    protected void irAoTrabalho() {
        System.out.println("Indo trabalhar.");
    }

    protected void voltarParaCasa() {
        System.out.println("Voltando pra casa.");
    }

    protected void levantar() {
        System.out.println("Levantando da cama.");
    }

    protected void iniciarRotina() {
        System.out.println("Iniciando Rotina.");
    }
}
