package br.com.banco.investimentos.relatorio;

import java.util.Calendar;
import java.util.List;

import br.com.banco.investimentos.conta.Conta;

public class RelatórioComplexo extends Relatório{

	@Override
	protected void cabecalho() {
		System.out.println("Banco XYZ");
		System.out.println("Avenida Paulista, 1234");
		System.out.println("(11) 1234-5678");
	}

	@Override
	protected void rodape() {
		System.out.println("banco@xyz.com.br");
		System.out.println(Calendar.getInstance().getTime());
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for (Conta conta: contas) {
		System.out.println(conta.getNome() + " - " + conta.getNumero() + " - " + conta.getAgencia());
		}
	}

}
