package br.com.curso.padraoprojeto.notafiscal;

public class Impressora implements ApósGerarNota{
	
	public void executa(NotaFiscal nf){
		System.out.println("Nota impressa.");
	}

}
