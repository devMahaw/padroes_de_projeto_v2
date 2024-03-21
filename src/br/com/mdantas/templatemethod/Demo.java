package br.com.mdantas.templatemethod;

public class Demo {

    public static void main(String[] args) {
        Trabalhador t = new Policial();
        Trabalhador t2 = new Bombeiro();
        Trabalhador t3 = new Advogado();

        System.out.println("---------------------------");
        System.out.println("Rotina do Policial");
        System.out.println("---------------------------");
        t.executarRotina();
        System.out.println("---------------------------");
        System.out.println("Rotina do Bombeiro");
        System.out.println("---------------------------");
        t2.executarRotina();
        System.out.println("---------------------------");
        System.out.println("Rotina do Advogado");
        System.out.println("---------------------------");
        t3.executarRotina();
    }
}
