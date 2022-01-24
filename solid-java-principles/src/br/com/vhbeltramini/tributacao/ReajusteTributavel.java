package br.com.vhbeltramini.tributacao;

import java.math.BigDecimal;

public interface ReajusteTributavel extends Reajuste {

    BigDecimal valorImpostoDeRenda();

}
