package br.com.curso.padraoprojeto.pasta1;

public class calculaImposto {
	
	public void fazCalculo(Or�amento or�amento, Imposto imposto) {
	double valorImposto = imposto.calcula(or�amento);
	System.out.println(valorImposto);
	}

}
