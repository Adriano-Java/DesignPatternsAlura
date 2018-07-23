package br.com.curso.padraoprojeto.notafiscal;

public class EnviadorDeEmail implements ApósGerarNota {
	
	public void executa(NotaFiscal nf){
		System.out.println("Nota enviada por email.");
	}

}
