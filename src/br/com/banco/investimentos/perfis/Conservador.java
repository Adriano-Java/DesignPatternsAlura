package br.com.banco.investimentos.perfis;

import br.com.banco.investimentos.conta.Conta;
import br.com.banco.investimentos.interfaces.Investimento;

public class Conservador implements Investimento {

	@Override
	public double calcula(Conta conta) {
		return conta.getSaldo() * 0.008;
	}

}
