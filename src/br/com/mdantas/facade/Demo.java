package br.com.mdantas.facade;

public class Demo {

    public static void main(String[] args) {
        IApartamentoService service = new ApartamentoService();
        service.cadastrarApartamento(new Apartamento(1l, "Endereço"));
    }
}
