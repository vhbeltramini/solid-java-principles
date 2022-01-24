package br.com.vhbeltramini.service;

import br.com.vhbeltramini.ValidacaoException;
import br.com.vhbeltramini.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste {

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        if (ChronoUnit.MONTHS.between(funcionario.getDataUltimoReajuste(), LocalDate.now()) < 6) {
            throw new ValidacaoException("Reajuste somente pode ocorrer em um periodo maior que 6 meses desde o ultimo reajuste");
        }
    }


}
