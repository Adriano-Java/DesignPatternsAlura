package br.com.curso.padraoprojeto.pasta1;

public class TestaImpostos {
	
	public static void main(String[] args) {
		
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();
		Imposto icpp = new ICPP();
		Imposto ikcv = new IKCV();
		Imposto ihit = new IHIT();
		
		Or�amento or�amento = new Or�amento(500.0);
		
		calculaImposto calculador = new calculaImposto();
		
		calculador.fazCalculo(or�amento, iss);
		calculador.fazCalculo(or�amento, icms);
		calculador.fazCalculo(or�amento, icpp);
		calculador.fazCalculo(or�amento, ikcv);
		calculador.fazCalculo(or�amento, ihit);
		
		System.out.println(iccc.calcula(or�amento));
		
	}

}
