package br.com.vhbeltramini.model;

import java.math.BigDecimal;

public class Terceirizado  {

    private DadosPessoais dadosPessoais;

    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
    }
}
