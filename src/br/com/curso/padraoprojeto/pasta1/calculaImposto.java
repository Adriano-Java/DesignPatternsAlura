package br.com.curso.padraoprojeto.pasta1;

public class calculaImposto {
	
	public void fazCalculo(Orçamento orçamento, Imposto imposto) {
	double valorImposto = imposto.calcula(orçamento);
	System.out.println(valorImposto);
	}

}
