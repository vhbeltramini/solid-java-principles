package br.com.vhbeltramini.service;

import br.com.vhbeltramini.ValidacaoException;
import br.com.vhbeltramini.model.Cargo;
import br.com.vhbeltramini.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida) {
        Cargo cargoAtual = funcionario.getCargo();
        if (Cargo.GERENTE == funcionario.getCargo()) {
            throw new ValidacaoException("Gerentes não podem ser promovidos");
        }

        if (metaBatida) {
            funcionario.promover(cargoAtual.getProximoCargo());
        } else {
            throw new ValidacaoException("Funcionario não bateu a meta");
        }
    }

}
