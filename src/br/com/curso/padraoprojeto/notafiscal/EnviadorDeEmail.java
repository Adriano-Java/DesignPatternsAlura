package br.com.curso.padraoprojeto.notafiscal;

public class EnviadorDeEmail implements Ap�sGerarNota {
	
	public void executa(NotaFiscal nf){
		System.out.println("Nota enviada por email.");
	}

}
