package br.com.curso.padraoprojeto.notafiscal;

public class NotaFiscalDao implements ApósGerarNota{
	
	public void executa(NotaFiscal nf){
		System.out.println("Nota salva.");
	}

}
