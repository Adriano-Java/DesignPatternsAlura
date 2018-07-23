package br.com.curso.padraoprojeto.notafiscal;

public class EnviaPorSms implements ApósGerarNota{
	
	public void executa(NotaFiscal nf){
		System.out.println("Nota enviada pro SMS.");
	}

}
