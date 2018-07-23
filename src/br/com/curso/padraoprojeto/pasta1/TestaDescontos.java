package br.com.curso.padraoprojeto.pasta1;

import br.com.curso.padraoprojeto.pasta2.Item;

public class TestaDescontos {
	
	public static void main(String[] args) {
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		
		Orçamento orçamento = new Orçamento(500.0);
		orçamento.adicionaItem(new Item("CANETA", 250.0));
		orçamento.adicionaItem(new Item("LAPIS", 250.0));
		
		double desconto = calculador.calcula(orçamento);
		
		System.out.println(desconto);
	}

}
