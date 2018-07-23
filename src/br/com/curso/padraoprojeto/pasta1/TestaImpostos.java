package br.com.curso.padraoprojeto.pasta1;

public class TestaImpostos {
	
	public static void main(String[] args) {
		
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();
		Imposto icpp = new ICPP();
		Imposto ikcv = new IKCV();
		Imposto ihit = new IHIT();
		
		Orçamento orçamento = new Orçamento(500.0);
		
		calculaImposto calculador = new calculaImposto();
		
		calculador.fazCalculo(orçamento, iss);
		calculador.fazCalculo(orçamento, icms);
		calculador.fazCalculo(orçamento, icpp);
		calculador.fazCalculo(orçamento, ikcv);
		calculador.fazCalculo(orçamento, ihit);
		
		System.out.println(iccc.calcula(orçamento));
		
	}

}
