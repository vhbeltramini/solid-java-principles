package br.com.vhbeltramini.service;

import br.com.vhbeltramini.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

    void validar(Funcionario funcionario, BigDecimal aumento);

}
