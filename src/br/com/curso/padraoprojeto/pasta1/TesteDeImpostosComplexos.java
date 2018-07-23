package br.com.curso.padraoprojeto.pasta1;

public class TesteDeImpostosComplexos {
	
	public static void main(String[] args) {
		Imposto iss = new ISS(new ICMS(new ICPP()));
		Imposto impostos = new ImpostoMuitoAlto(new ICMS());
		
		Or�amento or�amento = new Or�amento(500);
		
		double valor = iss.calcula(or�amento);
		
		System.out.println(valor);
		System.out.println(impostos.calcula(or�amento));
	}

}
