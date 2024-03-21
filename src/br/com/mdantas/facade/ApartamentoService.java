package br.com.mdantas.facade;

public class ApartamentoService implements IApartamentoService {

    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {
        Boolean isCadastrado = isApartamentoCadastrado(apartamento);
        Boolean isCamposValidos = isCamposValidos(apartamento);
        if (isCadastrado && !isCamposValidos) {
            return false;
        };

        return cadastrarNoBanco(apartamento);

    }

    private Boolean cadastrarNoBanco(Apartamento apartamento) {
        //Lógica de cadastro
        return true;
    }

    private Boolean isApartamentoCadastrado(Apartamento apartamento) {
        //Ir no banco e verificar se está cadastrado
        return false;
    }

    private Boolean isCamposValidos(Apartamento apartamento) {
        //Lógica da validade dos campos do apartamento
        return true;
    }
}
