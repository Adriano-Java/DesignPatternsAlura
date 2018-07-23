package br.com.curso.padraoprojeto.pasta1;

import br.com.curso.padraoprojeto.pasta2.Item;

public class TestaDescontos {
	
	public static void main(String[] args) {
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		
		Or�amento or�amento = new Or�amento(500.0);
		or�amento.adicionaItem(new Item("CANETA", 250.0));
		or�amento.adicionaItem(new Item("LAPIS", 250.0));
		
		double desconto = calculador.calcula(or�amento);
		
		System.out.println(desconto);
	}

}
